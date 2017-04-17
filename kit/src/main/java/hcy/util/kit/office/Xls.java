package hcy.util.kit.office;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import util.StringUtil;

/**
 * xls便捷生成工具
 *
 * Pojo是一个对象，参数实现XlsSheet和XlsCell
 * new Xls(List<Pojo> list).create2Byte()
 * new Xls(List<Pojo> list, List<Pojo2> list2).create2File(path)
 *
 * Created by lxc on 2017/1/2.
 */
public class Xls {

	HSSFWorkbook wb = new HSSFWorkbook();

	public Xls(List... lists) {
		for (List list : lists) {
			if (list.isEmpty()) {
				continue;
			}
			Class clazz = list.get(0).getClass();
			this.createSheet(list, clazz);
		}
	}
	
	public byte[] create2Byte() {
		ByteArrayOutputStream os = null;
		try {
			os = new ByteArrayOutputStream();
			wb.write(os);
			return os.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os!=null){
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return  null;
	}
	
	public void create2File(String path) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(path);
			wb.write(os);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private <T> void createSheet(List<T> list, Class<T> clazz) {
		XlsSheet xlsSheet = (XlsSheet) clazz.getAnnotation(XlsSheet.class);
		HSSFSheet sheet = wb.createSheet(xlsSheet.name());
		// 创建第一行表头
		HSSFRow row = sheet.createRow(0);
		Field[] fileds = clazz.getDeclaredFields();
		for (int i = 0; i < fileds.length; i++) {
			if (fileds[i].isAnnotationPresent(XlsCell.class)) {
				XlsCell xlsCell = fileds[i].getAnnotation(XlsCell.class);
				row.createCell(i).setCellValue(xlsCell.name());
			}
		}
		// 创建数据
		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(i + 1);
			try {
				for (int j = 0; j < fileds.length; j++) {
					if (fileds[j].isAnnotationPresent(XlsCell.class)) {
						Method method = clazz.getDeclaredMethod(StringUtil.getGetMethod(fileds[j].getName()));
						row.createCell(j).setCellValue(method.invoke(list.get(i)).equals(null)?"":method.invoke(list.get(i)).toString());
					}
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}

}

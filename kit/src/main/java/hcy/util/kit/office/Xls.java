package hcy.util.kit.office;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * xls便捷生成工具
 *
 * Created by lxc on 2017/1/2. 
 * 1.修改单页65535上限bug
 * 2.解决空cell情况
 * 3.修改sheetName相同报错bug
 * Updated by lxc on 2017/5/18.
 */
public class Xls {

	private HSSFWorkbook wb = new HSSFWorkbook();

	/**
	 * 单页最大行数
	 */
	private static int MAX_ROW = 60000;

	private HashMap<String, Integer> sheetMap = new HashMap<>();

	private List<List> dataLists = new ArrayList<>();

	public Xls(List... lists) {
		for (List list : lists) {
			if (list.isEmpty()) {
				continue;
			}
			int sheetNum = 0;
			while (list.size() - sheetNum * MAX_ROW >= MAX_ROW) {
				dataLists.add(list.subList(sheetNum * MAX_ROW, (sheetNum + 1) * MAX_ROW));
				sheetNum++;
			}
			dataLists.add(list.subList(sheetNum * MAX_ROW, list.size()));
		}
		for (List dataList : dataLists) {
			Class clazz = dataList.get(0).getClass();
			this.createSheet(dataList, clazz);
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
			if (os != null) {
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public void create2File(String path) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(path);
			wb.write(os);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
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
		HSSFSheet sheet = null;
		if (sheetMap.containsKey(xlsSheet.name())) {
			sheet = wb.createSheet(xlsSheet.name() + (sheetMap.get(xlsSheet.name()) + 1));
		} else {
			sheet = wb.createSheet(xlsSheet.name());
			sheetMap.put(xlsSheet.name(), 1);
		}
		// 创建第一行表头
		HSSFRow row = sheet.createRow(0);
		Field[] fileds = clazz.getDeclaredFields();
		List<Field> fieldList = new ArrayList<>();
		// 取出所有有注解的filed
		for (int i = 0; i < fileds.length; i++) {
			if (fileds[i].isAnnotationPresent(XlsCell.class)) {
				fieldList.add(fileds[i]);
			}
		}
		for(int i=0;i<fieldList.size();i++) {
			XlsCell xlsCell = fieldList.get(i).getAnnotation(XlsCell.class);
			row.createCell(i).setCellValue(xlsCell.name());
		}
		// 创建数据
		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(i + 1);
			try {
				for (int j = 0; j < fieldList.size(); j++) {
					Method method = clazz.getDeclaredMethod(getGetMethod(fieldList.get(j).getName()));
					if (method.invoke(list.get(i)) == null)
						row.createCell(j).setCellValue("");
					else {
						if (method.invoke(list.get(i)) instanceof Date)
							row.createCell(j).setCellValue(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(method.invoke(list.get(i))));
						else
							row.createCell(j).setCellValue(method.invoke(list.get(i)).toString());
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

	public static String getGetMethod(String methodName) {
		return "get" + methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
	}

	public static String getSetMethod(String methodName) {
		return "set" + methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
	}
}

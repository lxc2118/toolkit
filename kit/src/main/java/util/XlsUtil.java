package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.util.CellAddress;

public class XlsUtil {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("res/test.xls");
			POIFSFileSystem ts = new POIFSFileSystem(fis);
			HSSFWorkbook wb = new HSSFWorkbook(ts);
			List<HSSFPictureData> hssfPictureDatas = wb.getAllPictures();
			int i = 1;
			// 保存当前xls中所有的图片
//			for (HSSFPictureData hssfPictureData : hssfPictureDatas) {
//				// 图片类型
//				// System.out.println(hssfPictureData.getMimeType());
//				File file = new File("res/" + i + ".jpg");
//				FileOutputStream fos = new FileOutputStream(file);
//				fos.write(hssfPictureData.getData());
//				fos.flush();
//				fos.close();
//				i++;
//			}
			// 输出每个sheet中的图片
			HSSFSheet sh = wb.getSheetAt(0);
//			List<HSSFShape> hssfShapes = sh.getDrawingPatriarch().getChildren();
//			for (HSSFShape hssfShape : hssfShapes) {
//				if (hssfShape instanceof HSSFPicture) {
//					HSSFPicture pic = (HSSFPicture) hssfShape; 
//					// 当前pic在wb.getAllPictures()中的idx
//					// System.out.println("pic idx ----" + pic.getPictureIndex());
//					File file = new File("res/" + i + ".jpg");
//					FileOutputStream fos = new FileOutputStream(file);
//					fos.write(pic.getPictureData().getData());
//					fos.flush();
//					fos.close();
//					i++;
//				}
//			}
//			CellAddress address = new CellAddress(0, 0);
//			HSSFComment comment = sh.getCellComment(address);
//			System.out.println(comment instanceof HSSFPicture);
//			comment.getPatriarch()
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static HSSFWorkbook create(String[] titles) {
		HSSFWorkbook wb = new HSSFWorkbook(); //or new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet();
        // Create a row and put some cells in it. Rows are 0 based.
		HSSFRow row = sheet.createRow(0);
		for(int i=0;i<titles.length;i++) {
			row.createCell(i).setCellValue(titles[i]);
		}
		return wb;
        // Create a cell and put a value in it.
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        wb.write(os);
//        InputStream is = new ByteArrayInputStream(os.toByteArray());
//        os.flush();
//        os.close();
//        String filename = "daifa" + DateUtil.format(new Date(), "yyyyMMdd") + ".xls";
//        return null;
	}
	
	public static HSSFWorkbook set(HSSFWorkbook wb, String... args){
		// new 抽象对象，重写其初始化方法来输出
		return null;
	}
}

package hcy.util.kit.office;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public abstract class Xls<T> {

	private TreeMap<String, String> map = new TreeMap<>();
	private List<T> list = new ArrayList<>();
	
	HSSFWorkbook wb = new HSSFWorkbook();
	private Integer rowNum = 0;
	
	private Xls(List<T> list) {
		this.list = list;
	}
	
	protected abstract void init();
	protected abstract void loop(T t);
	
	public void execute(){

	}
	
	protected void set(int column,String value){
		this.getRow().createCell(column).setCellValue(value);
	}
	
	private HSSFRow getRow(){
		return this.getSheet().createRow(rowNum);
	}
	
	private HSSFSheet getSheet(){
		return this.wb.createSheet();
	}
	
	
//	public static void main(String[] args) {
//		Xls xls = new Xls();
//		xls.map.put("0", "v:0");
//		xls.map.put("1", "v:1");
//		xls.map.put("2", "v:2");
//		xls.map.put("3", "v:3");
//		xls.map.put("4", "v:4");
//		System.out.println(xls.map);
//	}
}

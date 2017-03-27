package com.fastwebx.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * zip解压缩 压缩工具类
 * @author mj
 */
public class ZipUtil {
	/**
	 * 将某个目录压缩成对应文件
	 * @param path
	 * @param target
	 */
	public static void zip(String path,String target){
		File inputFile = new File(path);
		ZipOutputStream out;
		try {
			out = new ZipOutputStream(new FileOutputStream(  
					 target));
			
			File[] fl = inputFile.listFiles(); 
			for(File f:fl)
				zip(out, f, ""); 
	        out.close(); // 输出流关闭  
		} catch (Exception e) {
		
			e.printStackTrace();
		}  
       
	}
	
	private static void zip(ZipOutputStream out, File f, String base) throws Exception { // 方法重载  
		String path = base + f.getName();
        if (f.isDirectory()) { 
            File[] fl = f.listFiles();  
            
            for (int i = 0; i < fl.length; i++) {  
                zip(out, fl[i], path + "/"); // 递归遍历子文件夹  
            }  
            
        } else {  
        	
        	
        	ZipEntry ze = new ZipEntry(path);
        	
        	out.putNextEntry(ze);
            FileInputStream in = new FileInputStream(f);  
            BufferedInputStream bi = new BufferedInputStream(in);  
            int b;  
            byte[] bs = new byte[1024];
            while ((b = bi.read(bs)) != -1) {  
            	
            	out.write(bs,0,b);
            }  
            bi.close();  
            in.close(); // 输入流关闭  
        }  
    }
	
	/**
	 * 减压缩
	 */
	public static void unZip(String zipFile,String descDir) {  

		File pathFile = new File(descDir); 
        if(!pathFile.exists()){ 
            pathFile.mkdirs(); 
        } 
        ZipFile zip;
		try {
			zip = new ZipFile(zipFile);
		    Enumeration entries = zip.entries();
	        while(entries.hasMoreElements()){ 
	            ZipEntry entry = (ZipEntry)entries.nextElement();
	            if(entry.isDirectory()) continue;
	            String zipEntryName = entry.getName(); 
	            InputStream in = zip.getInputStream(entry); 
	            String outPath = (descDir+zipEntryName).replaceAll("\\*", "/");; 
	            //判断路径是否存在,不存在则创建文件路径 
	            File file = new File(outPath.substring(0, outPath.lastIndexOf('/'))); 
	            if(!file.exists()){ 
	                file.mkdirs(); 
	            } 
	            OutputStream out = new FileOutputStream(outPath); 
	            byte[] buf1 = new byte[1024]; 
	            int len; 
	            while((len=in.read(buf1))>0){ 
	                out.write(buf1,0,len); 
	            } 
	            in.close(); 
	            out.close(); 
            } 
		} catch (IOException e) {
			e.printStackTrace();
		}
       
    }  
	
}

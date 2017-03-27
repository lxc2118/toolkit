package com.fastwebx.upload;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.apache.commons.io.output.DeferredFileOutputStream;

import com.fastwebx.upload.exp.UploadException;
public abstract class UploadCtrl {
	@RequestMapping(method=RequestMethod.POST)
	public String execute(@RequestParam("upload_file") MultipartFile myfile ,
			HttpServletRequest request ,
			HttpServletResponse response
			){
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");  
			response.setHeader("Cache-Control", "no-cache");  
			
			String fileNameLong = myfile.getOriginalFilename();
			if(!this.isAllowed(this.getExtension(fileNameLong))){
	        	throw new UploadException("该扩展名不允许上传");
	        }
			String url = saveFile(myfile,request,response);
			succ(url,request,response);
			
			
		} catch (Exception e) {
			fail(e,request,response);
			e.printStackTrace();
		}
		return null;
	}
	/**
     * 返回允许上传的扩展名
     * @return
     */
    protected List<String> getAllowedExtend(){
    	List<String> ret = new java.util.ArrayList<String>();
    	ret.add("gif");
    	ret.add("jpg");
    	ret.add("jpeg");
    	ret.add("bmp");
    	ret.add("png");
    	ret.add("zip");
    	ret.add("rar");
    	return ret;
    }
    /**
     * 判断是否返回
     * @param ext
     * @return
     */
    protected boolean isAllowed(String ext){
    	if(ext==null) return false;
    	List<String> extendList = this.getAllowedExtend();
    	for (String string : extendList) {
			if(string.equalsIgnoreCase(ext)) {
				return true;
			}
		}
    	return false;
    }
    
    /** 
     * 获取扩展名的方法 
     */  
    protected String getExtension(String fileName) {  
        return fileName.substring(fileName.lastIndexOf(".") + 1);  
    } 
    
    protected abstract String saveFile(MultipartFile myfile,
    		HttpServletRequest request ,
			HttpServletResponse response);
    protected abstract void succ(String url,
    		HttpServletRequest request ,
			HttpServletResponse response);
    protected abstract void fail(
    		Exception e,
    		HttpServletRequest request ,
			HttpServletResponse response);
}

package com.fastwebx.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public abstract class SaveFileCtrl extends UploadCtrl {

	@Override
	protected String saveFile(MultipartFile file,
			HttpServletRequest request ,
			HttpServletResponse response) {
		String fileName = null;
		String currentDirPath =null;
		if(file != null){	
			currentDirPath = getDir(file,request);
			File dir = new File(currentDirPath);
			if(!dir.exists())
				dir.mkdirs();
			fileName = getFileName(file,request);
			File pathToSave = new File(currentDirPath, fileName);  
			FileOutputStream out = null;
			
        	try {
        		out = new FileOutputStream(pathToSave);
                out.write(file.getBytes());
            } catch (Exception e) {
				e.printStackTrace();
			} finally{
				try {
					if(out !=null)
						out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
        }
        return getFileUrl(currentDirPath,fileName);
	}

	abstract protected String getFileUrl(String dir,String fileName);
	
	/**
	 * 返回路径
	 * @param fileItem
	 * @param request
	 * @param response
	 * @return
	 */
	abstract protected String getDir(MultipartFile file,HttpServletRequest request);
	/**
	 * 返回文件名
	 * @param fileItem
	 * @param request
	 * @param response
	 * @return
	 */
	abstract protected String getFileName(MultipartFile file,HttpServletRequest request );

}

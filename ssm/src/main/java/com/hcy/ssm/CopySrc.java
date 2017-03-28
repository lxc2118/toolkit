package com.hcy.ssm;

import java.io.File;
import java.net.URISyntaxException;

import com.hcy.ssm.util.FileUtil;

public class CopySrc {
	private static final String path = "file";
	public void execute(){
		try {
			File file = new File(ClassLoader.getSystemResource(path).toURI());
			doExecute(file,"");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	private void doExecute(File file,String path){
		if(file.isDirectory()){
			for(File child:file.listFiles()){
				doExecute(child,path+"/"+child.getName());
			}
		}else{
			FileUtil.write(path, file);
		}
	}
}

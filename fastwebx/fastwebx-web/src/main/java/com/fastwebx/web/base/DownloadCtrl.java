package com.fastwebx.web.base;

import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fastwebx.common.util.StrUtil;

/**
 * 下载控制层父类
 * @author mj
 */

public abstract class DownloadCtrl <Param> extends BaseCtrl  {

	protected abstract String getFileName(Param param
			
		
	);
	
	@Override
	public final Object acqDao() {
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping()
	public  void execute(Param param
			
			,HttpServletResponse  response
		) {
		init();
		preProcess(param);
		response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName="+this.getFileName(param));
        try {
          
            OutputStream os=response.getOutputStream();
            doExecute(param,os);
            
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	
	protected abstract void doExecute(
			Param param
			
			,OutputStream out
	)  throws IOException;
	
}

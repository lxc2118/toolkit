package com.fastwebx.test.valve;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.service.pipeline.PipelineContext;
import com.alibaba.citrus.service.pipeline.Valve;
import com.alibaba.citrus.turbine.Context;

public class MyValve2 implements Valve{
	@Autowired
	private HttpServletRequest request;
	
	

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	

	@Override
	public void invoke(PipelineContext pipelineContext) throws Exception {
		System.out.println("MyValve2 started.");
		request.setAttribute("test", "123");
		try{
			pipelineContext.invokeNext();
			
		}catch(Exception e){
			System.out.println("is error");
			
			request.setAttribute("error", e.getMessage());
			pipelineContext.setAttribute("error1", "aaaa");
		}
		System.out.println("MyValve2 end.");
		
	}

}

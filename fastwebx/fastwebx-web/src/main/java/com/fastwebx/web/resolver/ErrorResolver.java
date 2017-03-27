package com.fastwebx.web.resolver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

public class ErrorResolver implements HandlerExceptionResolver{
	@Override
	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse resp, Object arg2, Exception ex) {
		ModelAndView mav = new ModelAndView();
		try {
			
			PrintWriter writer = resp.getWriter();
			ErrorObj error = new ErrorObj(ex.getClass().getSimpleName(),ex.getMessage());
			writer.print(JSON.toJSONStringWithDateFormat(error, "yyyy-MM-dd"));
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		return mav;
	}
	
}
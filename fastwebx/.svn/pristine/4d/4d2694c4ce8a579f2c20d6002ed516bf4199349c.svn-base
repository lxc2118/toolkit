package com.fastwebx.web.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;



public class ResponseWiter {
	static public void writeJson(HttpServletResponse response,Object obj){
		if(response==null ) {
			return;
		}
		if(obj==null){
			try {
				response.getWriter().println("{}");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
		try {
			response.getWriter().println(JsonUtil.toJson(obj));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.fastwebx.web.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResponseContext {

	static public HttpServletResponse get() {
		return responses.get();
	}

	static public void set(HttpServletResponse arg0) {
		responses.set(arg0);
	}

	static private ThreadLocal<HttpServletResponse> responses = new ThreadLocal<HttpServletResponse>();
	
	
}

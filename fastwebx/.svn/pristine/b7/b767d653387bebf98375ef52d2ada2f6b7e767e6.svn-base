package com.fastwebx.web.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RequestContext {

	static public HttpServletRequest get() {
		return requests.get();
	}

	static public void set(HttpServletRequest arg0) {
		requests.set(arg0);
	}

	static private ThreadLocal<HttpServletRequest> requests = new ThreadLocal<HttpServletRequest>();
	
	
}

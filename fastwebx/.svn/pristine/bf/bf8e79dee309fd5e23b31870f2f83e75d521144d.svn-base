package com.fastwebx.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fastwebx.web.context.RequestContext;
import com.fastwebx.web.context.ResponseContext;
import com.fastwebx.web.context.SessionContext;

public class SessionFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse reponse,
			FilterChain chain) throws IOException, ServletException {
		SessionContext.setSession(((HttpServletRequest)request).getSession());
		RequestContext.set((HttpServletRequest)request);
		ResponseContext.set((HttpServletResponse)reponse);
		chain.doFilter(request, reponse);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}

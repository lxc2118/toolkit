package com.fastwebx.web.context.map.inf;

import javax.servlet.http.HttpSession;

import com.fastwebx.common.valueHolder.IValueHolder;


public class SessionHolder implements IValueHolder{
	private HttpSession session;
	public SessionHolder(HttpSession session){
		this.session = session;
	}
	@Override
	public Object get(String key) {
		
		return session.getAttribute(key);
	}
	@Override
	public Object set(String key,Object t) {
		if(t!=null)
			session.setAttribute(key, t);
		return t;
	}
	@Override
	public void remove(String key) {
		if(key!=null)
			session.removeAttribute(key);
		
	}
	@Override
	public boolean containsKey(String key) {

		return session.getAttribute(key)!=null;
	}
	
	
	
}

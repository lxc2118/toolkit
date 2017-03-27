package com.fastwebx.web.util.entry.cookie;

import java.util.function.Consumer;

/**
 * @author mj
 */
public abstract class AbsCookieProcess implements Consumer<String> {

	@Override
	public void accept(String cookie) {
		if(cookie == null) return ;
		cookie = cookie.trim();
		String key = null;
		String value = null;
		String[] cookies = cookie.split("=");
		key = cookies[0];
		if(cookies.length>=2)
			value = cookies[1];
		if(check(key,value))
			doProcess(key,value);
	}

	protected abstract void doProcess(String key, String value) ;

	protected boolean check(String key, String value) {
		return true;
	}
	
}

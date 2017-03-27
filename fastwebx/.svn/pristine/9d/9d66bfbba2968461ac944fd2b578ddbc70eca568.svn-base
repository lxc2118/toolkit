package com.fastwebx.web.context;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.fastwebx.common.valueHolder.IVHCreater;
import com.fastwebx.common.valueHolder.IValueHolder;
import com.fastwebx.common.valueHolder.inf.MapHolder;
import com.fastwebx.web.context.map.inf.SessionHolder;

public class SessionContext {
	static private ThreadLocal<HttpSession> sessions = new ThreadLocal<HttpSession>();

	private static Map<String, Object> map = new HashMap();
	private static boolean useWeb = true;
	private static Map<String, String> theMap = null;

	private static IVHCreater creater;

	public void setCreater(IVHCreater vhc) {
		creater = vhc;
	}

	public static void setUseWeb(boolean useWeb) {
		SessionContext.useWeb = useWeb;
	}

	public static void setSession(HttpSession session) {
		sessions.set(session);
	}

	public static HttpSession getSession() {
		HttpSession session = sessions.get();
		return session;
	}

	public static Object get(String key) {
		return getMap().get(key);
	}

	public static Object put(String key, Object value) {
		return getMap().set(key, value);
	}

	protected static IValueHolder getMap() {
		if (creater != null)
			return creater.create();
		HttpSession session = getSession();
		if (useWeb && session!=null) {
			return new SessionHolder(session);
		} else {
			if (map == null)
				map = new HashMap();
			return new MapHolder(map);
		}
	}

	public static void remove(String key) {
		if (key == null) {
			
			return;
		}
		try {
			IValueHolder map = getMap();
			if (map.containsKey(key))
				map.remove(key);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}

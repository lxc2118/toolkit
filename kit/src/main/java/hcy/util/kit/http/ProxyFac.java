package hcy.util.kit.http;

import hcy.util.kit.http.inf.IProxy;

public class ProxyFac {

	public static ProxyFac instance = new ProxyFac() ;
	
	private ProxyFac() {}

	public static ProxyFac getInstace(){
		return instance;
	}  
	
	public IProxy getProxy() {
		return null;
	}
	
	/**
	 * proxy销毁
	 * @param proxy
	 */
	public void delete(IProxy proxy) {
		
	}
}

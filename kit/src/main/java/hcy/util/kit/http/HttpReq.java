package hcy.util.kit.http;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import hcy.util.kit.http.inf.IProxy;
import util.MapUtil;
import util.ReqUtil;

/**
 * Request请求
 * 支持 http,https
 * 目前https只支持get方法
 * @author lxc
 */
public class HttpReq extends AbsReq{
	
	/**
	 * 返回状态码正常  
	 */
    public static final int OK = 200;
    
    /**
     * http端口
     */
    public static final int DEFAULT_HTTP_PORT = 80;
  
    /**
     * https端口
     */
    public static final int DEFAULT_HTTPS_PORT = 443;
	
	/**
	 * 连接超时  
	 */
    public static final int CONNECTION_TIMEOUT = 5000;
    
    /**
     * 数据读取等待超时
     */
    public static final int SOCKET_TIMEOUT = 10000;
	
    
	private static Logger logger = Logger.getLogger(HttpReq.class);
	
//	private Cookies cookies;

	/**
	 * 过滤字段
	 */
	protected String[] filterKeys;

	/**
	 * 真实访问地址
	 * 302等访问跳转
	 */
	private String realReqUri;

	/**
	 * 默认方法
	 */
	private String method = "get";

	/**
	 * 访问参数
	 */
	protected HashMap<String, String> params = new HashMap<String, String>();

	/**
	 * 返回字符串格式
	 */
	private String charset = "gbk";

	/**
	 * 内部代理host
	 */
	private HttpHost httpHost;

	/**
	 * 本地代理类
	 */
	private IProxy proxy;
	
	/**
	 * proxy工厂
	 */
	private ProxyFac proxyFac;

	public HttpReq() {}

	public HttpReq(String url) {
		this.url = url;
	}

	public HttpReq setHeader(String name, String value){
		Header header = this.headersMap.get(name);
		if (header!=null) {
			this.headersMap.put(name, new BasicHeader(name, header.getValue() + "; " + value));
		} else {
			this.headersMap.put(name, new BasicHeader(name, value));
		}
//		this.headers.add(new BasicHeader(name, value));
		return this;
	}

	public HttpReq setProxy() {
		if (proxyFac!=null) {
			IProxy proxy = proxyFac.getProxy();
			if(proxy != null)
				this.setProxy(proxy);
		}
		return this;
	}

	public HttpReq setProxy(IProxy proxy) {
		if (proxy != null) {
			this.proxy = proxy;
			this.httpHost = new HttpHost(proxy.getIp(), proxy.getPort());
		}
		return this;
	}
	
	public HttpReq setProxy(HttpHost httpHost) {
		this.httpHost = httpHost;
		return this;
	}
	
	public HttpReq setProxy(String proxy) {
		String[] temp = proxy.split(":");
		this.httpHost = new HttpHost(temp[0], Integer.parseInt(temp[1]));
		return this;
	}
	
	public HttpReq setProxy(String hostName, int port) {
		this.httpHost = new HttpHost(hostName, port);
		return this;
	}
	
	public HttpReq(String url, HashMap<String, String> params) {
		this.url = url;
		this.params = params;
	}

	public HttpReq put(String k, String v) {
		this.params.put(k, v);
		return this;
	}

	public HttpReq put(String queryString) {
		this.put(ReqUtil.parseQueryString(queryString));
		return this;
	}

	public HttpReq put(Map<String, String> params) {
		for (String k : params.keySet()) {
			put(k, params.get(k));
		}
		return this;
	}

	public HttpReq setUrl(String url) {
		this.url = url;
		return this;
	}

	public HttpReq setMethod(String method) {
		this.method = method;
		return this;
	}

	/**
	 * 默认get方法
	 */
	public String getMethod() {
		if (this.method == null)
			return "get";
		return this.method;
	}

	public HashMap<String, String> getParams() {
		return doFilter(this.params);
	}
	
	public HttpReq setCookies(String cookie) {
		this.getHeadersMap().get("Cookie");
		this.setHeader("Cookie", cookie);
		return this;
	}
	
	/**
	 * cookie规范
	 * Set-Cookie: <name>=<value>[; <name>=<value>]...
	 * [; expires=<date>(DAY, DD MMM YYYY HH:MM:SS GMT)][;domain=<domain_name>]
	 * [; path=<some_path>][;secure][;httponly]
	 */
	public HttpReq setCookie(String k, String v) {
		this.setHeader("Cookie", k+"="+v);
		return this;
	}
	
	public HttpReq setCookie(String k, String v, String date) {
		this.setHeader("Cookie", k+":"+v+";");
		return this;
	}

	/**
	 * 返回url，不带param参数
	 *
	 * @return
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * 真实访问地址
	 * 302等跳转之后的访问地址
	 * @return
	 */
	public String getRealReqUri() {
		return this.realReqUri;
	}

	public String getCharset() {
		return charset;
	}

	public HttpReq setCharset(String charset) {
		this.charset = charset;
		return this;
	}

	/**
	 * 返回url，带param参数
	 *
	 * @return
	 */
	public String getUrlWithParam() {
		if (this.params.isEmpty())
			return this.getUrl();
		return this.getUrl() + "?" + ReqUtil.parseParams(this.getParams());
	}

	/**
	 * "k1,k2,k3"
	 *
	 * @return this
	 */
	public HttpReq setFilter(String keys) {
		this.filterKeys = keys.split(",");
		return this;
	}

	public String[] getFilter() {
		return this.filterKeys;
	}

	private HashMap<String, String> doFilter(HashMap<String, String> map) {
		if (this.getFilter() != null)
			return MapUtil.filterKeys(map, this.getFilter());
		return map;
	}

	public String execute() {
		//　说明启用了代理
		if (this.httpHost!= null){
			String html = this.doExecute();
			if (html == null) {
				this.proxyFac.delete(proxy);
				this.setProxy(this.proxyFac.getProxy());
				return this.execute();
			}
			return html;
		}
		return this.doExecute();
	}

	/**
	 * TODO 未测试
	 * @return
	 */
	public File executeFile() {
		try {
			return new File(this.getUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public byte[] execute2Bytes() {
		return doExecute2Bytes();
	}
	
	public byte[] doExecute2Bytes() {
		CloseableHttpClient httpClient = this.getHttpClient();
		CloseableHttpResponse httpResp = null;
		HttpUriRequest httpUriReq = HttpUriReqFac.get(this);
		if (httpUriReq == null)
			logger.error("httpUriReq is null");
		HttpContext httpContext = new BasicHttpContext();
		try {
			httpResp = httpClient.execute(httpUriReq,httpContext);
			// 获取最终跳转uri
			HttpUriRequest realUriReq = (HttpUriRequest)httpContext.getAttribute(HttpCoreContext.HTTP_REQUEST);
			// host
			HttpHost httpHost = (HttpHost)httpContext.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
			this.realReqUri = httpHost.getHostName() + realUriReq.getURI().toString();
			if (httpResp.getStatusLine().getStatusCode() != 200)
				logger.info("bad request:" + this.getUrl() + "\ncode:" + httpResp.getStatusLine().getStatusCode());
			return EntityUtils.toByteArray(httpResp.getEntity());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (httpResp != null) {
				try {
					httpResp.close();
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * http请求核心方法
	 * @return
	 */
	public String doExecute() {
		// 创建client
		CloseableHttpClient httpClient = this.getHttpClient();
		// 创建httpResp
		CloseableHttpResponse httpResp = null;
		// 获取请求
		HttpUriRequest httpUriReq = HttpUriReqFac.get(this);
		if (httpUriReq == null)
			logger.error("httpUriReq is null");
		HttpContext httpContext = new BasicHttpContext();
		try {
			httpResp = httpClient.execute(httpUriReq,httpContext);
			// 获取最终跳转uri
			HttpUriRequest realUriReq = (HttpUriRequest)httpContext.getAttribute(HttpCoreContext.HTTP_REQUEST);
			// host
			HttpHost httpHost = (HttpHost)httpContext.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
			this.realReqUri = httpHost.getHostName() + realUriReq.getURI().toString();
			if (httpResp.getStatusLine().getStatusCode() != OK)
				logger.info("bad request:" + this.getUrl() + "\ncode:" + httpResp.getStatusLine().getStatusCode());
			return EntityUtils.toString(httpResp.getEntity(),this.getCharset());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (httpResp != null) {
				try {
					httpResp.close();
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * TODO 代理目前只支持http请求
	 */
	public CloseableHttpClient getHttpClient(){
		if (this.getUrl().startsWith("http")) {
			RequestConfig defaultRequestConfig = RequestConfig.custom()
	                .setCookieSpec(CookieSpecs.DEFAULT)
	                .setExpectContinueEnabled(true)
	                .setStaleConnectionCheckEnabled(true)
	                .setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
	                .setProxyPreferredAuthSchemes(Arrays.asList(AuthSchemes.BASIC))
	                .build();
			RequestConfig requestConfig = RequestConfig.copy(defaultRequestConfig)
	                .setSocketTimeout(SOCKET_TIMEOUT)
	                .setConnectTimeout(CONNECTION_TIMEOUT)
	                .setConnectionRequestTimeout(CONNECTION_TIMEOUT)
	                .setProxy(this.httpHost)
	                .build();
			return HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
		}
		if (this.getUrl().startsWith("https"))
			return this.createSSLClient();
		else
			return HttpClients.createDefault();
	}
}

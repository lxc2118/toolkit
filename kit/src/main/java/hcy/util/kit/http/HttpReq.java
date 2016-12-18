package hcy.util.kit.http;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import util.MapUtil;
import util.ReqUtil;

/**
 * Created by lxc on 2016/9/2. Request请求 支持 http,https 目前https只支持get方法
 * example:new HttpReq(url).execute(); new HttpReq(url, params).execute(); new
 * HttpReq(url).put("a","b").execute(); new
 * HttpReq(url).put(params).setMethod(HttpReq.Method.POST).execute(); new
 * HttpReq(url).put(params).setFilter("k1,k2,k3").execute();
 * @author Axios
 */
public class HttpReq extends AbsReq{

	protected String[] filterKeys;
	
	private String realReqUri;

	private String method = "get";

	protected HashMap<String, String> params = new HashMap<>();

	private static Logger logger = Logger.getLogger(HttpReq.class);
	
	private String charset = "gbk";
	
	private Boolean proxy = false;

	public HttpReq() {
	}

	public HttpReq(String url) {
		this.url = url;
	}

	public HttpReq setHeader(String name, String value){
		this.headers.add(new BasicHeader(name, value));
		return this;
	}
	
	public HttpReq setProxy(boolean proxy) {
		this.proxy = proxy;
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
		this.setHeader("Cookie", cookie);
		return this;
	}
	
	/**
	 * TODO 还没有仔细研究cookie规范
	 * 待修改
	 */
	public HttpReq setCookie(String k, String v) {
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
		this.doExecute();
		try {
			return doExecute2Bytes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public byte[] doExecute2Bytes() {
		CloseableHttpClient httpClient = this.getHttpClient();
		CloseableHttpResponse httpResp = null;
		HttpUriRequest httpUriReq = null;
		HttpContext httpContext = new BasicHttpContext();
		if (this.method.equals("get")) {
			httpUriReq = new HttpGet(this.getUrlWithParam());
			httpUriReq.setHeaders(this.getAllHeaders());
		}
		if (this.method.endsWith("post")) {
			HttpPost httpPost = new HttpPost(this.getUrl());
			if (this.params != null) {
				List<NameValuePair> paramList = new ArrayList<>();
				for (String key : params.keySet())
					paramList.add(new BasicNameValuePair(key, params.get(key)));
				// 构造一个form表单式的实体
				UrlEncodedFormEntity formEntity;
				try {
					formEntity = new UrlEncodedFormEntity(paramList);
					// 将请求实体设置到httpPost对象中
					httpPost.setEntity(formEntity);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
		if (httpUriReq == null)
			logger.error("httpUriReq is null");
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

	public String doExecute() {
		CloseableHttpClient httpClient = this.getHttpClient();
		CloseableHttpResponse httpResp = null;
		HttpUriRequest httpUriReq = null;
		HttpContext httpContext = new BasicHttpContext();
		if (this.method.equals("get")) {
			httpUriReq = new HttpGet(this.getUrlWithParam());
			httpUriReq.setHeaders(this.getAllHeaders());
		}
		if (this.method.endsWith("post")) {
			HttpPost httpPost = new HttpPost(this.getUrl());
			if (this.params != null) {
				List<NameValuePair> paramList = new ArrayList<>();
				for (String key : params.keySet())
					paramList.add(new BasicNameValuePair(key, params.get(key)));
				// 构造一个form表单式的实体
				UrlEncodedFormEntity formEntity;
				try {
					formEntity = new UrlEncodedFormEntity(paramList);
					// 将请求实体设置到httpPost对象中
					httpPost.setEntity(formEntity);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
		if (httpUriReq == null)
			logger.error("httpUriReq is null");
		try {
			httpResp = httpClient.execute(httpUriReq,httpContext);
			// 获取最终跳转uri
			HttpUriRequest realUriReq = (HttpUriRequest)httpContext.getAttribute(HttpCoreContext.HTTP_REQUEST);
			// host
			HttpHost httpHost = (HttpHost)httpContext.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
			this.realReqUri = httpHost.getHostName() + realUriReq.getURI().toString();
			if (httpResp.getStatusLine().getStatusCode() != 200)
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
		if (this.proxy) {
			RequestConfig defaultRequestConfig = RequestConfig.custom()
	                .setCookieSpec(CookieSpecs.BEST_MATCH)
	                .setExpectContinueEnabled(true)
	                .setStaleConnectionCheckEnabled(true)
	                .setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
	                .setProxyPreferredAuthSchemes(Arrays.asList(AuthSchemes.BASIC))
	                .build();
			RequestConfig requestConfig = RequestConfig.copy(defaultRequestConfig)
	                .setSocketTimeout(5000)
	                .setConnectTimeout(5000)
	                .setConnectionRequestTimeout(5000)
	                // TODO ip代理池没做
	                .setProxy(new HttpHost("183.61.236.53", 3128))
	                .build();
			return HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
		}
		if (this.getUrl().startsWith("https"))
			return this.createSSLClient();
		else
			return HttpClients.createDefault();
	}
}

package hcy.util.kit.http.method;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;

import hcy.util.kit.http.HttpReq;
import hcy.util.kit.http.HttpResp;

public class Post{
//	public HttpResp doExecute() {
//		CloseableHttpClient httpClient = HttpClients.createDefault();
//		CloseableHttpResponse httpResponse = null;
//		HttpPost httpPost = new HttpPost(this.req.getUrl());
//		HashMap<String, String> params = this.req.getParams();
//		httpPost.setHeaders(this.getHeaders());
//		HttpResp resp = new HttpResp();
//		try {
//			if (params != null) {
//				List<NameValuePair> paramList = new ArrayList<>();
//				for (String key : params.keySet())
//					paramList.add(new BasicNameValuePair(key, params.get(key)));
//				// 构造一个form表单式的实体
//				UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(paramList);
//				// 将请求实体设置到httpPost对象中
//				httpPost.setEntity(formEntity);
//			}
//			HttpContext httpContext = new BasicHttpContext();
//			httpResponse = httpClient.execute(httpPost, httpContext);
//			// 获取最终跳转uri
//			HttpUriRequest realRequest = (HttpUriRequest) httpContext.getAttribute(HttpCoreContext.HTTP_REQUEST);
//			// host
//			HttpHost httpHost = (HttpHost) httpContext.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
//			// 拼装resp
//			resp.setEntity(httpResponse.getEntity());
//			resp.setStatusLine(httpResponse.getStatusLine());
//			resp.setUri(realRequest.getURI().toString());
//			resp.setHost(httpHost.toURI());
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (httpResponse != null) {
//				try {
//					httpResponse.close();
//					httpClient.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return resp;
//	}

}

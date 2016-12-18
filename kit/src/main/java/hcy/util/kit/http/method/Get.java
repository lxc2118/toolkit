package hcy.util.kit.http.method;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.util.EntityUtils;

import hcy.util.kit.http.HttpReq;
import hcy.util.kit.http.HttpResp;

public class Get{

//	public HttpResp doExecute() {
//		CloseableHttpClient httpClient = this.getHttpClient();
//		CloseableHttpResponse httpResponse = null;
//		HttpContext httpContext = new BasicHttpContext();
//		HttpResp resp = new HttpResp();
//		try {
//			httpResponse = httpClient.execute(httpGet,httpContext);
//			System.out.println(EntityUtils.toString(httpResponse.getEntity()));
//			// 获取最终跳转uri
//			HttpUriRequest realRequest = (HttpUriRequest)httpContext.getAttribute(HttpCoreContext.HTTP_REQUEST);
//			// host
//			HttpHost httpHost = (HttpHost)httpContext.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
//			
//			resp.setEntity(httpResponse.getEntity());
//			resp.setStatusLine(httpResponse.getStatusLine());
//			resp.setUri(realRequest.getURI().toString());
//			resp.setHost(httpHost.toURI());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
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

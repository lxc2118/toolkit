package hcy.util.kit.http;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.net.ssl.SSLContext;

import org.apache.http.Header;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;

public abstract class AbsReq {
	
	/**
	 * 
	 */
	protected Map<String, Header> headersMap = new HashMap<>();
	
	protected List<Header> headers = new ArrayList<Header>() {
		{
			add(new BasicHeader("Accept","text/html"));
			add(new BasicHeader("Accept-Encoding", "gzip, deflate, sdch, br"));
			add(new BasicHeader("Accept-Language", "zh-CN,zh;q=0.8"));
			add(new BasicHeader("Connection", "keep-alive"));
			add(new BasicHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36"));
			add(new BasicHeader("Upgrade-Insecure-Requests", "1"));
		}
	};
	
	@Deprecated
	protected List<Header> defaultHeaders = new ArrayList<Header>() {
		{
//			add(new BasicHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8"));
			add(new BasicHeader("Accept","text/html"));
			add(new BasicHeader("Accept-Encoding", "gzip, deflate, sdch, br"));
			add(new BasicHeader("Accept-Language", "zh-CN,zh;q=0.8"));
			add(new BasicHeader("Connection", "keep-alive"));
			add(new BasicHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36"));
			add(new BasicHeader("Upgrade-Insecure-Requests", "1"));
		}
	};
	
	public AbsReq() {
		this.headersMap = this.headers.stream().collect(Collectors.toMap(Header::getName, b -> b));
	}
	
	/**
	 * 请求url
	 */
	protected String url;
	
	public String getUrl() {
		return this.url;
	}
	
	public List<Header> getHeaders() {
		return (List<Header>) this.headersMap.values();
	}
	
	public Header[] getHeaderArray() {
		Collection<Header> headerCollection = this.headersMap.values();
		int size = headerCollection.size();
		return headerCollection.toArray(new Header[size]);
	}
	
	public Map<String,Header> getHeadersMap() {
		return this.headersMap;
	}

	@Deprecated
	public Header[] getAllHeaders() {
		if (!this.getHeaders().isEmpty())
			defaultHeaders.addAll(headers);
		int size = defaultHeaders.size();
		return (Header[]) defaultHeaders.toArray(new Header[size]);
	}

	public abstract CloseableHttpClient getHttpClient();

	/**
	 * 默认的sslClient，信任所有
	 * 
	 * @return
	 */
	protected CloseableHttpClient createSSLClient() {
		try {
			SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
				@Override
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			}).build();
			new SSLConnectionSocketFactory(sslContext);
			SSLConnectionSocketFactory sslsf = SSLConnectionSocketFactory.getSocketFactory();
//			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext,SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER); 
			return HttpClients.custom().setSSLSocketFactory(sslsf).build();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		}
		return HttpClients.createDefault();
	}
}

package hcy.util.kit.http;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLContext;

import org.apache.http.Header;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;

public abstract class AbsReq {

	protected List<Header> defaultHeaders = new ArrayList<Header>() {
		{
			add(new BasicHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8"));
			add(new BasicHeader("Accept-Encoding", "gzip, deflate, sdch, br"));
			add(new BasicHeader("Accept-Language", "zh-CN,zh;q=0.8"));
			add(new BasicHeader("Connection", "keep-alive"));
			add(new BasicHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36"));
			add(new BasicHeader("Upgrade-Insecure-Requests", "1"));
		}
	};
	
	protected List<Header> headers = new ArrayList<>();
	
	protected String url;
	
	public String getUrl() {
		return this.url;
	}
	
	public List<Header> getHeaders() {
		return this.headers;
	}

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
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
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

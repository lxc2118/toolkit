package hcy.util.kit.http;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;

public class HttpResp {

	/**
	 * 访问的真实uri
	 */
	private String uri;
	
	private String host;
	
	private HttpEntity entity;
	
	private StatusLine statusLine;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public HttpEntity getEntity() {
		return entity;
	}

	public void setEntity(HttpEntity entity) {
		this.entity = entity;
	}

	public StatusLine getStatusLine() {
		return statusLine;
	}

	public void setStatusLine(StatusLine statusLine) {
		this.statusLine = statusLine;
	}
	
	public String getUrl() {
		return this.getHost() + this.getUri();
	}

}

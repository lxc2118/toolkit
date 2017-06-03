package hcy.util.kit.http;

import java.util.Date;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;

import util.DateUtil;

public class Cookie implements Header{

	private String name;
	
	private String value;
	
	/**
	 * 作用域名
	 */
	private String domain;

	/**
	 * 作用路径
	 */
	private String path;
	
	/**
	 * TODO 会出现session情况
	 */
	private Date maxAge;
	
	/**
	 * 大小，基本无用
	 */
	private Long size;
	
	/**
	 * 是否过期
	 * 过期 true
	 */
	public Boolean getExpired() {
		return DateUtil.before(maxAge, new Date());
	}
	
	/**
	 * 是否生效
	 */
	public Boolean getWork(String host) {
		return host.indexOf(this.getDomain()) > -1;
	}
	
	/**
	 * 后续拓展
	 */
	private String http;
	private String secure;
	private String sameSite;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Date maxAge) {
		this.maxAge = maxAge;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	@Deprecated
	public HeaderElement[] getElements() throws ParseException {
		return null;
	}
	
}

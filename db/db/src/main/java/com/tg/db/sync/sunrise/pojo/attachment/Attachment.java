package com.tg.db.sync.sunrise.pojo.attachment;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Attachment implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setScope(String scope){
		this.scope=scope;
	}

	public String getScope(){
		return this.scope;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setUri(String uri){
		this.uri=uri;
	}

	public String getUri(){
		return this.uri;
	}
	public void setEtag(String etag){
		this.etag=etag;
	}

	public String getEtag(){
		return this.etag;
	}
	public void setSize(Long size){
		this.size=size;
	}

	public Long getSize(){
		return this.size;
	}
	public void setShopId(Integer shopId){
		this.shopId=shopId;
	}

	public Integer getShopId(){
		return this.shopId;
	}
	public void setTag(String tag){
		this.tag=tag;
	}

	public String getTag(){
		return this.tag;
	}
	public void setSuffix(String suffix){
		this.suffix=suffix;
	}

	public String getSuffix(){
		return this.suffix;
	}
	public void setRequestDomain(String requestDomain){
		this.requestDomain=requestDomain;
	}

	public String getRequestDomain(){
		return this.requestDomain;
	}
	public void setCategory(String category){
		this.category=category;
	}

	public String getCategory(){
		return this.category;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setContentType(String contentType){
		this.contentType=contentType;
	}

	public String getContentType(){
		return this.contentType;
	}

	private Integer id;

	private String scope;

	private String name;

	private Date createTime;

	private Date updateTime;

	private String uri;

	private String etag;

	private Long size;

	private Integer shopId;

	private String tag;

	private String suffix;

	private String requestDomain;

	private String category;

	private String type;

	private String contentType;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.tgoms.pojo.coop;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Coop implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setApiUri(String apiUri){
		this.apiUri=apiUri;
	}

	public String getApiUri(){
		return this.apiUri;
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
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setProvinceId(String provinceId){
		this.provinceId=provinceId;
	}

	public String getProvinceId(){
		return this.provinceId;
	}
	public void setCityId(String cityId){
		this.cityId=cityId;
	}

	public String getCityId(){
		return this.cityId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setWebSite(String webSite){
		this.webSite=webSite;
	}

	public String getWebSite(){
		return this.webSite;
	}
	public void setCoopKey(String coopKey){
		this.coopKey=coopKey;
	}

	public String getCoopKey(){
		return this.coopKey;
	}
	public void setSecret(String secret){
		this.secret=secret;
	}

	public String getSecret(){
		return this.secret;
	}
	public void setCode(String code){
		this.code=code;
	}

	public String getCode(){
		return this.code;
	}
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}

	private Integer id;

	private String apiUri;

	private Date createTime;

	private Date updateTime;

	private String name;

	private String provinceId;

	private String cityId;

	private String status;

	private String webSite;

	private String coopKey;

	private String secret;

	private String code;

	private Integer siteId;

	public  Object acqPk(){
		return id;
	}
}
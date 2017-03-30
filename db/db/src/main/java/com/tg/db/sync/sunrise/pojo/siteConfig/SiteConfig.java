package com.tg.db.sync.sunrise.pojo.siteConfig;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class SiteConfig implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}
	public void setHotSearchWords(String hotSearchWords){
		this.hotSearchWords=hotSearchWords;
	}

	public String getHotSearchWords(){
		return this.hotSearchWords;
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
	public void setQqServiceId(String qqServiceId){
		this.qqServiceId=qqServiceId;
	}

	public String getQqServiceId(){
		return this.qqServiceId;
	}
	public void setTrafficStatCode(String trafficStatCode){
		this.trafficStatCode=trafficStatCode;
	}

	public String getTrafficStatCode(){
		return this.trafficStatCode;
	}

	private Integer id;

	private Integer siteId;

	private String hotSearchWords;

	private Date createTime;

	private Date updateTime;

	private String qqServiceId;

	private String trafficStatCode;

	public  Object acqPk(){
		return id;
	}
}
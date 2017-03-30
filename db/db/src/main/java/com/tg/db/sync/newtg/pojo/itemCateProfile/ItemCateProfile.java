package com.tg.db.sync.newtg.pojo.itemCateProfile;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class ItemCateProfile implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setAlias(String alias){
		this.alias=alias;
	}

	public String getAlias(){
		return this.alias;
	}
	public void setPriceRanges(String priceRanges){
		this.priceRanges=priceRanges;
	}

	public String getPriceRanges(){
		return this.priceRanges;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setAliCid(Integer aliCid){
		this.aliCid=aliCid;
	}

	public Integer getAliCid(){
		return this.aliCid;
	}
	public void setAliCname(String aliCname){
		this.aliCname=aliCname;
	}

	public String getAliCname(){
		return this.aliCname;
	}

	private Integer id;

	private String alias;

	private String priceRanges;

	private Date updateTime;

	private Date createTime;

	private Integer aliCid;

	private String aliCname;

	public  Object acqPk(){
		return id;
	}
}
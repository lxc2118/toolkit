package com.tg.db.sync.tgoms.pojo.freightTemplate;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class FreightTemplate implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setProvinces(String provinces){
		this.provinces=provinces;
	}

	public String getProvinces(){
		return this.provinces;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setPostStart(Integer postStart){
		this.postStart=postStart;
	}

	public Integer getPostStart(){
		return this.postStart;
	}
	public void setPostage(Float postage){
		this.postage=postage;
	}

	public Float getPostage(){
		return this.postage;
	}
	public void setPostPlus(Integer postPlus){
		this.postPlus=postPlus;
	}

	public Integer getPostPlus(){
		return this.postPlus;
	}
	public void setPostagePlus(Float postagePlus){
		this.postagePlus=postagePlus;
	}

	public Float getPostagePlus(){
		return this.postagePlus;
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
	public void setSupplierId(Long supplierId){
		this.supplierId=supplierId;
	}

	public Long getSupplierId(){
		return this.supplierId;
	}
	public void setIdx(Integer idx){
		this.idx=idx;
	}

	public Integer getIdx(){
		return this.idx;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode){
		this.logisticsCompanyCode=logisticsCompanyCode;
	}

	public String getLogisticsCompanyCode(){
		return this.logisticsCompanyCode;
	}

	private Long id;

	private String name;

	private String provinces;

	private String type;

	private Integer postStart;

	private Float postage;

	private Integer postPlus;

	private Float postagePlus;

	private Date createTime;

	private Date updateTime;

	private Long supplierId;

	private Integer idx;

	private String logisticsCompanyCode;

	public  Object acqPk(){
		return id;
	}
}
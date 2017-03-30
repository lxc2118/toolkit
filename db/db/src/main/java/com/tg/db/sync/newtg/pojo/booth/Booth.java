package com.tg.db.sync.newtg.pojo.booth;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class Booth implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return this.description;
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
	public void setBoothPlace(String boothPlace){
		this.boothPlace=boothPlace;
	}

	public String getBoothPlace(){
		return this.boothPlace;
	}
	public void setStrategyType(String strategyType){
		this.strategyType=strategyType;
	}

	public String getStrategyType(){
		return this.strategyType;
	}
	public void setConfigJson(String configJson){
		this.configJson=configJson;
	}

	public String getConfigJson(){
		return this.configJson;
	}
	public void setMaxNum(Integer maxNum){
		this.maxNum=maxNum;
	}

	public Integer getMaxNum(){
		return this.maxNum;
	}
	public void setCacheTimeout(Integer cacheTimeout){
		this.cacheTimeout=cacheTimeout;
	}

	public Integer getCacheTimeout(){
		return this.cacheTimeout;
	}
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder=sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}
	public void setBoothTemplate(String boothTemplate){
		this.boothTemplate=boothTemplate;
	}

	public String getBoothTemplate(){
		return this.boothTemplate;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setTemplateConfigJson(String templateConfigJson){
		this.templateConfigJson=templateConfigJson;
	}

	public String getTemplateConfigJson(){
		return this.templateConfigJson;
	}
	public void setShowNum(Integer showNum){
		this.showNum=showNum;
	}

	public Integer getShowNum(){
		return this.showNum;
	}
	public void setShowType(String showType){
		this.showType=showType;
	}

	public String getShowType(){
		return this.showType;
	}

	private Integer id;

	private String name;

	private String description;

	private Date createTime;

	private Date updateTime;

	private String boothPlace;

	private String strategyType;

	private String configJson;

	private Integer maxNum;

	private Integer cacheTimeout;

	private Integer siteId;

	private Integer sortOrder;

	private String boothTemplate;

	private String status;

	private String templateConfigJson;

	private Integer showNum;

	private String showType;

	public  Object acqPk(){
		return id;
	}
}
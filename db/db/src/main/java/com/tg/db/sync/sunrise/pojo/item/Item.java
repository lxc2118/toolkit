package com.tg.db.sync.sunrise.pojo.item;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Item implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setPicId(Integer picId){
		this.picId=picId;
	}

	public Integer getPicId(){
		return this.picId;
	}
	public void setShopId(Integer shopId){
		this.shopId=shopId;
	}

	public Integer getShopId(){
		return this.shopId;
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
	public void setPublishTimes(Integer publishTimes){
		this.publishTimes=publishTimes;
	}

	public Integer getPublishTimes(){
		return this.publishTimes;
	}
	public void setFollowTimes(Integer followTimes){
		this.followTimes=followTimes;
	}

	public Integer getFollowTimes(){
		return this.followTimes;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setCode(String code){
		this.code=code;
	}

	public String getCode(){
		return this.code;
	}
	public void setViewTimes(Integer viewTimes){
		this.viewTimes=viewTimes;
	}

	public Integer getViewTimes(){
		return this.viewTimes;
	}
	public void setSellingPoint(String sellingPoint){
		this.sellingPoint=sellingPoint;
	}

	public String getSellingPoint(){
		return this.sellingPoint;
	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return this.description;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder=sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}
	public void setRecommend(Boolean recommend){
		this.recommend=recommend;
	}

	public Boolean getRecommend(){
		return this.recommend;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}
	public void setItemCateId(Integer itemCateId){
		this.itemCateId=itemCateId;
	}

	public Integer getItemCateId(){
		return this.itemCateId;
	}
	public void setItemDetailJson(String itemDetailJson){
		this.itemDetailJson=itemDetailJson;
	}

	public String getItemDetailJson(){
		return this.itemDetailJson;
	}
	public void setDownloadTimes(Integer downloadTimes){
		this.downloadTimes=downloadTimes;
	}

	public Integer getDownloadTimes(){
		return this.downloadTimes;
	}
	public void setTags(String tags){
		this.tags=tags;
	}

	public String getTags(){
		return this.tags;
	}
	public void setItemPackageId(Integer itemPackageId){
		this.itemPackageId=itemPackageId;
	}

	public Integer getItemPackageId(){
		return this.itemPackageId;
	}
	public void setSource(String source){
		this.source=source;
	}

	public String getSource(){
		return this.source;
	}
	public void setRefreshTime(Date refreshTime){
		this.refreshTime=refreshTime;
	}

	public Date getRefreshTime(){
		return this.refreshTime;
	}

	private Integer id;

	private String title;

	private Integer picId;

	private Integer shopId;

	private Date createTime;

	private Date updateTime;

	private Integer publishTimes;

	private Integer followTimes;

	private Float price;

	private String code;

	private Integer viewTimes;

	private String sellingPoint;

	private String description;

	private Integer sortOrder;

	private Boolean recommend;

	private String status;

	private Integer siteId;

	private Integer itemCateId;

	private String itemDetailJson;

	private Integer downloadTimes;

	private String tags;

	private Integer itemPackageId;

	private String source;

	private Date refreshTime;

	public  Object acqPk(){
		return id;
	}
}
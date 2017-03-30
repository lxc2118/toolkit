package com.tg.db.sync.newtg.pojo.boothItem;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class BoothItem implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSlogan(String slogan){
		this.slogan=slogan;
	}

	public String getSlogan(){
		return this.slogan;
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
	public void setStartTime(Date startTime){
		this.startTime=startTime;
	}

	public Date getStartTime(){
		return this.startTime;
	}
	public void setEndTime(Date endTime){
		this.endTime=endTime;
	}

	public Date getEndTime(){
		return this.endTime;
	}
	public void setBoothId(Integer boothId){
		this.boothId=boothId;
	}

	public Integer getBoothId(){
		return this.boothId;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder=sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setUrl(String url){
		this.url=url;
	}

	public String getUrl(){
		return this.url;
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
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setFlag(String flag){
		this.flag=flag;
	}

	public String getFlag(){
		return this.flag;
	}
	public void setFlagColor(String flagColor){
		this.flagColor=flagColor;
	}

	public String getFlagColor(){
		return this.flagColor;
	}

	private Integer id;

	private String slogan;

	private Date createTime;

	private Date updateTime;

	private Date startTime;

	private Date endTime;

	private Integer boothId;

	private Integer sortOrder;

	private String status;

	private String title;

	private String url;

	private Integer picId;

	private Integer shopId;

	private Integer itemId;

	private String remark;

	private Float price;

	private String flag;

	private String flagColor;

	public  Object acqPk(){
		return id;
	}
}
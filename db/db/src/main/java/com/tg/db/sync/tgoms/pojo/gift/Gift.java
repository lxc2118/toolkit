package com.tg.db.sync.tgoms.pojo.gift;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Gift implements IPk,Serializable{
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
	public void setStockNum(Integer stockNum){
		this.stockNum=stockNum;
	}

	public Integer getStockNum(){
		return this.stockNum;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setCostPrice(Float costPrice){
		this.costPrice=costPrice;
	}

	public Float getCostPrice(){
		return this.costPrice;
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
	public void setGiftCategoryId(Integer giftCategoryId){
		this.giftCategoryId=giftCategoryId;
	}

	public Integer getGiftCategoryId(){
		return this.giftCategoryId;
	}
	public void setPic(String pic){
		this.pic=pic;
	}

	public String getPic(){
		return this.pic;
	}
	public void setDefaultType(Integer defaultType){
		this.defaultType=defaultType;
	}

	public Integer getDefaultType(){
		return this.defaultType;
	}

	private Integer id;

	private String name;

	private Integer stockNum;

	private String status;

	private Float price;

	private Float costPrice;

	private Date createTime;

	private Date updateTime;

	private Integer giftCategoryId;

	private String pic;

	private Integer defaultType;

	public  Object acqPk(){
		return id;
	}
}
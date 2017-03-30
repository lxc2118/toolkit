package com.tg.db.sync.sunrise.pojo.advert;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Advert implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setShopId(Integer shopId){
		this.shopId=shopId;
	}

	public Integer getShopId(){
		return this.shopId;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setShopName(String shopName){
		this.shopName=shopName;
	}

	public String getShopName(){
		return this.shopName;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setAd(String ad){
		this.ad=ad;
	}

	public String getAd(){
		return this.ad;
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
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}

	private Integer id;

	private Integer shopId;

	private String phone;

	private String shopName;

	private Float price;

	private String ad;

	private Date startTime;

	private Date endTime;

	private Date createTime;

	private Date updateTime;

	private String status;

	public  Object acqPk(){
		return id;
	}
}
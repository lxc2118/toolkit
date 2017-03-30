package com.tg.db.sync.tgoms.pojo.couponInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class CouponInfo implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setCouponId(Integer couponId){
		this.couponId=couponId;
	}

	public Integer getCouponId(){
		return this.couponId;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setCouponInfoKey(String couponInfoKey){
		this.couponInfoKey=couponInfoKey;
	}

	public String getCouponInfoKey(){
		return this.couponInfoKey;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
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
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setUsedTime(Date usedTime){
		this.usedTime=usedTime;
	}

	public Date getUsedTime(){
		return this.usedTime;
	}
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}

	private Integer id;

	private Integer couponId;

	private String name;

	private Float price;

	private String couponInfoKey;

	private Integer supplierId;

	private Integer sellerId;

	private Integer num;

	private String status;

	private Date createTime;

	private Date startTime;

	private Date endTime;

	private Date updateTime;

	private Date usedTime;

	private Integer orderId;

	public  Object acqPk(){
		return id;
	}
}
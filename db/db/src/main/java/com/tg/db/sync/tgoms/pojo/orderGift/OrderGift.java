package com.tg.db.sync.tgoms.pojo.orderGift;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class OrderGift implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setGiftId(Integer giftId){
		this.giftId=giftId;
	}

	public Integer getGiftId(){
		return this.giftId;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setCostPrice(Float costPrice){
		this.costPrice=costPrice;
	}

	public Float getCostPrice(){
		return this.costPrice;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}

	public String getMsg(){
		return this.msg;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}

	public Long getOrderId(){
		return this.orderId;
	}

	private Integer id;

	private Integer giftId;

	private Integer num;

	private Float costPrice;

	private Float price;

	private String msg;

	private Date createTime;

	private Long orderId;

	public  Object acqPk(){
		return id;
	}
}
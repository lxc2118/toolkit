package com.tg.db.sync.sunrise.pojo.userBills;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class UserBills implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(String id){
		this.id=id;
	}

	public String getId(){
		return this.id;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}

	public Long getUserId(){
		return this.userId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setMoney(Float money){
		this.money=money;
	}

	public Float getMoney(){
		return this.money;
	}
	public void setOrderIds(String orderIds){
		this.orderIds=orderIds;
	}

	public String getOrderIds(){
		return this.orderIds;
	}
	public void setTradeNo(String tradeNo){
		this.tradeNo=tradeNo;
	}

	public String getTradeNo(){
		return this.tradeNo;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	private String id;

	private Long userId;

	private String type;

	private String title;

	private Float money;

	private String orderIds;

	private String tradeNo;

	private Date createTime;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.tgoms.pojo.userWithdraw;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class UserWithdraw implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setAmount(Float amount){
		this.amount=amount;
	}

	public Float getAmount(){
		return this.amount;
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
	public void setAlipayTradeNo(String alipayTradeNo){
		this.alipayTradeNo=alipayTradeNo;
	}

	public String getAlipayTradeNo(){
		return this.alipayTradeNo;
	}

	private Integer id;

	private Integer sellerId;

	private Float amount;

	private Date createTime;

	private Date updateTime;

	private String status;

	private String alipayTradeNo;

	public  Object acqPk(){
		return id;
	}
}
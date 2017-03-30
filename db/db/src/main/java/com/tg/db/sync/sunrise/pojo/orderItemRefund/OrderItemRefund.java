package com.tg.db.sync.sunrise.pojo.orderItemRefund;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class OrderItemRefund implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setRefundReason(String refundReason){
		this.refundReason=refundReason;
	}

	public String getRefundReason(){
		return this.refundReason;
	}
	public void setRefundFee(Float refundFee){
		this.refundFee=refundFee;
	}

	public Float getRefundFee(){
		return this.refundFee;
	}
	public void setRefuseReason(String refuseReason){
		this.refuseReason=refuseReason;
	}

	public String getRefuseReason(){
		return this.refuseReason;
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

	private Long id;

	private Integer num;

	private String refundReason;

	private Float refundFee;

	private String refuseReason;

	private Date createTime;

	private Date updateTime;

	private String status;

	public  Object acqPk(){
		return id;
	}
}
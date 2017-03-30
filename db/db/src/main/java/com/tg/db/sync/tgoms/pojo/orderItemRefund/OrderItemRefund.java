package com.tg.db.sync.tgoms.pojo.orderItemRefund;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class OrderItemRefund implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setReason(String reason){
		this.reason=reason;
	}

	public String getReason(){
		return this.reason;
	}
	public void setRefundFee(Float refundFee){
		this.refundFee=refundFee;
	}

	public Float getRefundFee(){
		return this.refundFee;
	}
	public void setRefundDesc(String refundDesc){
		this.refundDesc=refundDesc;
	}

	public String getRefundDesc(){
		return this.refundDesc;
	}
	public void setPicUrls(String picUrls){
		this.picUrls=picUrls;
	}

	public String getPicUrls(){
		return this.picUrls;
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
	public void setActualRefundFee(Float actualRefundFee){
		this.actualRefundFee=actualRefundFee;
	}

	public Float getActualRefundFee(){
		return this.actualRefundFee;
	}
	public void setLogisticsSid(String logisticsSid){
		this.logisticsSid=logisticsSid;
	}

	public String getLogisticsSid(){
		return this.logisticsSid;
	}

	private Integer id;

	private String reason;

	private Float refundFee;

	private String refundDesc;

	private String picUrls;

	private String refuseReason;

	private Date createTime;

	private Date updateTime;

	private String status;

	private Float actualRefundFee;

	private String logisticsSid;

	public  Object acqPk(){
		return id;
	}
}
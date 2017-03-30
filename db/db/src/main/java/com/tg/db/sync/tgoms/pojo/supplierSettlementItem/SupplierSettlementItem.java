package com.tg.db.sync.tgoms.pojo.supplierSettlementItem;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class SupplierSettlementItem implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setTotalAmount(Float totalAmount){
		this.totalAmount=totalAmount;
	}

	public Float getTotalAmount(){
		return this.totalAmount;
	}
	public void setSupplierSettlementId(Integer supplierSettlementId){
		this.supplierSettlementId=supplierSettlementId;
	}

	public Integer getSupplierSettlementId(){
		return this.supplierSettlementId;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}

	public Date getCreateDate(){
		return this.createDate;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setOrderId(String orderId){
		this.orderId=orderId;
	}

	public String getOrderId(){
		return this.orderId;
	}
	public void setRefundFee(Float refundFee){
		this.refundFee=refundFee;
	}

	public Float getRefundFee(){
		return this.refundFee;
	}
	public void setActualRefundFee(Float actualRefundFee){
		this.actualRefundFee=actualRefundFee;
	}

	public Float getActualRefundFee(){
		return this.actualRefundFee;
	}
	public void setPayment(Float payment){
		this.payment=payment;
	}

	public Float getPayment(){
		return this.payment;
	}
	public void setOrderDate(Date orderDate){
		this.orderDate=orderDate;
	}

	public Date getOrderDate(){
		return this.orderDate;
	}

	private Long id;

	private Float totalAmount;

	private Integer supplierSettlementId;

	private Date createDate;

	private String status;

	private String orderId;

	private Float refundFee;

	private Float actualRefundFee;

	private Float payment;

	private Date orderDate;

	public  Object acqPk(){
		return id;
	}
}
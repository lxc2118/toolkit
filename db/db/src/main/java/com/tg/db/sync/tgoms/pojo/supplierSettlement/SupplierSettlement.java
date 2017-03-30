package com.tg.db.sync.tgoms.pojo.supplierSettlement;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class SupplierSettlement implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setSupplierId(String supplierId){
		this.supplierId=supplierId;
	}

	public String getSupplierId(){
		return this.supplierId;
	}
	public void setTotalAmount(Float totalAmount){
		this.totalAmount=totalAmount;
	}

	public Float getTotalAmount(){
		return this.totalAmount;
	}
	public void setRefundFee(Float refundFee){
		this.refundFee=refundFee;
	}

	public Float getRefundFee(){
		return this.refundFee;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setAmountPayable(Float amountPayable){
		this.amountPayable=amountPayable;
	}

	public Float getAmountPayable(){
		return this.amountPayable;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}

	public Date getCreateDate(){
		return this.createDate;
	}

	private Long id;

	private String supplierId;

	private Float totalAmount;

	private Float refundFee;

	private String status;

	private Float amountPayable;

	private Date createDate;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.sunrise.pojo.omsOrder;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class OmsOrder implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setReceiverName(String receiverName){
		this.receiverName=receiverName;
	}

	public String getReceiverName(){
		return this.receiverName;
	}
	public void setReceiverState(String receiverState){
		this.receiverState=receiverState;
	}

	public String getReceiverState(){
		return this.receiverState;
	}
	public void setReceiverAddress(String receiverAddress){
		this.receiverAddress=receiverAddress;
	}

	public String getReceiverAddress(){
		return this.receiverAddress;
	}
	public void setReceiverMobile(String receiverMobile){
		this.receiverMobile=receiverMobile;
	}

	public String getReceiverMobile(){
		return this.receiverMobile;
	}
	public void setReceiverCity(String receiverCity){
		this.receiverCity=receiverCity;
	}

	public String getReceiverCity(){
		return this.receiverCity;
	}
	public void setReceiverDistrict(String receiverDistrict){
		this.receiverDistrict=receiverDistrict;
	}

	public String getReceiverDistrict(){
		return this.receiverDistrict;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setTotalServiceFee(Float totalServiceFee){
		this.totalServiceFee=totalServiceFee;
	}

	public Float getTotalServiceFee(){
		return this.totalServiceFee;
	}
	public void setTotalGiftFee(Float totalGiftFee){
		this.totalGiftFee=totalGiftFee;
	}

	public Float getTotalGiftFee(){
		return this.totalGiftFee;
	}
	public void setTotalFreight(Float totalFreight){
		this.totalFreight=totalFreight;
	}

	public Float getTotalFreight(){
		return this.totalFreight;
	}
	public void setTotalItemAmount(Float totalItemAmount){
		this.totalItemAmount=totalItemAmount;
	}

	public Float getTotalItemAmount(){
		return this.totalItemAmount;
	}
	public void setTotalItemNum(Integer totalItemNum){
		this.totalItemNum=totalItemNum;
	}

	public Integer getTotalItemNum(){
		return this.totalItemNum;
	}
	public void setTotalAmount(Float totalAmount){
		this.totalAmount=totalAmount;
	}

	public Float getTotalAmount(){
		return this.totalAmount;
	}
	public void setTotalTakenNum(Integer totalTakenNum){
		this.totalTakenNum=totalTakenNum;
	}

	public Integer getTotalTakenNum(){
		return this.totalTakenNum;
	}
	public void setPayment(Float payment){
		this.payment=payment;
	}

	public Float getPayment(){
		return this.payment;
	}
	public void setRefundFee(Float refundFee){
		this.refundFee=refundFee;
	}

	public Float getRefundFee(){
		return this.refundFee;
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
	public void setShipTime(Date shipTime){
		this.shipTime=shipTime;
	}

	public Date getShipTime(){
		return this.shipTime;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setSupplierRemark(String supplierRemark){
		this.supplierRemark=supplierRemark;
	}

	public String getSupplierRemark(){
		return this.supplierRemark;
	}
	public void setLogisticsExpected(String logisticsExpected){
		this.logisticsExpected=logisticsExpected;
	}

	public String getLogisticsExpected(){
		return this.logisticsExpected;
	}
	public void setLogisticsCodeExpected(String logisticsCodeExpected){
		this.logisticsCodeExpected=logisticsCodeExpected;
	}

	public String getLogisticsCodeExpected(){
		return this.logisticsCodeExpected;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName){
		this.logisticsCompanyName=logisticsCompanyName;
	}

	public String getLogisticsCompanyName(){
		return this.logisticsCompanyName;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode){
		this.logisticsCompanyCode=logisticsCompanyCode;
	}

	public String getLogisticsCompanyCode(){
		return this.logisticsCompanyCode;
	}
	public void setLogisticsSid(String logisticsSid){
		this.logisticsSid=logisticsSid;
	}

	public String getLogisticsSid(){
		return this.logisticsSid;
	}
	public void setFreightTemplateId(Integer freightTemplateId){
		this.freightTemplateId=freightTemplateId;
	}

	public Integer getFreightTemplateId(){
		return this.freightTemplateId;
	}
	public void setLogisticsTime(Date logisticsTime){
		this.logisticsTime=logisticsTime;
	}

	public Date getLogisticsTime(){
		return this.logisticsTime;
	}
	public void setSettled(Boolean settled){
		this.settled=settled;
	}

	public Boolean getSettled(){
		return this.settled;
	}
	public void setAdjustedFee(Float adjustedFee){
		this.adjustedFee=adjustedFee;
	}

	public Float getAdjustedFee(){
		return this.adjustedFee;
	}
	public void setLogisticsPrinted(Boolean logisticsPrinted){
		this.logisticsPrinted=logisticsPrinted;
	}

	public Boolean getLogisticsPrinted(){
		return this.logisticsPrinted;
	}
	public void setBuyerNick(String buyerNick){
		this.buyerNick=buyerNick;
	}

	public String getBuyerNick(){
		return this.buyerNick;
	}
	public void setSellerNick(String sellerNick){
		this.sellerNick=sellerNick;
	}

	public String getSellerNick(){
		return this.sellerNick;
	}
	public void setTid(String tid){
		this.tid=tid;
	}

	public String getTid(){
		return this.tid;
	}
	public void setLogisticsNotified(Boolean logisticsNotified){
		this.logisticsNotified=logisticsNotified;
	}

	public Boolean getLogisticsNotified(){
		return this.logisticsNotified;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setLogisticsOnline(Boolean logisticsOnline){
		this.logisticsOnline=logisticsOnline;
	}

	public Boolean getLogisticsOnline(){
		return this.logisticsOnline;
	}
	public void setThxNum(Integer thxNum){
		this.thxNum=thxNum;
	}

	public Integer getThxNum(){
		return this.thxNum;
	}
	public void setUsedThxNum(Integer usedThxNum){
		this.usedThxNum=usedThxNum;
	}

	public Integer getUsedThxNum(){
		return this.usedThxNum;
	}
	public void setOuterOrderId(String outerOrderId){
		this.outerOrderId=outerOrderId;
	}

	public String getOuterOrderId(){
		return this.outerOrderId;
	}

	private Long id;

	private String receiverName;

	private String receiverState;

	private String receiverAddress;

	private String receiverMobile;

	private String receiverCity;

	private String receiverDistrict;

	private Integer userId;

	private Integer supplierId;

	private Float totalServiceFee;

	private Float totalGiftFee;

	private Float totalFreight;

	private Float totalItemAmount;

	private Integer totalItemNum;

	private Float totalAmount;

	private Integer totalTakenNum;

	private Float payment;

	private Float refundFee;

	private Date createTime;

	private Date updateTime;

	private String status;

	private Date shipTime;

	private String remark;

	private String supplierRemark;

	private String logisticsExpected;

	private String logisticsCodeExpected;

	private String logisticsCompanyName;

	private String logisticsCompanyCode;

	private String logisticsSid;

	private Integer freightTemplateId;

	private Date logisticsTime;

	private Boolean settled;

	private Float adjustedFee;

	private Boolean logisticsPrinted;

	private String buyerNick;

	private String sellerNick;

	private String tid;

	private Boolean logisticsNotified;

	private String type;

	private Boolean logisticsOnline;

	private Integer thxNum;

	private Integer usedThxNum;

	private String outerOrderId;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.tgoms.pojo.omsOrder;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class OmsOrder implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setSource(String source){
		this.source=source;
	}

	public String getSource(){
		return this.source;
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
	public void setReceiverAddress(String receiverAddress){
		this.receiverAddress=receiverAddress;
	}

	public String getReceiverAddress(){
		return this.receiverAddress;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setTotalServiceFee(Float totalServiceFee){
		this.totalServiceFee=totalServiceFee;
	}

	public Float getTotalServiceFee(){
		return this.totalServiceFee;
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
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setLogisticsExpected(String logisticsExpected){
		this.logisticsExpected=logisticsExpected;
	}

	public String getLogisticsExpected(){
		return this.logisticsExpected;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName){
		this.logisticsCompanyName=logisticsCompanyName;
	}

	public String getLogisticsCompanyName(){
		return this.logisticsCompanyName;
	}
	public void setLogisticsSid(String logisticsSid){
		this.logisticsSid=logisticsSid;
	}

	public String getLogisticsSid(){
		return this.logisticsSid;
	}
	public void setLogisticsTime(Date logisticsTime){
		this.logisticsTime=logisticsTime;
	}

	public Date getLogisticsTime(){
		return this.logisticsTime;
	}
	public void setRejectReason(String rejectReason){
		this.rejectReason=rejectReason;
	}

	public String getRejectReason(){
		return this.rejectReason;
	}
	public void setLogisticsNotified(Boolean logisticsNotified){
		this.logisticsNotified=logisticsNotified;
	}

	public Boolean getLogisticsNotified(){
		return this.logisticsNotified;
	}
	public void setOuterBuyerNick(String outerBuyerNick){
		this.outerBuyerNick=outerBuyerNick;
	}

	public String getOuterBuyerNick(){
		return this.outerBuyerNick;
	}
	public void setOuterSellerNick(String outerSellerNick){
		this.outerSellerNick=outerSellerNick;
	}

	public String getOuterSellerNick(){
		return this.outerSellerNick;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setOuterOrderId(String outerOrderId){
		this.outerOrderId=outerOrderId;
	}

	public String getOuterOrderId(){
		return this.outerOrderId;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode){
		this.logisticsCompanyCode=logisticsCompanyCode;
	}

	public String getLogisticsCompanyCode(){
		return this.logisticsCompanyCode;
	}
	public void setLogisticsNotifyMsg(String logisticsNotifyMsg){
		this.logisticsNotifyMsg=logisticsNotifyMsg;
	}

	public String getLogisticsNotifyMsg(){
		return this.logisticsNotifyMsg;
	}
	public void setCancelReason(String cancelReason){
		this.cancelReason=cancelReason;
	}

	public String getCancelReason(){
		return this.cancelReason;
	}
	public void setTotalGiftFee(Float totalGiftFee){
		this.totalGiftFee=totalGiftFee;
	}

	public Float getTotalGiftFee(){
		return this.totalGiftFee;
	}
	public void setSettlement(Boolean settlement){
		this.settlement=settlement;
	}

	public Boolean getSettlement(){
		return this.settlement;
	}
	public void setIsExport(Boolean isExport){
		this.isExport=isExport;
	}

	public Boolean getIsExport(){
		return this.isExport;
	}
	public void setAdjustedFee(Float adjustedFee){
		this.adjustedFee=adjustedFee;
	}

	public Float getAdjustedFee(){
		return this.adjustedFee;
	}
	public void setLogisticsCodeExpected(String logisticsCodeExpected){
		this.logisticsCodeExpected=logisticsCodeExpected;
	}

	public String getLogisticsCodeExpected(){
		return this.logisticsCodeExpected;
	}
	public void setLogisticsMark(String logisticsMark){
		this.logisticsMark=logisticsMark;
	}

	public String getLogisticsMark(){
		return this.logisticsMark;
	}
	public void setLogisticsOnline(Boolean logisticsOnline){
		this.logisticsOnline=logisticsOnline;
	}

	public Boolean getLogisticsOnline(){
		return this.logisticsOnline;
	}
	public void setLogisticsSiteName(String logisticsSiteName){
		this.logisticsSiteName=logisticsSiteName;
	}

	public String getLogisticsSiteName(){
		return this.logisticsSiteName;
	}
	public void setLogisticsSiteCode(String logisticsSiteCode){
		this.logisticsSiteCode=logisticsSiteCode;
	}

	public String getLogisticsSiteCode(){
		return this.logisticsSiteCode;
	}
	public void setOutbound(Boolean outbound){
		this.outbound=outbound;
	}

	public Boolean getOutbound(){
		return this.outbound;
	}
	public void setOrderBatchId(Integer orderBatchId){
		this.orderBatchId=orderBatchId;
	}

	public Integer getOrderBatchId(){
		return this.orderBatchId;
	}
	public void setHangUpReason(String hangUpReason){
		this.hangUpReason=hangUpReason;
	}

	public String getHangUpReason(){
		return this.hangUpReason;
	}
	public void setLogisticsPrinted(Boolean logisticsPrinted){
		this.logisticsPrinted=logisticsPrinted;
	}

	public Boolean getLogisticsPrinted(){
		return this.logisticsPrinted;
	}
	public void setSupplierRemark(String supplierRemark){
		this.supplierRemark=supplierRemark;
	}

	public String getSupplierRemark(){
		return this.supplierRemark;
	}
	public void setPostage(Float postage){
		this.postage=postage;
	}

	public Float getPostage(){
		return this.postage;
	}
	public void setPostagePlus(Float postagePlus){
		this.postagePlus=postagePlus;
	}

	public Float getPostagePlus(){
		return this.postagePlus;
	}
	public void setServiceFee(Float serviceFee){
		this.serviceFee=serviceFee;
	}

	public Float getServiceFee(){
		return this.serviceFee;
	}
	public void setShipTime(Date shipTime){
		this.shipTime=shipTime;
	}

	public Date getShipTime(){
		return this.shipTime;
	}
	public void setThxNum(Integer thxNum){
		this.thxNum=thxNum;
	}

	public Integer getThxNum(){
		return this.thxNum;
	}
	public void setThxFee(Float thxFee){
		this.thxFee=thxFee;
	}

	public Float getThxFee(){
		return this.thxFee;
	}
	public void setUsedThxNum(Integer usedThxNum){
		this.usedThxNum=usedThxNum;
	}

	public Integer getUsedThxNum(){
		return this.usedThxNum;
	}

	private Long id;

	private String source;

	private String receiverName;

	private String receiverState;

	private String receiverMobile;

	private String receiverCity;

	private String receiverDistrict;

	private String receiverAddress;

	private Integer sellerId;

	private Float totalServiceFee;

	private Float totalFreight;

	private Float totalItemAmount;

	private Integer totalItemNum;

	private Float totalAmount;

	private Date createTime;

	private Date updateTime;

	private String status;

	private String remark;

	private String logisticsExpected;

	private String logisticsCompanyName;

	private String logisticsSid;

	private Date logisticsTime;

	private String rejectReason;

	private Boolean logisticsNotified;

	private String outerBuyerNick;

	private String outerSellerNick;

	private Integer supplierId;

	private String outerOrderId;

	private String logisticsCompanyCode;

	private String logisticsNotifyMsg;

	private String cancelReason;

	private Float totalGiftFee;

	private Boolean settlement;

	private Boolean isExport;

	private Float adjustedFee;

	private String logisticsCodeExpected;

	private String logisticsMark;

	private Boolean logisticsOnline;

	private String logisticsSiteName;

	private String logisticsSiteCode;

	private Boolean outbound;

	private Integer orderBatchId;

	private String hangUpReason;

	private Boolean logisticsPrinted;

	private String supplierRemark;

	private Float postage;

	private Float postagePlus;

	private Float serviceFee;

	private Date shipTime;

	private Integer thxNum;

	private Float thxFee;

	private Integer usedThxNum;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.sunrise.pojo.trade;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Trade implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setTid(Long tid){
		this.tid=tid;
	}

	public Long getTid(){
		return this.tid;
	}
	public void setSellerNick(String sellerNick){
		this.sellerNick=sellerNick;
	}

	public String getSellerNick(){
		return this.sellerNick;
	}
	public void setPicPath(String picPath){
		this.picPath=picPath;
	}

	public String getPicPath(){
		return this.picPath;
	}
	public void setPayment(String payment){
		this.payment=payment;
	}

	public String getPayment(){
		return this.payment;
	}
	public void setSellerRate(Boolean sellerRate){
		this.sellerRate=sellerRate;
	}

	public Boolean getSellerRate(){
		return this.sellerRate;
	}
	public void setPostFee(String postFee){
		this.postFee=postFee;
	}

	public String getPostFee(){
		return this.postFee;
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
	public void setReceiverZip(String receiverZip){
		this.receiverZip=receiverZip;
	}

	public String getReceiverZip(){
		return this.receiverZip;
	}
	public void setLogisticsId(Integer logisticsId){
		this.logisticsId=logisticsId;
	}

	public Integer getLogisticsId(){
		return this.logisticsId;
	}
	public void setReceiverPhone(String receiverPhone){
		this.receiverPhone=receiverPhone;
	}

	public String getReceiverPhone(){
		return this.receiverPhone;
	}
	public void setReceiverMobile(String receiverMobile){
		this.receiverMobile=receiverMobile;
	}

	public String getReceiverMobile(){
		return this.receiverMobile;
	}
	public void setConsignTime(Date consignTime){
		this.consignTime=consignTime;
	}

	public Date getConsignTime(){
		return this.consignTime;
	}
	public void setReceiverPayment(String receiverPayment){
		this.receiverPayment=receiverPayment;
	}

	public String getReceiverPayment(){
		return this.receiverPayment;
	}
	public void setNum(Long num){
		this.num=num;
	}

	public Long getNum(){
		return this.num;
	}
	public void setNumIid(Long numIid){
		this.numIid=numIid;
	}

	public Long getNumIid(){
		return this.numIid;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setPrice(String price){
		this.price=price;
	}

	public String getPrice(){
		return this.price;
	}
	public void setDiscountFee(String discountFee){
		this.discountFee=discountFee;
	}

	public String getDiscountFee(){
		return this.discountFee;
	}
	public void setPointFee(Long pointFee){
		this.pointFee=pointFee;
	}

	public Long getPointFee(){
		return this.pointFee;
	}
	public void setTotalFee(String totalFee){
		this.totalFee=totalFee;
	}

	public String getTotalFee(){
		return this.totalFee;
	}
	public void setIsLgtype(Boolean isLgtype){
		this.isLgtype=isLgtype;
	}

	public Boolean getIsLgtype(){
		return this.isLgtype;
	}
	public void setIsBrandSale(Boolean isBrandSale){
		this.isBrandSale=isBrandSale;
	}

	public Boolean getIsBrandSale(){
		return this.isBrandSale;
	}
	public void setIsForceWlb(Boolean isForceWlb){
		this.isForceWlb=isForceWlb;
	}

	public Boolean getIsForceWlb(){
		return this.isForceWlb;
	}
	public void setLgAging(String lgAging){
		this.lgAging=lgAging;
	}

	public String getLgAging(){
		return this.lgAging;
	}
	public void setLgAgingType(String lgAgingType){
		this.lgAgingType=lgAgingType;
	}

	public String getLgAgingType(){
		return this.lgAgingType;
	}
	public void setCreated(Date created){
		this.created=created;
	}

	public Date getCreated(){
		return this.created;
	}
	public void setPayTime(Date payTime){
		this.payTime=payTime;
	}

	public Date getPayTime(){
		return this.payTime;
	}
	public void setModified(Date modified){
		this.modified=modified;
	}

	public Date getModified(){
		return this.modified;
	}
	public void setEndTime(Date endTime){
		this.endTime=endTime;
	}

	public Date getEndTime(){
		return this.endTime;
	}
	public void setAlipayId(Long alipayId){
		this.alipayId=alipayId;
	}

	public Long getAlipayId(){
		return this.alipayId;
	}
	public void setAlipayNo(String alipayNo){
		this.alipayNo=alipayNo;
	}

	public String getAlipayNo(){
		return this.alipayNo;
	}
	public void setSellerFlag(Long sellerFlag){
		this.sellerFlag=sellerFlag;
	}

	public Long getSellerFlag(){
		return this.sellerFlag;
	}
	public void setBuyerNick(String buyerNick){
		this.buyerNick=buyerNick;
	}

	public String getBuyerNick(){
		return this.buyerNick;
	}
	public void setBuyerArea(String buyerArea){
		this.buyerArea=buyerArea;
	}

	public String getBuyerArea(){
		return this.buyerArea;
	}
	public void setHasYfx(Boolean hasYfx){
		this.hasYfx=hasYfx;
	}

	public Boolean getHasYfx(){
		return this.hasYfx;
	}
	public void setYfxFee(String yfxFee){
		this.yfxFee=yfxFee;
	}

	public String getYfxFee(){
		return this.yfxFee;
	}
	public void setYfxId(String yfxId){
		this.yfxId=yfxId;
	}

	public String getYfxId(){
		return this.yfxId;
	}
	public void setYfxType(String yfxType){
		this.yfxType=yfxType;
	}

	public String getYfxType(){
		return this.yfxType;
	}
	public void setCreditCardFee(String creditCardFee){
		this.creditCardFee=creditCardFee;
	}

	public String getCreditCardFee(){
		return this.creditCardFee;
	}
	public void setNutFeature(String nutFeature){
		this.nutFeature=nutFeature;
	}

	public String getNutFeature(){
		return this.nutFeature;
	}
	public void setStepTradeStatus(String stepTradeStatus){
		this.stepTradeStatus=stepTradeStatus;
	}

	public String getStepTradeStatus(){
		return this.stepTradeStatus;
	}
	public void setStepPaidFee(String stepPaidFee){
		this.stepPaidFee=stepPaidFee;
	}

	public String getStepPaidFee(){
		return this.stepPaidFee;
	}
	public void setMarkDesc(String markDesc){
		this.markDesc=markDesc;
	}

	public String getMarkDesc(){
		return this.markDesc;
	}
	public void setSendTime(String sendTime){
		this.sendTime=sendTime;
	}

	public String getSendTime(){
		return this.sendTime;
	}
	public void setShippingType(String shippingType){
		this.shippingType=shippingType;
	}

	public String getShippingType(){
		return this.shippingType;
	}
	public void setAdjustFee(String adjustFee){
		this.adjustFee=adjustFee;
	}

	public String getAdjustFee(){
		return this.adjustFee;
	}
	public void setBuyerObtainPointFee(Long buyerObtainPointFee){
		this.buyerObtainPointFee=buyerObtainPointFee;
	}

	public Long getBuyerObtainPointFee(){
		return this.buyerObtainPointFee;
	}
	public void setCodFee(String codFee){
		this.codFee=codFee;
	}

	public String getCodFee(){
		return this.codFee;
	}
	public void setTradeFrom(String tradeFrom){
		this.tradeFrom=tradeFrom;
	}

	public String getTradeFrom(){
		return this.tradeFrom;
	}
	public void setCodStatus(String codStatus){
		this.codStatus=codStatus;
	}

	public String getCodStatus(){
		return this.codStatus;
	}
	public void setCommissionFee(String commissionFee){
		this.commissionFee=commissionFee;
	}

	public String getCommissionFee(){
		return this.commissionFee;
	}
	public void setBuyerRate(Boolean buyerRate){
		this.buyerRate=buyerRate;
	}

	public Boolean getBuyerRate(){
		return this.buyerRate;
	}
	public void setTradeSource(String tradeSource){
		this.tradeSource=tradeSource;
	}

	public String getTradeSource(){
		return this.tradeSource;
	}
	public void setSellerCanRate(Boolean sellerCanRate){
		this.sellerCanRate=sellerCanRate;
	}

	public Boolean getSellerCanRate(){
		return this.sellerCanRate;
	}
	public void setIsPartConsign(Boolean isPartConsign){
		this.isPartConsign=isPartConsign;
	}

	public Boolean getIsPartConsign(){
		return this.isPartConsign;
	}
	public void setIsDaixiao(Boolean isDaixiao){
		this.isDaixiao=isDaixiao;
	}

	public Boolean getIsDaixiao(){
		return this.isDaixiao;
	}
	public void setRealPointFee(Long realPointFee){
		this.realPointFee=realPointFee;
	}

	public Long getRealPointFee(){
		return this.realPointFee;
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
	public void setAsyncModified(Date asyncModified){
		this.asyncModified=asyncModified;
	}

	public Date getAsyncModified(){
		return this.asyncModified;
	}
	public void setO2o(String o2o){
		this.o2o=o2o;
	}

	public String getO2o(){
		return this.o2o;
	}
	public void setO2oGuideId(String o2oGuideId){
		this.o2oGuideId=o2oGuideId;
	}

	public String getO2oGuideId(){
		return this.o2oGuideId;
	}
	public void setO2oShopId(String o2oShopId){
		this.o2oShopId=o2oShopId;
	}

	public String getO2oShopId(){
		return this.o2oShopId;
	}
	public void setO2oShopName(String o2oShopName){
		this.o2oShopName=o2oShopName;
	}

	public String getO2oShopName(){
		return this.o2oShopName;
	}
	public void setO2oGuideName(String o2oGuideName){
		this.o2oGuideName=o2oGuideName;
	}

	public String getO2oGuideName(){
		return this.o2oGuideName;
	}
	public void setO2oDelivery(String o2oDelivery){
		this.o2oDelivery=o2oDelivery;
	}

	public String getO2oDelivery(){
		return this.o2oDelivery;
	}
	public void setZeroPurchase(Boolean zeroPurchase){
		this.zeroPurchase=zeroPurchase;
	}

	public Boolean getZeroPurchase(){
		return this.zeroPurchase;
	}
	public void setO2oOutTradeId(String o2oOutTradeId){
		this.o2oOutTradeId=o2oOutTradeId;
	}

	public String getO2oOutTradeId(){
		return this.o2oOutTradeId;
	}
	public void setIsWt(Integer isWt){
		this.isWt=isWt;
	}

	public Integer getIsWt(){
		return this.isWt;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setDaifa(String daifa){
		this.daifa=daifa;
	}

	public String getDaifa(){
		return this.daifa;
	}
	public void setBuyerMemo(String buyerMemo){
		this.buyerMemo=buyerMemo;
	}

	public String getBuyerMemo(){
		return this.buyerMemo;
	}
	public void setSellerMemo(String sellerMemo){
		this.sellerMemo=sellerMemo;
	}

	public String getSellerMemo(){
		return this.sellerMemo;
	}
	public void setBuyerMessage(String buyerMessage){
		this.buyerMessage=buyerMessage;
	}

	public String getBuyerMessage(){
		return this.buyerMessage;
	}
	public void setDaifaStatus(String daifaStatus){
		this.daifaStatus=daifaStatus;
	}

	public String getDaifaStatus(){
		return this.daifaStatus;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}

	private Long tid;

	private String sellerNick;

	private String picPath;

	private String payment;

	private Boolean sellerRate;

	private String postFee;

	private String receiverName;

	private String receiverState;

	private String receiverAddress;

	private String receiverZip;

	private Integer logisticsId;

	private String receiverPhone;

	private String receiverMobile;

	private Date consignTime;

	private String receiverPayment;

	private Long num;

	private Long numIid;

	private String status;

	private String title;

	private String type;

	private String price;

	private String discountFee;

	private Long pointFee;

	private String totalFee;

	private Boolean isLgtype;

	private Boolean isBrandSale;

	private Boolean isForceWlb;

	private String lgAging;

	private String lgAgingType;

	private Date created;

	private Date payTime;

	private Date modified;

	private Date endTime;

	private Long alipayId;

	private String alipayNo;

	private Long sellerFlag;

	private String buyerNick;

	private String buyerArea;

	private Boolean hasYfx;

	private String yfxFee;

	private String yfxId;

	private String yfxType;

	private String creditCardFee;

	private String nutFeature;

	private String stepTradeStatus;

	private String stepPaidFee;

	private String markDesc;

	private String sendTime;

	private String shippingType;

	private String adjustFee;

	private Long buyerObtainPointFee;

	private String codFee;

	private String tradeFrom;

	private String codStatus;

	private String commissionFee;

	private Boolean buyerRate;

	private String tradeSource;

	private Boolean sellerCanRate;

	private Boolean isPartConsign;

	private Boolean isDaixiao;

	private Long realPointFee;

	private String receiverCity;

	private String receiverDistrict;

	private Date asyncModified;

	private String o2o;

	private String o2oGuideId;

	private String o2oShopId;

	private String o2oShopName;

	private String o2oGuideName;

	private String o2oDelivery;

	private Boolean zeroPurchase;

	private String o2oOutTradeId;

	private Integer isWt;

	private Date updateTime;

	private String daifa;

	private String buyerMemo;

	private String sellerMemo;

	private String buyerMessage;

	private String daifaStatus;

	private String remark;

	private Integer sellerId;

	public  Object acqPk(){
		return tid;
	}
}
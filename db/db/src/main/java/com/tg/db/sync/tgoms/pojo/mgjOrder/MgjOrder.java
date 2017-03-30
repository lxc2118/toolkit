package com.tg.db.sync.tgoms.pojo.mgjOrder;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class MgjOrder implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setShopOrderId(Long shopOrderId){
		this.shopOrderId=shopOrderId;
	}

	public Long getShopOrderId(){
		return this.shopOrderId;
	}
	public void setCreatedStr(String createdStr){
		this.createdStr=createdStr;
	}

	public String getCreatedStr(){
		return this.createdStr;
	}
	public void setPayTimeStr(String payTimeStr){
		this.payTimeStr=payTimeStr;
	}

	public String getPayTimeStr(){
		return this.payTimeStr;
	}
	public void setShipTimeStr(String shipTimeStr){
		this.shipTimeStr=shipTimeStr;
	}

	public String getShipTimeStr(){
		return this.shipTimeStr;
	}
	public void setReceiveTimeStr(String receiveTimeStr){
		this.receiveTimeStr=receiveTimeStr;
	}

	public String getReceiveTimeStr(){
		return this.receiveTimeStr;
	}
	public void setBuyerName(String buyerName){
		this.buyerName=buyerName;
	}

	public String getBuyerName(){
		return this.buyerName;
	}
	public void setBuyerAccountId(String buyerAccountId){
		this.buyerAccountId=buyerAccountId;
	}

	public String getBuyerAccountId(){
		return this.buyerAccountId;
	}
	public void setSellerName(String sellerName){
		this.sellerName=sellerName;
	}

	public String getSellerName(){
		return this.sellerName;
	}
	public void setSellerAccountId(String sellerAccountId){
		this.sellerAccountId=sellerAccountId;
	}

	public String getSellerAccountId(){
		return this.sellerAccountId;
	}
	public void setShopOrderType(String shopOrderType){
		this.shopOrderType=shopOrderType;
	}

	public String getShopOrderType(){
		return this.shopOrderType;
	}
	public void setShopOrderPrice(String shopOrderPrice){
		this.shopOrderPrice=shopOrderPrice;
	}

	public String getShopOrderPrice(){
		return this.shopOrderPrice;
	}
	public void setPromotionAmount(String promotionAmount){
		this.promotionAmount=promotionAmount;
	}

	public String getPromotionAmount(){
		return this.promotionAmount;
	}
	public void setPlatformPromotionAmount(String platformPromotionAmount){
		this.platformPromotionAmount=platformPromotionAmount;
	}

	public String getPlatformPromotionAmount(){
		return this.platformPromotionAmount;
	}
	public void setShopPromotionAmount(String shopPromotionAmount){
		this.shopPromotionAmount=shopPromotionAmount;
	}

	public String getShopPromotionAmount(){
		return this.shopPromotionAmount;
	}
	public void setShipExpense(Long shipExpense){
		this.shipExpense=shipExpense;
	}

	public Long getShipExpense(){
		return this.shipExpense;
	}
	public void setNumber(Long number){
		this.number=number;
	}

	public Long getNumber(){
		return this.number;
	}
	public void setIsRate(Integer isRate){
		this.isRate=isRate;
	}

	public Integer getIsRate(){
		return this.isRate;
	}
	public void setBuyerComment(String buyerComment){
		this.buyerComment=buyerComment;
	}

	public String getBuyerComment(){
		return this.buyerComment;
	}
	public void setSellerComment(String sellerComment){
		this.sellerComment=sellerComment;
	}

	public String getSellerComment(){
		return this.sellerComment;
	}
	public void setShipType(Integer shipType){
		this.shipType=shipType;
	}

	public Integer getShipType(){
		return this.shipType;
	}
	public void setReceiverName(String receiverName){
		this.receiverName=receiverName;
	}

	public String getReceiverName(){
		return this.receiverName;
	}
	public void setReceiverMobile(String receiverMobile){
		this.receiverMobile=receiverMobile;
	}

	public String getReceiverMobile(){
		return this.receiverMobile;
	}
	public void setReceiverProvince(String receiverProvince){
		this.receiverProvince=receiverProvince;
	}

	public String getReceiverProvince(){
		return this.receiverProvince;
	}
	public void setReceiverCity(String receiverCity){
		this.receiverCity=receiverCity;
	}

	public String getReceiverCity(){
		return this.receiverCity;
	}
	public void setReceiverArea(String receiverArea){
		this.receiverArea=receiverArea;
	}

	public String getReceiverArea(){
		return this.receiverArea;
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
	public void setReceiverPhone(String receiverPhone){
		this.receiverPhone=receiverPhone;
	}

	public String getReceiverPhone(){
		return this.receiverPhone;
	}
	public void setShipExpressId(String shipExpressId){
		this.shipExpressId=shipExpressId;
	}

	public String getShipExpressId(){
		return this.shipExpressId;
	}
	public void setShipExpressName(String shipExpressName){
		this.shipExpressName=shipExpressName;
	}

	public String getShipExpressName(){
		return this.shipExpressName;
	}
	public void setStageStatus(String stageStatus){
		this.stageStatus=stageStatus;
	}

	public String getStageStatus(){
		return this.stageStatus;
	}
	public void setPayOrderId(Long payOrderId){
		this.payOrderId=payOrderId;
	}

	public Long getPayOrderId(){
		return this.payOrderId;
	}
	public void setPayType(String payType){
		this.payType=payType;
	}

	public String getPayType(){
		return this.payType;
	}
	public void setOrderStatus(String orderStatus){
		this.orderStatus=orderStatus;
	}

	public String getOrderStatus(){
		return this.orderStatus;
	}
	public void setCardInfoId(Long cardInfoId){
		this.cardInfoId=cardInfoId;
	}

	public Long getCardInfoId(){
		return this.cardInfoId;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setMgjUserId(String mgjUserId){
		this.mgjUserId=mgjUserId;
	}

	public String getMgjUserId(){
		return this.mgjUserId;
	}

	private Long id;

	private Long shopOrderId;

	private String createdStr;

	private String payTimeStr;

	private String shipTimeStr;

	private String receiveTimeStr;

	private String buyerName;

	private String buyerAccountId;

	private String sellerName;

	private String sellerAccountId;

	private String shopOrderType;

	private String shopOrderPrice;

	private String promotionAmount;

	private String platformPromotionAmount;

	private String shopPromotionAmount;

	private Long shipExpense;

	private Long number;

	private Integer isRate;

	private String buyerComment;

	private String sellerComment;

	private Integer shipType;

	private String receiverName;

	private String receiverMobile;

	private String receiverProvince;

	private String receiverCity;

	private String receiverArea;

	private String receiverAddress;

	private String receiverZip;

	private String receiverPhone;

	private String shipExpressId;

	private String shipExpressName;

	private String stageStatus;

	private Long payOrderId;

	private String payType;

	private String orderStatus;

	private Long cardInfoId;

	private Integer sellerId;

	private String mgjUserId;

	public  Object acqPk(){
		return id;
	}
}
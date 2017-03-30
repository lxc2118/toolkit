package com.tg.db.sync.tgoms.pojo.sellerMsgNotifySettings;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class SellerMsgNotifySettings implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setOrderPaidNotify(Boolean orderPaidNotify){
		this.orderPaidNotify=orderPaidNotify;
	}

	public Boolean getOrderPaidNotify(){
		return this.orderPaidNotify;
	}
	public void setOrderConfirmNotify(Boolean orderConfirmNotify){
		this.orderConfirmNotify=orderConfirmNotify;
	}

	public Boolean getOrderConfirmNotify(){
		return this.orderConfirmNotify;
	}
	public void setOrderCancelNotify(Boolean orderCancelNotify){
		this.orderCancelNotify=orderCancelNotify;
	}

	public Boolean getOrderCancelNotify(){
		return this.orderCancelNotify;
	}
	public void setOrderRefuseNotify(Boolean orderRefuseNotify){
		this.orderRefuseNotify=orderRefuseNotify;
	}

	public Boolean getOrderRefuseNotify(){
		return this.orderRefuseNotify;
	}
	public void setOrderBackNotify(Boolean orderBackNotify){
		this.orderBackNotify=orderBackNotify;
	}

	public Boolean getOrderBackNotify(){
		return this.orderBackNotify;
	}
	public void setMoneyRechargeNotify(Boolean moneyRechargeNotify){
		this.moneyRechargeNotify=moneyRechargeNotify;
	}

	public Boolean getMoneyRechargeNotify(){
		return this.moneyRechargeNotify;
	}
	public void setMoneyWithdrawNotify(Boolean moneyWithdrawNotify){
		this.moneyWithdrawNotify=moneyWithdrawNotify;
	}

	public Boolean getMoneyWithdrawNotify(){
		return this.moneyWithdrawNotify;
	}

	private Integer sellerId;

	private Boolean orderPaidNotify;

	private Boolean orderConfirmNotify;

	private Boolean orderCancelNotify;

	private Boolean orderRefuseNotify;

	private Boolean orderBackNotify;

	private Boolean moneyRechargeNotify;

	private Boolean moneyWithdrawNotify;

	public  Object acqPk(){
		return sellerId;
	}
}
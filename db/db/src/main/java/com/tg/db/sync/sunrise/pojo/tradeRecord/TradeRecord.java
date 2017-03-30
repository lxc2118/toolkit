package com.tg.db.sync.sunrise.pojo.tradeRecord;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class TradeRecord implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}

	public Long getOrderId(){
		return this.orderId;
	}
	public void setTradeNo(String tradeNo){
		this.tradeNo=tradeNo;
	}

	public String getTradeNo(){
		return this.tradeNo;
	}
	public void setOutTradeNo(Long outTradeNo){
		this.outTradeNo=outTradeNo;
	}

	public Long getOutTradeNo(){
		return this.outTradeNo;
	}
	public void setTradeStatus(String tradeStatus){
		this.tradeStatus=tradeStatus;
	}

	public String getTradeStatus(){
		return this.tradeStatus;
	}
	public void setGmtCreate(Date gmtCreate){
		this.gmtCreate=gmtCreate;
	}

	public Date getGmtCreate(){
		return this.gmtCreate;
	}
	public void setGmtPayment(Date gmtPayment){
		this.gmtPayment=gmtPayment;
	}

	public Date getGmtPayment(){
		return this.gmtPayment;
	}

	private Long id;

	private Long orderId;

	private String tradeNo;

	private Long outTradeNo;

	private String tradeStatus;

	private Date gmtCreate;

	private Date gmtPayment;

	public  Object acqPk(){
		return id;
	}
}
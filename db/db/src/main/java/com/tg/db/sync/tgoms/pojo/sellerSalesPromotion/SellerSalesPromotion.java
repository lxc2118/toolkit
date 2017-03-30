package com.tg.db.sync.tgoms.pojo.sellerSalesPromotion;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class SellerSalesPromotion implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setIntegral(Integer integral){
		this.integral=integral;
	}

	public Integer getIntegral(){
		return this.integral;
	}
	public void setFreeNum(Integer freeNum){
		this.freeNum=freeNum;
	}

	public Integer getFreeNum(){
		return this.freeNum;
	}
	public void setTradeNum(Integer tradeNum){
		this.tradeNum=tradeNum;
	}

	public Integer getTradeNum(){
		return this.tradeNum;
	}
	public void setSellerId(String sellerId){
		this.sellerId=sellerId;
	}

	public String getSellerId(){
		return this.sellerId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setSalesPromotionId(String salesPromotionId){
		this.salesPromotionId=salesPromotionId;
	}

	public String getSalesPromotionId(){
		return this.salesPromotionId;
	}

	private Integer id;

	private Integer integral;

	private Integer freeNum;

	private Integer tradeNum;

	private String sellerId;

	private String status;

	private String salesPromotionId;

	public  Object acqPk(){
		return id;
	}
}
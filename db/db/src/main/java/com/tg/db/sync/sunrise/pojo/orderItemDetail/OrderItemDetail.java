package com.tg.db.sync.sunrise.pojo.orderItemDetail;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class OrderItemDetail implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setSkuNames(String skuNames){
		this.skuNames=skuNames;
	}

	public String getSkuNames(){
		return this.skuNames;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemName(){
		return this.itemName;
	}
	public void setCompanyName(String companyName){
		this.companyName=companyName;
	}

	public String getCompanyName(){
		return this.companyName;
	}
	public void setCompanyAddress(String companyAddress){
		this.companyAddress=companyAddress;
	}

	public String getCompanyAddress(){
		return this.companyAddress;
	}
	public void setCompanyPhone(String companyPhone){
		this.companyPhone=companyPhone;
	}

	public String getCompanyPhone(){
		return this.companyPhone;
	}
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}

	public Long getOrderId(){
		return this.orderId;
	}

	private Long id;

	private String skuNames;

	private String itemName;

	private String companyName;

	private String companyAddress;

	private String companyPhone;

	private Long orderId;

	public  Object acqPk(){
		return id;
	}
}
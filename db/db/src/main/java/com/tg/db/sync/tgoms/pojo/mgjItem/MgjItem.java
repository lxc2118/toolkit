package com.tg.db.sync.tgoms.pojo.mgjItem;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class MgjItem implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setItemOrderId(Long itemOrderId){
		this.itemOrderId=itemOrderId;
	}

	public Long getItemOrderId(){
		return this.itemOrderId;
	}
	public void setShopOrderId(Long shopOrderId){
		this.shopOrderId=shopOrderId;
	}

	public Long getShopOrderId(){
		return this.shopOrderId;
	}
	public void setItemCode(String itemCode){
		this.itemCode=itemCode;
	}

	public String getItemCode(){
		return this.itemCode;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setImg(String img){
		this.img=img;
	}

	public String getImg(){
		return this.img;
	}
	public void setImgUrl(String imgUrl){
		this.imgUrl=imgUrl;
	}

	public String getImgUrl(){
		return this.imgUrl;
	}
	public void setSkuCode(String skuCode){
		this.skuCode=skuCode;
	}

	public String getSkuCode(){
		return this.skuCode;
	}
	public void setSkuAttributes(String skuAttributes){
		this.skuAttributes=skuAttributes;
	}

	public String getSkuAttributes(){
		return this.skuAttributes;
	}
	public void setNumber(Long number){
		this.number=number;
	}

	public Long getNumber(){
		return this.number;
	}
	public void setPrice(Long price){
		this.price=price;
	}

	public Long getPrice(){
		return this.price;
	}
	public void setRefundStatus(String refundStatus){
		this.refundStatus=refundStatus;
	}

	public String getRefundStatus(){
		return this.refundStatus;
	}
	public void setNowPrice(Long nowPrice){
		this.nowPrice=nowPrice;
	}

	public Long getNowPrice(){
		return this.nowPrice;
	}

	private Integer id;

	private Long itemOrderId;

	private Long shopOrderId;

	private String itemCode;

	private String title;

	private String img;

	private String imgUrl;

	private String skuCode;

	private String skuAttributes;

	private Long number;

	private Long price;

	private String refundStatus;

	private Long nowPrice;

	public  Object acqPk(){
		return id;
	}
}
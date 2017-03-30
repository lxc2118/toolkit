package com.tg.db.sync.tgoms.pojo.sellerGift;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class SellerGift implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setGiftId(Integer giftId){
		this.giftId=giftId;
	}

	public Integer getGiftId(){
		return this.giftId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setSelected(Boolean selected){
		this.selected=selected;
	}

	public Boolean getSelected(){
		return this.selected;
	}

	private Integer id;

	private Integer sellerId;

	private Integer giftId;

	private Date createTime;

	private Boolean selected;

	public  Object acqPk(){
		return id;
	}
}
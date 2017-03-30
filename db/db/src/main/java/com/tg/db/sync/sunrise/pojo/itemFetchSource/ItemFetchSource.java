package com.tg.db.sync.sunrise.pojo.itemFetchSource;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class ItemFetchSource implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setSourceUrl(String sourceUrl){
		this.sourceUrl=sourceUrl;
	}

	public String getSourceUrl(){
		return this.sourceUrl;
	}
	public void setComeFrom(String comeFrom){
		this.comeFrom=comeFrom;
	}

	public String getComeFrom(){
		return this.comeFrom;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setProductId(String productId){
		this.productId=productId;
	}

	public String getProductId(){
		return this.productId;
	}

	private Integer itemId;

	private String sourceUrl;

	private String comeFrom;

	private Date createTime;

	private String productId;

	public  Object acqPk(){
		return itemId;
	}
}
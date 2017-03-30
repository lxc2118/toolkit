package com.tg.db.sync.sunrise.pojo.shopNotice;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class ShopNotice implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setShopId(Integer shopId){
		this.shopId=shopId;
	}

	public Integer getShopId(){
		return this.shopId;
	}
	public void setContent(String content){
		this.content=content;
	}

	public String getContent(){
		return this.content;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	private Integer id;

	private Integer shopId;

	private String content;

	private Date createTime;

	public  Object acqPk(){
		return id;
	}
}
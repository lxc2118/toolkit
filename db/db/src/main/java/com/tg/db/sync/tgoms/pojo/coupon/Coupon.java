package com.tg.db.sync.tgoms.pojo.coupon;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Coupon implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setValidTime(Integer validTime){
		this.validTime=validTime;
	}

	public Integer getValidTime(){
		return this.validTime;
	}
	public void setLink(String link){
		this.link=link;
	}

	public String getLink(){
		return this.link;
	}

	private Integer id;

	private String name;

	private Integer num;

	private Float price;

	private Integer supplierId;

	private Date createTime;

	private Date updateTime;

	private Integer validTime;

	private String link;

	public  Object acqPk(){
		return id;
	}
}
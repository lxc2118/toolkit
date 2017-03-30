package com.tg.db.sync.sunrise.pojo.userCart;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class UserCart implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setSkuNames(String skuNames){
		this.skuNames=skuNames;
	}

	public String getSkuNames(){
		return this.skuNames;
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
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setSkuProp(String skuProp){
		this.skuProp=skuProp;
	}

	public String getSkuProp(){
		return this.skuProp;
	}
	public void setValid(Boolean valid){
		this.valid=valid;
	}

	public Boolean getValid(){
		return this.valid;
	}

	private Integer id;

	private Integer userId;

	private Integer num;

	private String skuNames;

	private Date createTime;

	private Date updateTime;

	private Integer itemId;

	private String skuProp;

	private Boolean valid;

	public  Object acqPk(){
		return id;
	}
}
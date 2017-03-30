package com.tg.db.sync.sunrise.pojo.message;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Message implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
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
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}

	private Integer id;

	private String title;

	private String content;

	private Date createTime;

	private Date updateTime;

	private Integer userId;

	private Integer orderId;

	private Integer supplierId;

	private String type;

	private String status;

	public  Object acqPk(){
		return id;
	}
}
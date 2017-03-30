package com.tg.db.sync.sunrise.pojo.itemPackage;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class ItemPackage implements IPk,Serializable{
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
	public void setSize(Integer size){
		this.size=size;
	}

	public Integer getSize(){
		return this.size;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setFileId(Integer fileId){
		this.fileId=fileId;
	}

	public Integer getFileId(){
		return this.fileId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setShopId(Integer shopId){
		this.shopId=shopId;
	}

	public Integer getShopId(){
		return this.shopId;
	}

	private Integer id;

	private String name;

	private Integer size;

	private Date createTime;

	private Integer itemId;

	private Integer fileId;

	private String status;

	private Date updateTime;

	private Integer shopId;

	public  Object acqPk(){
		return id;
	}
}
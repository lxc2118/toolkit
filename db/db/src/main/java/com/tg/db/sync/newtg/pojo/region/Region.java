package com.tg.db.sync.newtg.pojo.region;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="newtg")
@Component
public class Region implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(String id){
		this.id=id;
	}

	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setParentId(String parentId){
		this.parentId=parentId;
	}

	public String getParentId(){
		return this.parentId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}

	private String id;

	private String name;

	private String parentId;

	private String status;

	public  Object acqPk(){
		return id;
	}
}
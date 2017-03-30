package com.tg.db.sync.newtg.pojo.role;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class Role implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setScope(String scope){
		this.scope=scope;
	}

	public String getScope(){
		return this.scope;
	}
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setValid(Boolean valid){
		this.valid=valid;
	}

	public Boolean getValid(){
		return this.valid;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	private String scope;

	private Long id;

	private String name;

	private Boolean valid;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.sunrise.pojo.itemPropMeta;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class ItemPropMeta implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setPid(Integer pid){
		this.pid=pid;
	}

	public Integer getPid(){
		return this.pid;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setColorProp(Boolean colorProp){
		this.colorProp=colorProp;
	}

	public Boolean getColorProp(){
		return this.colorProp;
	}
	public void setEnumProp(Boolean enumProp){
		this.enumProp=enumProp;
	}

	public Boolean getEnumProp(){
		return this.enumProp;
	}
	public void setSaleProp(Boolean saleProp){
		this.saleProp=saleProp;
	}

	public Boolean getSaleProp(){
		return this.saleProp;
	}
	public void setItemProp(Boolean itemProp){
		this.itemProp=itemProp;
	}

	public Boolean getItemProp(){
		return this.itemProp;
	}

	private Integer pid;

	private String name;

	private Boolean colorProp;

	private Boolean enumProp;

	private Boolean saleProp;

	private Boolean itemProp;

	public  Object acqPk(){
		return pid;
	}
}
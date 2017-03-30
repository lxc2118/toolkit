package com.tg.db.sync.sunrise.pojo.itemArea;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class ItemArea implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
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
	public void setSupplierId(Long supplierId){
		this.supplierId=supplierId;
	}

	public Long getSupplierId(){
		return this.supplierId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}

	private Long id;

	private String name;

	private Long supplierId;

	private String status;

	public  Object acqPk(){
		return id;
	}
}
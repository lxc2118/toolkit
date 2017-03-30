package com.tg.db.sync.tgoms.pojo.supplierLogistics;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class SupplierLogistics implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setCode(String code){
		this.code=code;
	}

	public String getCode(){
		return this.code;
	}
	public void setCpId(Integer cpId){
		this.cpId=cpId;
	}

	public Integer getCpId(){
		return this.cpId;
	}

	private Integer id;

	private Integer supplierId;

	private String name;

	private String code;

	private Integer cpId;

	public  Object acqPk(){
		return id;
	}
}
package com.tg.db.sync.tgoms.pojo.supplierLogisticsSid;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class SupplierLogisticsSid implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode){
		this.logisticsCompanyCode=logisticsCompanyCode;
	}

	public String getLogisticsCompanyCode(){
		return this.logisticsCompanyCode;
	}
	public void setLogisticsSid(String logisticsSid){
		this.logisticsSid=logisticsSid;
	}

	public String getLogisticsSid(){
		return this.logisticsSid;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName){
		this.logisticsCompanyName=logisticsCompanyName;
	}

	public String getLogisticsCompanyName(){
		return this.logisticsCompanyName;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}

	private Integer id;

	private String logisticsCompanyCode;

	private String logisticsSid;

	private String logisticsCompanyName;

	private Integer supplierId;

	public  Object acqPk(){
		return id;
	}
}
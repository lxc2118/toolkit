package com.tg.db.sync.tgoms.pojo.salesPromotionInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class SalesPromotionInfo implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setAcitivityId(String acitivityId){
		this.acitivityId=acitivityId;
	}

	public String getAcitivityId(){
		return this.acitivityId;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setLevel(String level){
		this.level=level;
	}

	public String getLevel(){
		return this.level;
	}
	public void setIntegral(Integer integral){
		this.integral=integral;
	}

	public Integer getIntegral(){
		return this.integral;
	}
	public void setFreeNum(Integer freeNum){
		this.freeNum=freeNum;
	}

	public Integer getFreeNum(){
		return this.freeNum;
	}

	private Integer id;

	private String acitivityId;

	private String name;

	private String level;

	private Integer integral;

	private Integer freeNum;

	public  Object acqPk(){
		return id;
	}
}
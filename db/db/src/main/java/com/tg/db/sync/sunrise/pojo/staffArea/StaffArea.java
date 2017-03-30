package com.tg.db.sync.sunrise.pojo.staffArea;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class StaffArea implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setStaffId(Integer staffId){
		this.staffId=staffId;
	}

	public Integer getStaffId(){
		return this.staffId;
	}
	public void setAreaId(Integer areaId){
		this.areaId=areaId;
	}

	public Integer getAreaId(){
		return this.areaId;
	}

	private Integer id;

	private Integer staffId;

	private Integer areaId;

	public  Object acqPk(){
		return id;
	}
}
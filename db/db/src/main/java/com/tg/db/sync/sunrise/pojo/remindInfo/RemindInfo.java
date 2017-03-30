package com.tg.db.sync.sunrise.pojo.remindInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class RemindInfo implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}
	public void setRemind(String remind){
		this.remind=remind;
	}

	public String getRemind(){
		return this.remind;
	}

	private Integer id;

	private Integer orderId;

	private String remind;

	public  Object acqPk(){
		return this;
	}
}
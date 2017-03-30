package com.tg.db.sync.sunrise.pojo.orderRefundDetail;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class OrderRefundDetail implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}

	public Long getOrderId(){
		return this.orderId;
	}
	public void setOrderItemId(Long orderItemId){
		this.orderItemId=orderItemId;
	}

	public Long getOrderItemId(){
		return this.orderItemId;
	}
	public void setOrderRefundId(Long orderRefundId){
		this.orderRefundId=orderRefundId;
	}

	public Long getOrderRefundId(){
		return this.orderRefundId;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}

	private Long id;

	private Long orderId;

	private Long orderItemId;

	private Long orderRefundId;

	private Integer num;

	public  Object acqPk(){
		return id;
	}
}
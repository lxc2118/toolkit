package com.tg.db.sync.sunrise.pojo.itemImg;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class ItemImg implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setImgId(Integer imgId){
		this.imgId=imgId;
	}

	public Integer getImgId(){
		return this.imgId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder=sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}

	private Integer id;

	private Integer itemId;

	private Integer imgId;

	private String type;

	private Integer sortOrder;

	public  Object acqPk(){
		return id;
	}
}
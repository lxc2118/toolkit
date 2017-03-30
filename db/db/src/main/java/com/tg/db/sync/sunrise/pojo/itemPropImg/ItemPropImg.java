package com.tg.db.sync.sunrise.pojo.itemPropImg;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class ItemPropImg implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setImgId(Integer imgId){
		this.imgId=imgId;
	}

	public Integer getImgId(){
		return this.imgId;
	}
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setPid(Integer pid){
		this.pid=pid;
	}

	public Integer getPid(){
		return this.pid;
	}
	public void setVid(String vid){
		this.vid=vid;
	}

	public String getVid(){
		return this.vid;
	}

	private Integer id;

	private Integer imgId;

	private Integer itemId;

	private Integer pid;

	private String vid;

	public  Object acqPk(){
		return id;
	}
}
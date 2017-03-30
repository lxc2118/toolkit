package com.tg.db.sync.sunrise.pojo.huanXinUser;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class HuanXinUser implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setUsername(String username){
		this.username=username;
	}

	public String getUsername(){
		return this.username;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return this.userId;
	}
	public void setNickName(String nickName){
		this.nickName=nickName;
	}

	public String getNickName(){
		return this.nickName;
	}
	public void setAvatar(String avatar){
		this.avatar=avatar;
	}

	public String getAvatar(){
		return this.avatar;
	}

	private Integer id;

	private String username;

	private String userId;

	private String nickName;

	private String avatar;

	public  Object acqPk(){
		return id;
	}
}
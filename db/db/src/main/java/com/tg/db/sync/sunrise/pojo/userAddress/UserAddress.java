package com.tg.db.sync.sunrise.pojo.userAddress;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class UserAddress implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}

	public Long getUserId(){
		return this.userId;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setProvince(String province){
		this.province=province;
	}

	public String getProvince(){
		return this.province;
	}
	public void setCity(String city){
		this.city=city;
	}

	public String getCity(){
		return this.city;
	}
	public void setDistrict(String district){
		this.district=district;
	}

	public String getDistrict(){
		return this.district;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault=isDefault;
	}

	public Boolean getIsDefault(){
		return this.isDefault;
	}

	private Long id;

	private Long userId;

	private String name;

	private String phone;

	private String province;

	private String city;

	private String district;

	private String address;

	private Boolean isDefault;

	public  Object acqPk(){
		return id;
	}
}
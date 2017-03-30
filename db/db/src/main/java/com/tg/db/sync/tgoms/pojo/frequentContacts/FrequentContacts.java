package com.tg.db.sync.tgoms.pojo.frequentContacts;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class FrequentContacts implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
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
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	public void setSellerId(String sellerId){
		this.sellerId=sellerId;
	}

	public String getSellerId(){
		return this.sellerId;
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

	private Integer id;

	private String name;

	private String phone;

	private String address;

	private String sellerId;

	private String province;

	private String city;

	private String district;

	public  Object acqPk(){
		return id;
	}
}
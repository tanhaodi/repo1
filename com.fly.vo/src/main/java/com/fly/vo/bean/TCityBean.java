package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;

public class TCityBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private Integer id;
	private String cityId;
	private String city;
	private String provinceId;

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getCityId(){
		return cityId;
	}
	public void setCityId(String cityId){
		this.cityId = cityId;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getProvinceId(){
		return provinceId;
	}
	public void setProvinceId(String provinceId){
		this.provinceId = provinceId;
	}

}


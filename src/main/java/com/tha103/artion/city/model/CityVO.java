package com.tha103.artion.city.model;

import javax.persistence.*;

@Entity
@Table (name= "city")
public class CityVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id", updatable = false)
	private Integer cityId;
	
	@Column(name ="city_name")
	private String cityName;
	
	
	
	public CityVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CityVO(Integer cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}



	public Integer getCityId() {
		return cityId;
	}



	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	@Override
	public String toString() {
		return "CityVO [cityId=" + cityId + ", cityName=" + cityName + "]";
	}
	
	
	
}

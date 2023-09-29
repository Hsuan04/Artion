package com.tha103.artion.area.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "area")
public class AreaVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "area_id", updatable = false)
	private Integer areaId;
	
	@Column(name = "area_name")
	private String areaName;
	
	@Column(name = "city_id")
	private Integer cityId;
	
	
	
	public AreaVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AreaVO(Integer areaId, String areaName, Integer cityId) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.cityId = cityId;
	}



	public Integer getAreaId() {
		return areaId;
	}



	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}



	public String getAreaName() {
		return areaName;
	}



	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}



	public Integer getCityId() {
		return cityId;
	}



	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}



	@Override
	public String toString() {
		return "AreaVO [areaId=" + areaId + ", areaName=" + areaName + ", cityId=" + cityId + "]";
	}
	
	
	
}

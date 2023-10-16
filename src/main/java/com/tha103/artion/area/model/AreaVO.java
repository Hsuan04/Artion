package com.tha103.artion.area.model;

import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.tha103.artion.city.model.CityVO;
import com.tha103.artion.member.model.MemberVO;

@Entity
@Table(name= "area")
public class AreaVO {
	@Expose
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "area_id", updatable = false)
	private Integer areaId;
	
	@Expose
	@Column(name = "area_name")
	private String areaName;
	
	@ManyToOne
	@JoinColumn(name = "cityId", referencedColumnName = "cityId")
	private CityVO city;

//-------------------------------------------------------------
	public AreaVO() {
		super();
	}

	public AreaVO(Integer areaId, String areaName, CityVO city) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.city = city;
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

	public CityVO getCity() {
		return city;
	}

	public void setCity(CityVO city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AreaVO [areaId=" + areaId + ", areaName=" + areaName + "]";
	}
	
}

package com.tha103.artion.memberlevel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memberlevel")
public class MemberlevelVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memLev_level", updatable = false)
	private Integer memLevLevel;
	@Column(name="memLev_levelName")
	private String memLevLevelName;
	@Column(name="memLev_minimunOrder")
	private Integer memLevMinimunOrder;
	public MemberlevelVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberlevelVO(Integer memLevLevel, String memLevLevelName, Integer memLevMinimunOrder) {
		super();
		this.memLevLevel = memLevLevel;
		this.memLevLevelName = memLevLevelName;
		this.memLevMinimunOrder = memLevMinimunOrder;
	}
	public Integer getMemLevLevel() {
		return memLevLevel;
	}
	public void setMemLevLevel(Integer memLevLevel) {
		this.memLevLevel = memLevLevel;
	}
	public String getMemLevLevelName() {
		return memLevLevelName;
	}
	public void setMemLevLevelName(String memLevLevelName) {
		this.memLevLevelName = memLevLevelName;
	}
	public Integer getMemLevMinimunOrder() {
		return memLevMinimunOrder;
	}
	public void setMemLevMinimunOrder(Integer memLevMinimunOrder) {
		this.memLevMinimunOrder = memLevMinimunOrder;
	}
	
	
}

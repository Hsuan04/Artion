package com.tha103.artion.myPromoCode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mypromocode")
public class MyPromoCodeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "myProCode_id", updatable = false)	
	private Integer myProCodeId;
	@Column(name="myProCode_status",columnDefinition = "boolean")
	private Boolean myProCodeStatus;
	@Column(name="proCode_id")
	private Integer proCodeId;
	@Column(name="mem_id")
	private Integer memId;
	public MyPromoCodeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyPromoCodeVO(Integer myProCodeId, Boolean myProCodeStatus, Integer proCodeId, Integer memId) {
		super();
		this.myProCodeId = myProCodeId;
		this.myProCodeStatus = myProCodeStatus;
		this.proCodeId = proCodeId;
		this.memId = memId;
	}
	public Integer getMyProCodeId() {
		return myProCodeId;
	}
	public void setMyProCodeId(Integer myProCodeId) {
		this.myProCodeId = myProCodeId;
	}
	public Boolean getMyProCodeStatus() {
		return myProCodeStatus;
	}
	public void setMyProCodeStatus(Boolean myProCodeStatus) {
		this.myProCodeStatus = myProCodeStatus;
	}
	public Integer getProCodeId() {
		return proCodeId;
	}
	public void setProCodeId(Integer proCodeId) {
		this.proCodeId = proCodeId;
	}
	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	
}

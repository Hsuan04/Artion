package com.tha103.artion.promocode.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promocode")
public class PromocodeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proCode_id", updatable = false)
	private Integer proCodeId;
	
	@Column(name = "proCode_name")
	private String proCodeName;
	
	@Column(name = "proCode_code")
	private String proCodeCode;
	
	@Column(name = "proCode_type")
	private Integer proCodeType;
	
	@Column(name = "proCode_value")
	private String proCodeValue;
	
	@Column(name = "proCode_startDate")
	private Date proCodeStartDate;
	
	@Column(name = "proCode_endDate")
	private Date proCodeEndDate;
	
	@Column(name = "proCode_actType")
	private Integer proCodeActType;
	
	@Column(name = "memLev_level")
	private Integer memLevLevel;
	
	@Column(name = "proCode_total")
	private Integer proCodeTotal;
	
	@Column(name = "proCode_status")
	private Boolean proCodeStatus;
	
	@Column(name = "proCode_describe")
	private String proCodeDescribe;
	
	@Column(name = "adm_id")
	private Integer admId;


	public PromocodeVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PromocodeVO(Integer proCode_id, String proCode_name, String proCode_code, Integer proCode_type,
			String proCode_value, Date proCode_startDate, Date proCode_endDate, Integer proCode_actType,
			Integer memLev_level, Integer proCode_total, Boolean proCode_status, String proCode_describe,
			Integer adm_id) {
		super();
		this.proCodeId = proCode_id;
		this.proCodeName = proCode_name;
		this.proCodeCode = proCode_code;
		this.proCodeType = proCode_type;
		this.proCodeValue = proCode_value;
		this.proCodeStartDate = proCode_startDate;
		this.proCodeEndDate = proCode_endDate;
		this.proCodeActType = proCode_actType;
		this.memLevLevel = memLev_level;
		this.proCodeTotal = proCode_total;
		this.proCodeStatus = proCode_status;
		this.proCodeDescribe = proCode_describe;
		this.admId = adm_id;
	}


	public Integer getProCode_id() {
		return proCodeId;
	}


	public void setProCode_id(Integer proCode_id) {
		this.proCodeId = proCode_id;
	}


	public String getProCode_name() {
		return proCodeName;
	}


	public void setProCode_name(String proCode_name) {
		this.proCodeName = proCode_name;
	}


	public String getProCode_code() {
		return proCodeCode;
	}


	public void setProCode_code(String proCode_code) {
		this.proCodeCode = proCode_code;
	}


	public Integer getProCode_type() {
		return proCodeType;
	}


	public void setProCode_type(Integer proCode_type) {
		this.proCodeType = proCode_type;
	}


	public String getProCode_value() {
		return proCodeValue;
	}


	public void setProCode_value(String proCode_value) {
		this.proCodeValue = proCode_value;
	}


	public Date getProCode_startDate() {
		return proCodeStartDate;
	}


	public void setProCode_startDate(Date proCode_startDate) {
		this.proCodeStartDate = proCode_startDate;
	}


	public Date getProCode_endDate() {
		return proCodeEndDate;
	}


	public void setProCode_endDate(Date proCode_endDate) {
		this.proCodeEndDate = proCode_endDate;
	}


	public Integer getProCode_actType() {
		return proCodeActType;
	}


	public void setProCode_actType(Integer proCode_actType) {
		this.proCodeActType = proCode_actType;
	}


	public Integer getMemLev_level() {
		return memLevLevel;
	}


	public void setMemLev_level(Integer memLev_level) {
		this.memLevLevel = memLev_level;
	}


	public Integer getProCode_total() {
		return proCodeTotal;
	}


	public void setProCode_total(Integer proCode_total) {
		this.proCodeTotal = proCode_total;
	}


	public Boolean getProCode_status() {
		return proCodeStatus;
	}


	public void setProCode_status(Boolean proCode_status) {
		this.proCodeStatus = proCode_status;
	}


	public String getProCode_describe() {
		return proCodeDescribe;
	}


	public void setProCode_describe(String proCode_describe) {
		this.proCodeDescribe = proCode_describe;
	}


	public Integer getAdm_id() {
		return admId;
	}


	public void setAdm_id(Integer adm_id) {
		this.admId = adm_id;
	}


	@Override
	public String toString() {
		return "PromocodeVO [proCode_id=" + proCodeId + ", proCode_name=" + proCodeName + ", proCode_code="
				+ proCodeCode + ", proCode_type=" + proCodeType + ", proCode_value=" + proCodeValue
				+ ", proCode_actType=" + proCodeActType + ", memLev_level=" + memLevLevel + ", proCode_total="
				+ proCodeTotal + ", proCode_status=" + proCodeStatus + ", proCode_describe=" + proCodeDescribe
				+ ", adm_id=" + admId + "]";
	}
	
	
}

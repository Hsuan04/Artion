package com.tha103.artion.promocode.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "promocode")
public class PromoCodeVO {
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
	
	@ManyToOne
	@JoinColumn(name = "memLev_level", referencedColumnName = "memLev_level")
	private Integer memLevLevel;
	
	@Column(name = "proCode_total")
	private Integer proCodeTotal;
	
	@Column(name = "proCode_status")
	private Boolean proCodeStatus;
	
	@Column(name = "proCode_describe")
	private String proCodeDescribe;
	
	@ManyToOne
	@JoinColumn(name = "adm_id", referencedColumnName = "adm_id")
	private Integer admId;


	public PromoCodeVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PromoCodeVO(Integer proCodeId, String proCodeName, String proCodeCode, Integer proCodeType,
			String proCodeValue, Date proCodeStartDate, Date proCodeEndDate, Integer proCodeActType,
			Integer memLevLevel, Integer proCodeTotal, Boolean proCodeStatus, String proCodeDescribe, Integer admId) {
		super();
		this.proCodeId = proCodeId;
		this.proCodeName = proCodeName;
		this.proCodeCode = proCodeCode;
		this.proCodeType = proCodeType;
		this.proCodeValue = proCodeValue;
		this.proCodeStartDate = proCodeStartDate;
		this.proCodeEndDate = proCodeEndDate;
		this.proCodeActType = proCodeActType;
		this.memLevLevel = memLevLevel;
		this.proCodeTotal = proCodeTotal;
		this.proCodeStatus = proCodeStatus;
		this.proCodeDescribe = proCodeDescribe;
		this.admId = admId;
	}


	public Integer getProCodeId() {
		return proCodeId;
	}


	public void setProCodeId(Integer proCodeId) {
		this.proCodeId = proCodeId;
	}


	public String getProCodeName() {
		return proCodeName;
	}


	public void setProCodeName(String proCodeName) {
		this.proCodeName = proCodeName;
	}


	public String getProCodeCode() {
		return proCodeCode;
	}


	public void setProCodeCode(String proCodeCode) {
		this.proCodeCode = proCodeCode;
	}


	public Integer getProCodeType() {
		return proCodeType;
	}


	public void setProCodeType(Integer proCodeType) {
		this.proCodeType = proCodeType;
	}


	public String getProCodeValue() {
		return proCodeValue;
	}


	public void setProCodeValue(String proCodeValue) {
		this.proCodeValue = proCodeValue;
	}


	public Date getProCodeStartDate() {
		return proCodeStartDate;
	}


	public void setProCodeStartDate(Date proCodeStartDate) {
		this.proCodeStartDate = proCodeStartDate;
	}


	public Date getProCodeEndDate() {
		return proCodeEndDate;
	}


	public void setProCodeEndDate(Date proCodeEndDate) {
		this.proCodeEndDate = proCodeEndDate;
	}


	public Integer getProCodeActType() {
		return proCodeActType;
	}


	public void setProCodeActType(Integer proCodeActType) {
		this.proCodeActType = proCodeActType;
	}


	public Integer getMemLevLevel() {
		return memLevLevel;
	}


	public void setMemLevLevel(Integer memLevLevel) {
		this.memLevLevel = memLevLevel;
	}


	public Integer getProCodeTotal() {
		return proCodeTotal;
	}


	public void setProCodeTotal(Integer proCodeTotal) {
		this.proCodeTotal = proCodeTotal;
	}


	public Boolean getProCodeStatus() {
		return proCodeStatus;
	}


	public void setProCodeStatus(Boolean proCodeStatus) {
		this.proCodeStatus = proCodeStatus;
	}


	public String getProCodeDescribe() {
		return proCodeDescribe;
	}


	public void setProCodeDescribe(String proCodeDescribe) {
		this.proCodeDescribe = proCodeDescribe;
	}


	public Integer getAdmId() {
		return admId;
	}


	public void setAdmId(Integer admId) {
		this.admId = admId;
	}


	@Override
	public String toString() {
		return "PromoCodeVO [proCodeId=" + proCodeId + ", proCodeName=" + proCodeName + ", proCodeCode=" + proCodeCode
				+ ", proCodeType=" + proCodeType + ", proCodeValue=" + proCodeValue + ", proCodeStartDate="
				+ proCodeStartDate + ", proCodeEndDate=" + proCodeEndDate + ", proCodeActType=" + proCodeActType
				+ ", memLevLevel=" + memLevLevel + ", proCodeTotal=" + proCodeTotal + ", proCodeStatus=" + proCodeStatus
				+ ", proCodeDescribe=" + proCodeDescribe + ", admId=" + admId + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(admId, memLevLevel, proCodeActType, proCodeCode, proCodeDescribe, proCodeEndDate, proCodeId,
				proCodeName, proCodeStartDate, proCodeStatus, proCodeTotal, proCodeType, proCodeValue);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PromoCodeVO other = (PromoCodeVO) obj;
		return Objects.equals(admId, other.admId) && Objects.equals(memLevLevel, other.memLevLevel)
				&& Objects.equals(proCodeActType, other.proCodeActType)
				&& Objects.equals(proCodeCode, other.proCodeCode)
				&& Objects.equals(proCodeDescribe, other.proCodeDescribe)
				&& Objects.equals(proCodeEndDate, other.proCodeEndDate) && Objects.equals(proCodeId, other.proCodeId)
				&& Objects.equals(proCodeName, other.proCodeName)
				&& Objects.equals(proCodeStartDate, other.proCodeStartDate)
				&& Objects.equals(proCodeStatus, other.proCodeStatus)
				&& Objects.equals(proCodeTotal, other.proCodeTotal) && Objects.equals(proCodeType, other.proCodeType)
				&& Objects.equals(proCodeValue, other.proCodeValue);
	}


	
	
	
}

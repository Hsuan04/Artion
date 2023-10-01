package com.tha103.artion.memberCollection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "membercollection")
public class MemberCollectionVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memCol_serialNumber", updatable = false)	
	private Integer memColSerialNumber;
	@Column(name = "mem_id")
	private Integer memId;
	@Column(name = "act_id")
	private Integer actId;
	@Column(name = "memCol_status",columnDefinition = "boolean")
	private Boolean memColStatus;
	public MemberCollectionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberCollectionVO(Integer memColSerialNumber, Integer memId, Integer actId, Boolean memColStatus) {
		super();
		this.memColSerialNumber = memColSerialNumber;
		this.memId = memId;
		this.actId = actId;
		this.memColStatus = memColStatus;
	}
	public Integer getMemColSerialNumber() {
		return memColSerialNumber;
	}
	public void setMemColSerialNumber(Integer memColSerialNumber) {
		this.memColSerialNumber = memColSerialNumber;
	}
	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	public Integer getActId() {
		return actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}
	public Boolean getMemColStatus() {
		return memColStatus;
	}
	public void setMemColStatus(Boolean memColStatus) {
		this.memColStatus = memColStatus;
	}
	
	
}

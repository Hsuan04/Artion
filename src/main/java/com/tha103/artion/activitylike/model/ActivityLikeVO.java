package com.tha103.artion.activitylike.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ActivityLike")
public class ActivityLikeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer actLikeId;

	@Column(name="mem_id")
	private Integer memId;

	@Column(name="act_id")
	private Integer actId;
	
	@Column(name="actLike_status")
	private Boolean actLikeStatus;
	
	@Column(name="actLike_time")
	private Timestamp actLikeTime;

	public ActivityLikeVO() {
		super();
	}

	public ActivityLikeVO(Integer actLikeId, Integer memId, Integer actId, Boolean actLikeStatus,
			Timestamp actLikeTime) {
		super();
		this.actLikeId = actLikeId;
		this.memId = memId;
		this.actId = actId;
		this.actLikeStatus = actLikeStatus;
		this.actLikeTime = actLikeTime;
	}

	public Integer getActLikeId() {
		return actLikeId;
	}

	public void setActLikeId(Integer actLikeId) {
		this.actLikeId = actLikeId;
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

	public Boolean getActLikeStatus() {
		return actLikeStatus;
	}

	public void setActLikeStatus(Boolean actLikeStatus) {
		this.actLikeStatus = actLikeStatus;
	}

	public Timestamp getActLikeTime() {
		return actLikeTime;
	}

	public void setActLikeTime(Timestamp actLikeTime) {
		this.actLikeTime = actLikeTime;
	}

}
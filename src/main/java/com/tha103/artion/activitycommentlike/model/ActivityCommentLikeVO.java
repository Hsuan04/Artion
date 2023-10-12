package com.tha103.artion.activitycommentlike.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ActivityCommentLike")
public class ActivityCommentLikeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer actComLikeId;

	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private Integer memId;

	@ManyToOne
	@JoinColumn(name = "act_id", referencedColumnName = "act_id")
	private Integer actId;
	
	@Column(name="actComLike_status")
	private Boolean actComLikeStatus;
	
	@Column(name="actComLike_time")
	private Timestamp actComLikeTime;
	
	public ActivityCommentLikeVO() {
		super();
	}

	public ActivityCommentLikeVO(Integer actComLikeId, Integer memId, Integer actId, Boolean actComLikeStatus,
			Timestamp actComLikeTime) {
		super();
		this.actComLikeId = actComLikeId;
		this.memId = memId;
		this.actId = actId;
		this.actComLikeStatus = actComLikeStatus;
		this.actComLikeTime = actComLikeTime;
	}

	public Integer getActComLikeId() {
		return actComLikeId;
	}

	public void setActComLikeId(Integer actComLikeId) {
		this.actComLikeId = actComLikeId;
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

	public Boolean getActComLikeStatus() {
		return actComLikeStatus;
	}

	public void setActComLikeStatus(Boolean actComLikeStatus) {
		this.actComLikeStatus = actComLikeStatus;
	}

	public Timestamp getActComLikeTime() {
		return actComLikeTime;
	}

	public void setActComLikeTime(Timestamp actComLikeTime) {
		this.actComLikeTime = actComLikeTime;
	}
	
}

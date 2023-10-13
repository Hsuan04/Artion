package com.tha103.artion.activityCommentLike.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tha103.artion.activityComment.model.ActivityCommentVO;
import com.tha103.artion.member.model.MemberVO;

@Entity
@Table(name = "ActivityCommentLike")
public class ActivityCommentLikeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer actComLikeId;

	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private MemberVO memId;

	@ManyToOne
	@JoinColumn(name = "actCom_id", referencedColumnName = "actCom_id")
	private ActivityCommentVO actComId;
	
	@Column(name="actComLike_status")
	private Boolean actComLikeStatus;
	
	@Column(name="actComLike_time")
	private Timestamp actComLikeTime;
	
	public ActivityCommentLikeVO() {
		super();
	}

	public ActivityCommentLikeVO(Integer actComLikeId, MemberVO memId, ActivityCommentVO actComId,
			Boolean actComLikeStatus, Timestamp actComLikeTime) {
		super();
		this.actComLikeId = actComLikeId;
		this.memId = memId;
		this.actComId = actComId;
		this.actComLikeStatus = actComLikeStatus;
		this.actComLikeTime = actComLikeTime;
	}

	public Integer getActComLikeId() {
		return actComLikeId;
	}

	public void setActComLikeId(Integer actComLikeId) {
		this.actComLikeId = actComLikeId;
	}
	
	public MemberVO getMemId() {
		return memId;
	}

	public void setMemId(MemberVO memId) {
		this.memId = memId;
	}

	public ActivityCommentVO getActComId() {
		return actComId;
	}

	public void setActComId(ActivityCommentVO actComId) {
		this.actComId = actComId;
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

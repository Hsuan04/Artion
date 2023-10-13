package com.tha103.artion.activityLike.model;

import java.sql.Timestamp;
import javax.persistence.*;

import com.tha103.artion.activity.model.ActivityHibernateVO;
import com.tha103.artion.member.model.MemberVO;

@Entity
@Table(name = "ActivityLike")
public class ActivityLikeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "actLikeId", updatable = false)
	private Integer actLikeId;

	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private MemberVO memId;

	@ManyToOne
	@JoinColumn(name = "act_id", referencedColumnName = "act_id")
	private ActivityHibernateVO actId;
	
	@Column(name="actLike_status")
	private Boolean actLikeStatus;
	
	@Column(name="actLike_time",insertable=false)
	private Timestamp actLikeTime;

	public ActivityLikeVO() {
		super();
	}

	public Integer getActLikeId() {
		return actLikeId;
	}

	public void setActLikeId(Integer actLikeId) {
		this.actLikeId = actLikeId;
	}
	

	public MemberVO getMemId() {
		return memId;
	}

	public void setMemId(MemberVO memId) {
		this.memId = memId;
	}

	public ActivityHibernateVO getActId() {
		return actId;
	}

	public void setActId(ActivityHibernateVO actId) {
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

	public ActivityLikeVO(Integer actLikeId, MemberVO memId, ActivityHibernateVO actId, Boolean actLikeStatus,
			Timestamp actLikeTime) {
		super();
		this.actLikeId = actLikeId;
		this.memId = memId;
		this.actId = actId;
		this.actLikeStatus = actLikeStatus;
		this.actLikeTime = actLikeTime;
	}

}
package com.tha103.artion;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ActivityLike")
public class ActivityLikeHibernateVO {
	@Id
	private Integer actLike_id;
	
	@Column(name="mem_id")
	private Integer mem_id;
	
	@Column(name="act_id")
	private Integer act_id;
	
	@Column(name="actLike_status")
	private Boolean actLike_status;
	
	@Column(name="actLike_time")
	private Timestamp actLike_time;

	public ActivityLikeHibernateVO() {
		super();
	}

	public ActivityLikeHibernateVO(Integer actLike_id, Integer mem_id, Integer act_id, Boolean actLike_status, Timestamp actLike_time) {
		super();
		this.actLike_id = actLike_id;
		this.mem_id = mem_id;
		this.act_id = act_id;
		this.actLike_status = actLike_status;
		this.actLike_time = actLike_time;
	}

	public Integer getActLike_id() {
		return actLike_id;
	}

	public void setActLike_id(Integer actLike_id) {
		this.actLike_id = actLike_id;
	}

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public Integer getAct_id() {
		return act_id;
	}

	public void setAct_id(Integer act_id) {
		this.act_id = act_id;
	}

	public Boolean getActLike_status() {
		return actLike_status;
	}

	public void setActLike_status(Boolean actLike_status) {
		this.actLike_status = actLike_status;
	}

	public Timestamp getActLike_time() {
		return actLike_time;
	}

	public void setActLike_time(Timestamp actLike_time) {
		this.actLike_time = actLike_time;
	}
}

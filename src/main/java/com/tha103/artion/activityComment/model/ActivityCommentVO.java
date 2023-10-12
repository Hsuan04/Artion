package com.tha103.artion.activityComment.model;

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
@Table(name = "activitycomment")
public class ActivityCommentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actCom_id", updatable = false)
	private Integer actComId;

	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private Integer memId;
	
	@ManyToOne
	@JoinColumn(name = "act_id", referencedColumnName = "act_id")
	private Integer actId;
	
	@Column(name="actCom_content")
	private String actComContent;
	
	@Column(name="actCom_reportTimes")
	private Integer actComReportTimes;
	
	@Column(name = "actCom_time")
	private Timestamp actComTime;
	
	@Column(name="actCom_likeTimes")
	private Integer actComLikeTimes;
	
	@Column(name="actCom_coverPicture", columnDefinition="longblob")
	private byte[] actComCoverPicture;
	
	@Column(name="actCom_picture1", columnDefinition="longblob")
	private byte[] actComPicture1;
	
	@Column(name="actCom_picture2", columnDefinition="longblob")
	private byte[] actComPicture2;
	
	@Column(name="actCom_picture3", columnDefinition="longblob")
	private byte[] actComPicture3;
	
	@Column(name="actCom_status", columnDefinition="boolean")
	private Boolean actComStatus;
	
	public ActivityCommentVO() {
		super();
		
	}
	public ActivityCommentVO(Integer actComId, Integer memId, Integer actId, String actComContent,
			Integer actComReportTimes, Timestamp actComTime, Integer actComLikeTimes, byte[] actComCoverPicture,
			byte[] actComPicture1, byte[] actComPicture2, byte[] actComPicture3, Boolean actComStatus) {
		super();
		this.actComId = actComId;
		this.memId = memId;
		this.actId = actId;
		this.actComContent = actComContent;
		this.actComReportTimes = actComReportTimes;
		this.actComTime = actComTime;
		this.actComLikeTimes = actComLikeTimes;
		this.actComCoverPicture = actComCoverPicture;
		this.actComPicture1 = actComPicture1;
		this.actComPicture2 = actComPicture2;
		this.actComPicture3 = actComPicture3;
		this.actComStatus = actComStatus;
	}
	public Integer getActComId() {
		return actComId;
	}
	public void setActComId(Integer actComId) {
		this.actComId = actComId;
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
	public String getActComContent() {
		return actComContent;
	}
	public void setActComContent(String actComContent) {
		this.actComContent = actComContent;
	}
	public Integer getActComReportTimes() {
		return actComReportTimes;
	}
	public void setActComReportTimes(Integer actComReportTimes) {
		this.actComReportTimes = actComReportTimes;
	}
	public Timestamp getActComTime() {
		return actComTime;
	}
	public void setActComTime(Timestamp actComTime) {
		this.actComTime = actComTime;
	}
	public Integer getActComLikeTimes() {
		return actComLikeTimes;
	}
	public void setActComLikeTimes(Integer actComLikeTimes) {
		this.actComLikeTimes = actComLikeTimes;
	}
	public byte[] getActComCoverPicture() {
		return actComCoverPicture;
	}
	public void setActComCoverPicture(byte[] actComCoverPicture) {
		this.actComCoverPicture = actComCoverPicture;
	}
	public byte[] getActComPicture1() {
		return actComPicture1;
	}
	public void setActComPicture1(byte[] actComPicture1) {
		this.actComPicture1 = actComPicture1;
	}
	public byte[] getActComPicture2() {
		return actComPicture2;
	}
	public void setActComPicture2(byte[] actComPicture2) {
		this.actComPicture2 = actComPicture2;
	}
	public byte[] getActComPicture3() {
		return actComPicture3;
	}
	public void setActComPicture3(byte[] actComPicture3) {
		this.actComPicture3 = actComPicture3;
	}
	public Boolean getActComStatus() {
		return actComStatus;
	}
	public void setActComStatus(Boolean actComStatus) {
		this.actComStatus = actComStatus;
	}
	
	
}

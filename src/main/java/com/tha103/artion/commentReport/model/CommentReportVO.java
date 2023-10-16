package com.tha103.artion.commentReport.model;

import java.sql.Timestamp;
import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.tha103.artion.activityComment.model.ActivityCommentVO;


@Entity
@Table(name = "commentreport")
public class CommentReportVO {
	@Expose
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comRep_serialNumber", updatable = false)
	private Integer comRepSerialNumber;

	@Expose
	@JoinColumn(name = "comRep_id", referencedColumnName = "comRep_id")
	private Integer comRepId;

	@Expose
	@Column(name = "comRep_content")
	private String comRepContent;

	@Expose
	@Column(name = "comRep_time")
	private Timestamp comRepTime;

	// 活動留言檢舉(fk)>活動留言(pk)
	@ManyToOne
	@JoinColumn(name = "actCom_id", referencedColumnName = "actCom_id")
	private ActivityCommentVO actCom;

//-------------------------------------------------------------
	public CommentReportVO() {
		super();
	}

	public CommentReportVO(Integer comRepSerialNumber, Integer comRepId, String comRepContent, Timestamp comRepTime,
			ActivityCommentVO actCom) {
		super();
		this.comRepSerialNumber = comRepSerialNumber;
		this.comRepId = comRepId;
		this.comRepContent = comRepContent;
		this.comRepTime = comRepTime;
		this.actCom = actCom;
	}

	public Integer getComRepSerialNumber() {
		return comRepSerialNumber;
	}

	public void setComRepSerialNumber(Integer comRepSerialNumber) {
		this.comRepSerialNumber = comRepSerialNumber;
	}

	public Integer getComRepId() {
		return comRepId;
	}

	public void setComRepId(Integer comRepId) {
		this.comRepId = comRepId;
	}

	public String getComRepContent() {
		return comRepContent;
	}

	public void setComRepContent(String comRepContent) {
		this.comRepContent = comRepContent;
	}

	public Timestamp getComRepTime() {
		return comRepTime;
	}

	public void setComRepTime(Timestamp comRepTime) {
		this.comRepTime = comRepTime;
	}

	public ActivityCommentVO getActCom() {
		return actCom;
	}

	public void setActCom(ActivityCommentVO actCom) {
		this.actCom = actCom;
	}

	@Override
	public String toString() {
		return "CommentReportVO [comRepSerialNumber=" + comRepSerialNumber + ", comRepId=" + comRepId
				+ ", comRepContent=" + comRepContent + ", comRepTime=" + comRepTime + "]";
	}

}

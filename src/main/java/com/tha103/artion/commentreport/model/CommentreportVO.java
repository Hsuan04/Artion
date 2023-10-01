package com.tha103.artion.commentreport.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "commentreport")
public class CommentreportVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comRep_serialNumber", updatable = false)
	private Integer comRepSerialNumber;
	
	@Column(name = "comRep_id")
	private Integer comRepId;
	
	@Column(name = "actCom_id")
	private Integer actComId;
	
	@Column(name = "comRep_content")
	private String comRepContent;
	
	@Column(name = "comRep_time")
	private Timestamp comRepTime;
	
	public CommentreportVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentreportVO(Integer comRep_serialNumber, Integer comRep_id, Integer actCom_id, String comRep_content,
			Timestamp comRep_time) {
		super();
		this.comRepSerialNumber = comRep_serialNumber;
		this.comRepId = comRep_id;
		this.actComId = actCom_id;
		this.comRepContent = comRep_content;
		this.comRepTime = comRep_time;
	}

	public Integer getComRep_serialNumber() {
		return comRepSerialNumber;
	}

	public void setComRep_serialNumber(Integer comRep_serialNumber) {
		this.comRepSerialNumber = comRep_serialNumber;
	}

	public Integer getComRep_id() {
		return comRepId;
	}

	public void setComRep_id(Integer comRep_id) {
		this.comRepId = comRep_id;
	}

	public Integer getActCom_id() {
		return actComId;
	}

	public void setActCom_id(Integer actCom_id) {
		this.actComId = actCom_id;
	}

	public String getComRep_content() {
		return comRepContent;
	}

	public void setComRep_content(String comRep_content) {
		this.comRepContent = comRep_content;
	}

	public Timestamp getComRep_time() {
		return comRepTime;
	}

	public void setComRep_time(Timestamp comRep_time) {
		this.comRepTime = comRep_time;
	}

	@Override
	public String toString() {
		return "CommentreportVO [comRep_serialNumber=" + comRepSerialNumber + ", comRep_id=" + comRepId
				+ ", actCom_id=" + actComId + ", comRep_content=" + comRepContent + ", comRep_time=" + comRepTime
				+ "]";
	}
	
	
}

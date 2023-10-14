package com.tha103.artion.commentreport.model;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "commentreport")
public class CommentReportVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comRep_serialNumber", updatable = false)
	private Integer comRepSerialNumber;
	
	@ManyToOne
	@JoinColumn(name = "comRep_id", referencedColumnName = "comRep_id")
	private Integer comRepId;
	
	@ManyToOne
	@JoinColumn(name = "actCom_id", referencedColumnName = "actCom_id")
	private Integer actComId;
	
	@Column(name = "comRep_content")
	private String comRepContent;
	
	@Column(name = "comRep_time")
	private Timestamp comRepTime;
	
	public CommentReportVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CommentReportVO(Integer comRepSerialNumber, Integer comRepId, Integer actComId, String comRepContent,
			Timestamp comRepTime) {
		super();
		this.comRepSerialNumber = comRepSerialNumber;
		this.comRepId = comRepId;
		this.actComId = actComId;
		this.comRepContent = comRepContent;
		this.comRepTime = comRepTime;
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


	public Integer getActComId() {
		return actComId;
	}


	public void setActComId(Integer actComId) {
		this.actComId = actComId;
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


	@Override
	public String toString() {
		return "CommentReportVO [comRepSerialNumber=" + comRepSerialNumber + ", comRepId=" + comRepId + ", actComId="
				+ actComId + ", comRepContent=" + comRepContent + ", comRepTime=" + comRepTime + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(actComId, comRepContent, comRepId, comRepSerialNumber, comRepTime);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentReportVO other = (CommentReportVO) obj;
		return Objects.equals(actComId, other.actComId) && Objects.equals(comRepContent, other.comRepContent)
				&& Objects.equals(comRepId, other.comRepId)
				&& Objects.equals(comRepSerialNumber, other.comRepSerialNumber)
				&& Objects.equals(comRepTime, other.comRepTime);
	}

	
	
	
}

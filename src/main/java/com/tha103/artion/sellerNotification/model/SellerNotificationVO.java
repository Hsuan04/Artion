package com.tha103.artion.sellernotification.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sellernotification")

public class SellerNotificationVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "selNot_serialNumber")
	private Integer selNotSerialNumber;

	@Column(name = "sel_id")
	private Integer selId;

	@Column(name = "selNot_readStatus", columnDefinition = "tinyint")
	private boolean selNotReadStatus;

	@Column(name = "selNot_existStatus", columnDefinition = "tinyint")
	private boolean selNotExistStatus;

	@Column(name = "selNot_content")
	private String selNotContent;

	@Column(name = "selNot_receiveDateTime")
	private Timestamp selNotReceiveDateTime;

	public Integer getSelNotSerialNumber() {
		return selNotSerialNumber;
	}

	public void setSelNotSerialNumber(Integer selNotSerialNumber) {
		this.selNotSerialNumber = selNotSerialNumber;
	}

	public Integer getSelId() {
		return selId;
	}

	public void setSelId(Integer selId) {
		this.selId = selId;
	}

	public boolean isSelNotReadStatus() {
		return selNotReadStatus;
	}

	public void setSelNotReadStatus(boolean selNotReadStatus) {
		this.selNotReadStatus = selNotReadStatus;
	}

	public boolean isSelNotExistStatus() {
		return selNotExistStatus;
	}



	public void setSelNotExistStatus(boolean selNotExistStatus) {
		this.selNotExistStatus = selNotExistStatus;
	}



	public String getSelNotContent() {
		return selNotContent;
	}



	public void setSelNotContent(String selNotContent) {
		this.selNotContent = selNotContent;
	}



	public Timestamp getSelNotReceiveDateTime() {
		return selNotReceiveDateTime;
	}



	public void setSelNotReceiveDateTime(Timestamp selNotReceiveDateTime) {
		this.selNotReceiveDateTime = selNotReceiveDateTime;
	}



	public SellerNotificationVO() {
		super();
		// TODO Auto-generated constructor stub
	}

}

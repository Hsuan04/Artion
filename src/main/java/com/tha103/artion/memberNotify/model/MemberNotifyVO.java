package com.tha103.artion.membernotify.model;



import java.sql.Timestamp;

import javax.persistence.*;


@Entity
@Table(name="membernotify")
public class MemberNotifyVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memberNot_serialNumber", updatable = false)
	private Integer memberNotSerialNumber;
	
	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private Integer memId;
	
	@Column(name = "memberNot_readStatus")
	private Boolean memberNotReadStatus;
	
	@Column(name = "memberNot_readStatus")
	private Boolean memberNotExistStatus;
	
	@Column(name = "memberNot_content")
	private String memberNotContent;
	
	@Column(name = "memberNot_receiveTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp memberNotReceiveTime;

	
	
	public MemberNotifyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberNotifyVO(Integer memberNotSerialNumber, Integer memId, Boolean memberNotReadStatus,
			Boolean memberNotExistStatus, String memberNotContent, Timestamp memberNotReceiveTime) {
		super();
		this.memberNotSerialNumber = memberNotSerialNumber;
		this.memId = memId;
		this.memberNotReadStatus = memberNotReadStatus;
		this.memberNotExistStatus = memberNotExistStatus;
		this.memberNotContent = memberNotContent;
		this.memberNotReceiveTime = memberNotReceiveTime;
	}

	public Integer getMemberNotSerialNumber() {
		return memberNotSerialNumber;
	}

	public void setMemberNotSerialNumber(Integer memberNotSerialNumber) {
		this.memberNotSerialNumber = memberNotSerialNumber;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public Boolean getMemberNotReadStatus() {
		return memberNotReadStatus;
	}

	public void setMemberNotReadStatus(Boolean memberNotReadStatus) {
		this.memberNotReadStatus = memberNotReadStatus;
	}

	public Boolean getMemberNotExistStatus() {
		return memberNotExistStatus;
	}

	public void setMemberNotExistStatus(Boolean memberNotExistStatus) {
		this.memberNotExistStatus = memberNotExistStatus;
	}

	public String getMemberNotContent() {
		return memberNotContent;
	}

	public void setMemberNotContent(String memberNotContent) {
		this.memberNotContent = memberNotContent;
	}

	public Timestamp getMemberNotReceiveTime() {
		return memberNotReceiveTime;
	}

	public void setMemberNotReceiveTime(Timestamp memberNotReceiveTime) {
		this.memberNotReceiveTime = memberNotReceiveTime;
	}

	@Override
	public String toString() {
		return "MemberNotifyVO [memberNotSerialNumber=" + memberNotSerialNumber + ", memId=" + memId
				+ ", memberNotReadStatus=" + memberNotReadStatus + ", memberNotExistStatus=" + memberNotExistStatus
				+ ", memberNotContent=" + memberNotContent + ", memberNotReceiveTime=" + memberNotReceiveTime + "]";
	}
	
	
	
	
}

package com.tha103.artion.memberNotify.model;

import java.sql.Timestamp;

import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.tha103.artion.member.model.MemberVO;

@Entity
@Table(name="membernotify")
public class MemberNotifyVO {
	@Expose
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memberNot_serialNumber", updatable = false)
	private Integer memberNotSerialNumber;
	
	//會員通知(fk)>會員(pk)
	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private MemberVO member;
	
	@Expose
	@Column(name = "memberNot_readStatus")
	private Boolean memberNotReadStatus;
	
	@Expose
	@Column(name = "memberNot_existStatus")
	private Boolean memberNotExistStatus;
	
	@Expose
	@Column(name = "memberNot_content")
	private String memberNotContent;
	
	@Expose
	@Column(name = "memberNot_receiveTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp memberNotReceiveTime;
	
//-------------------------------------------------------------
	public MemberNotifyVO() {
		super();
	}

	public Integer getMemberNotSerialNumber() {
		return memberNotSerialNumber;
	}

	public void setMemberNotSerialNumber(Integer memberNotSerialNumber) {
		this.memberNotSerialNumber = memberNotSerialNumber;
	}

	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
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

	public MemberNotifyVO(Integer memberNotSerialNumber, MemberVO member, Boolean memberNotReadStatus,
			Boolean memberNotExistStatus, String memberNotContent, Timestamp memberNotReceiveTime) {
		super();
		this.memberNotSerialNumber = memberNotSerialNumber;
		this.member = member;
		this.memberNotReadStatus = memberNotReadStatus;
		this.memberNotExistStatus = memberNotExistStatus;
		this.memberNotContent = memberNotContent;
		this.memberNotReceiveTime = memberNotReceiveTime;
	}

	@Override
	public String toString() {
		return "MemberNotifyVO [memberNotSerialNumber=" + memberNotSerialNumber + ", memberNotReadStatus="
				+ memberNotReadStatus + ", memberNotExistStatus=" + memberNotExistStatus + ", memberNotContent="
				+ memberNotContent + ", memberNotReceiveTime=" + memberNotReceiveTime + "]";
	}

	
}

package com.tha103.artion.member.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class MemberVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mem_id", updatable = false)
	private Integer memId;
	@Column(name = "mem_name")
	private String memName;
	@Column(name = "mem_nickname")
	private String memNickname;
	@Column(name = "mem_accunt")
	private String memAccount;
	@Column(name = "mem_password")
	private String memPassword;
	@Column(name = "mem_gender")
	private String memGender;
	@Column(name = "mem_birthday")
	private Date memBirthday;
	@Column(name = "mem_mobile")
	private String memMobile;
	@Column(name = "mem_address")
	private String memAddress;
	@Column(name = "mem_registerdTime")
	private Date memRegisterdTime;
	@Column(name = "mem_lastModifiedTime")
	private Date memLastModifiedTime;
	@Column(name = "memLev_level")
	private Integer memLevLevel;
	@Column(name = "mem_profilePhoto", columnDefinition = "longblob")
	private byte[] memProfilePhoto;
	@Column(name = "mem_totalCost")
	private Integer memTotalCost;

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVO(Integer memId, String memName, String memNickname, String memAccount, String memPassword,
			String memGender, Date memBirthday, String memMobile, String memAddress, Date memRegisterdTime,
			Date memLastModifiedTime, Integer memLevLevel, byte[] memProfilePhoto, Integer memTotalCost) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memNickname = memNickname;
		this.memAccount = memAccount;
		this.memPassword = memPassword;
		this.memGender = memGender;
		this.memBirthday = memBirthday;
		this.memMobile = memMobile;
		this.memAddress = memAddress;
		this.memRegisterdTime = memRegisterdTime;
		this.memLastModifiedTime = memLastModifiedTime;
		this.memLevLevel = memLevLevel;
		this.memProfilePhoto = memProfilePhoto;
		this.memTotalCost = memTotalCost;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemNickname() {
		return memNickname;
	}

	public void setMemNickname(String memNickname) {
		this.memNickname = memNickname;
	}

	public String getMemAccount() {
		return memAccount;
	}

	public void setMemAccount(String memAccount) {
		this.memAccount = memAccount;
	}

	public String getMemPassword() {
		return memPassword;
	}

	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}

	public String getMemGender() {
		return memGender;
	}

	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}

	public Date getMemBirthday() {
		return memBirthday;
	}

	public void setMemBirthday(Date memBirthday) {
		this.memBirthday = memBirthday;
	}

	public String getMemMobile() {
		return memMobile;
	}

	public void setMemMobile(String memMobile) {
		this.memMobile = memMobile;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}

	public Date getMemRegisterdTime() {
		return memRegisterdTime;
	}

	public void setMemRegisterdTime(Date memRegisterdTime) {
		this.memRegisterdTime = memRegisterdTime;
	}

	public Date getMemLastModifiedTime() {
		return memLastModifiedTime;
	}

	public void setMemLastModifiedTime(Date memLastModifiedTime) {
		this.memLastModifiedTime = memLastModifiedTime;
	}

	public Integer getMemLevLevel() {
		return memLevLevel;
	}

	public void setMemLevLevel(Integer memLevLevel) {
		this.memLevLevel = memLevLevel;
	}

	public byte[] getMemProfilePhoto() {
		return memProfilePhoto;
	}

	public void setMemProfilePhoto(byte[] memProfilePhoto) {
		this.memProfilePhoto = memProfilePhoto;
	}

	public Integer getMemTotalCost() {
		return memTotalCost;
	}

	public void setMemTotalCost(Integer memTotalCost) {
		this.memTotalCost = memTotalCost;
	}

}

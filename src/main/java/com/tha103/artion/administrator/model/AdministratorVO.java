package com.tha103.artion.administrator.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.persistence.*;



@Entity
@Table(name = "administrator")
public class AdministratorVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adm_id", updatable = false)
	private Integer admId;
	
	@Column(name = "adm_name")
	private String admName;
	
	@Column(name = "adm_identity")
	private Integer admIdentity;
	
	@Column(name = "adm_status")
	private Boolean admStatus;
	
	@Column(name = "adm_mail")
	private String admMail;
	
	@Column(name = "adm_password")
	private String admPassword;
	
	@Column(name = "adm_birthday")
	private Date admBirthday;
	
	@Column(name = "adm_mobile")
	private String admMobile;
	
	@Column(name = "adm_addTime", insertable = false , updatable = false)
	private Timestamp admAddTime;
	
	@Column(name = "adm_lastModifiedTime", insertable = false , updatable = false)
	private Timestamp admLastModifiedTime;
	
	@Column(name = "adm_profilePhoto", columnDefinition = "longblob")
	private Byte[] admProfilePhoto;
	
	@Column(name = "adm_right")
	private Integer admRight;
	

	public AdministratorVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdministratorVO(Integer admId, String admName, Integer admIdentity, Boolean admStatus, String admMail,
			String admPassword, Date admBirthday, String admMobile, Timestamp admAddTime, Timestamp admLastModifiedTime,
			Byte[] admProfilePhoto, Integer admRight) {
		super();
		this.admId = admId;
		this.admName = admName;
		this.admIdentity = admIdentity;
		this.admStatus = admStatus;
		this.admMail = admMail;
		this.admPassword = admPassword;
		this.admBirthday = admBirthday;
		this.admMobile = admMobile;
		this.admAddTime = admAddTime;
		this.admLastModifiedTime = admLastModifiedTime;
		this.admProfilePhoto = admProfilePhoto;
		this.admRight = admRight;
	}


	public Integer getAdmId() {
		return admId;
	}


	public void setAdmId(Integer admId) {
		this.admId = admId;
	}


	public String getAdmName() {
		return admName;
	}


	public void setAdmName(String admName) {
		this.admName = admName;
	}


	public Integer getAdmIdentity() {
		return admIdentity;
	}


	public void setAdmIdentity(Integer admIdentity) {
		this.admIdentity = admIdentity;
	}


	public Boolean getAdmStatus() {
		return admStatus;
	}


	public void setAdmStatus(Boolean admStatus) {
		this.admStatus = admStatus;
	}


	public String getAdmMail() {
		return admMail;
	}


	public void setAdmMail(String admMail) {
		this.admMail = admMail;
	}


	public String getAdmPassword() {
		return admPassword;
	}


	public void setAdmPassword(String admPassword) {
		this.admPassword = admPassword;
	}


	public Date getAdmBirthday() {
		return admBirthday;
	}


	public void setAdmBirthday(Date admBirthday) {
		this.admBirthday = admBirthday;
	}


	public String getAdmMobile() {
		return admMobile;
	}


	public void setAdmMobile(String admMobile) {
		this.admMobile = admMobile;
	}


	public Timestamp getAdmAddTime() {
		return admAddTime;
	}


	public void setAdmAddTime(Timestamp admAddTime) {
		this.admAddTime = admAddTime;
	}


	public Timestamp getAdmLastModifiedTime() {
		return admLastModifiedTime;
	}


	public void setAdmLastModifiedTime(Timestamp admLastModifiedTime) {
		this.admLastModifiedTime = admLastModifiedTime;
	}


	public Byte[] getAdmProfilePhoto() {
		return admProfilePhoto;
	}


	public void setAdmProfilePhoto(Byte[] admProfilePhoto) {
		this.admProfilePhoto = admProfilePhoto;
	}


	public Integer getAdmRight() {
		return admRight;
	}


	public void setAdmRight(Integer admRight) {
		this.admRight = admRight;
	}


	@Override
	public String toString() {
		return "AdministratorVO [admId=" + admId + ", admName=" + admName + ", admIdentity=" + admIdentity
				+ ", admStatus=" + admStatus + ", admMail=" + admMail + ", admPassword=" + admPassword
				+ ", admBirthday=" + admBirthday + ", admMobile=" + admMobile + ", admAddTime=" + admAddTime
				+ ", admLastModifiedTime=" + admLastModifiedTime + ", admProfilePhoto="
				+ Arrays.toString(admProfilePhoto) + ", admRight=" + admRight + "]";
	}

	
	
}

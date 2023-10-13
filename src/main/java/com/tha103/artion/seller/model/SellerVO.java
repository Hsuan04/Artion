package com.tha103.artion.seller.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tha103.artion.activity.model.ActivityVO;
import com.tha103.artion.sellernNotification.model.SellerNotificationVO;



@Entity
@Table(name = "seller")

public class SellerVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sel_id")
	private Integer selId;
	
	@OneToMany (mappedBy = "seller", cascade = CascadeType.ALL)
	private Set<SellerNotificationVO> sellerNotifications;
	
	public Set<SellerNotificationVO> getSellerNotifications(){
		return sellerNotifications;
	}
	
	public void setSellerNotifications(Set<SellerNotificationVO> sellerNotifications) {
		this.sellerNotifications = sellerNotifications;
	}
	
	@OneToMany (mappedBy = "seller", cascade = CascadeType.ALL)
	private Set<ActivityVO> activitys;
	
	public Set<ActivityVO> getActivitys(){
		return activitys;
	}
	
	public void setActivitys(Set<ActivityVO> activitys) {
		this.activitys = activitys;
	}
	
	@Column(name = "sel_account")
	private String selAccount;

	@Column(name = "sel_password")
	private String selPassword;

	@Column(name = "sel_name")
	private String selName;

	@Column(name = "sel_phone")
	private String selPhone;

	@Column(name = "sel_url")
	private String selUrl;

	@Column(name = "sel_facebook")
	private String selFacebook;
	
	@Column(name = "sel_address")
	private String selAddress;

	@Column(name = "sel_contactPerson")
	private String selContactPerson;

	@Column(name = "sel_introduction")
	private String selIntroduction;

	@Column(name = "sel_bankCode")
	private String selBankCode;

	@Column(name = "sel_bankNumber")
	private String selBankNumber;

	@Column(name = "sel_bankName")
	private String selBankName;

	@Column(name = "sel_remark")
	private String selRemark;

	@Column(name = "sel_title")
	private String selTitle;

	@Column(name = "sel_principal")
	private String selPrincipal;

	@Column(name = "sel_uniformNumbers")
	private String selUniformNumbers;

	@Column(name = "sel_registeredAddress")
	private String selRegisteredAddress;

	@Column(name = "sel_profilePicture")
	private byte[] selProfilePicture;

	@Column(name = "sel_registerdTime", insertable = false, updatable = false)
	private Timestamp selRegisterdTime;

	@Column(name = "sel_lastModifiedTime",insertable = false, updatable = false)
	private Timestamp selLastModifiedTime;

	@Column(name = "sel_status")
	private String selStatus;

	public SellerVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSelId() {
		return selId;
	}

	public void setSelId(Integer selId) {
		this.selId = selId;
	}

	public String getSelAccount() {
		return selAccount;
	}

	public void setSelAccount(String selAccount) {
		this.selAccount = selAccount;
	}

	public String getSelPassword() {
		return selPassword;
	}

	public void setSelPassword(String selPassword) {
		this.selPassword = selPassword;
	}

	public String getSelName() {
		return selName;
	}

	public void setSelName(String selName) {
		this.selName = selName;
	}

	public String getSelPhone() {
		return selPhone;
	}

	public void setSelPhone(String selPhone) {
		this.selPhone = selPhone;
	}

	public String getSelUrl() {
		return selUrl;
	}

	public void setSelUrl(String selUrl) {
		this.selUrl = selUrl;
	}

	public String getSelFacebook() {
		return selFacebook;
	}

	public void setSelFacebook(String selFacebook) {
		this.selFacebook = selFacebook;
	}

	public String getSelAddress() {
		return selAddress;
	}

	public void setSelAddress(String selAddress) {
		this.selAddress = selAddress;
	}

	public String getSelContactPerson() {
		return selContactPerson;
	}

	public void setSelContactPerson(String selContactPerson) {
		this.selContactPerson = selContactPerson;
	}

	public String getSelIntroduction() {
		return selIntroduction;
	}

	public void setSelIntroduction(String selIntroduction) {
		this.selIntroduction = selIntroduction;
	}

	public String getSelBankCode() {
		return selBankCode;
	}

	public void setSelBankCode(String selBankCode) {
		this.selBankCode = selBankCode;
	}

	public String getSelBankNumber() {
		return selBankNumber;
	}

	public void setSelBankNumber(String selBankNumber) {
		this.selBankNumber = selBankNumber;
	}

	public String getSelBankName() {
		return selBankName;
	}

	public void setSelBankName(String selBankName) {
		this.selBankName = selBankName;
	}

	public String getSelRemark() {
		return selRemark;
	}

	public void setSelRemark(String selRemark) {
		this.selRemark = selRemark;
	}

	public String getSelTitle() {
		return selTitle;
	}

	public void setSelTitle(String selTitle) {
		this.selTitle = selTitle;
	}

	public String getSelPrincipal() {
		return selPrincipal;
	}

	public void setSelPrincipal(String selPrincipal) {
		this.selPrincipal = selPrincipal;
	}

	public String getSelUniformNumbers() {
		return selUniformNumbers;
	}

	public void setSelUniformNumbers(String selUniformNumbers) {
		this.selUniformNumbers = selUniformNumbers;
	}

	public String getSelRegisteredAddress() {
		return selRegisteredAddress;
	}

	public void setSelRegisteredAddress(String selRegisteredAddress) {
		this.selRegisteredAddress = selRegisteredAddress;
	}

	public byte[] getSelProfilePicture() {
		return selProfilePicture;
	}

	public void setSelProfilePicture(byte[] selProfilePicture) {
		this.selProfilePicture = selProfilePicture;
	}

	public Timestamp getSelRegisterdTime() {
		return selRegisterdTime;
	}

	public void setSelRegisterdTime(Timestamp selRegisterdTime) {
		this.selRegisterdTime = selRegisterdTime;
	}

	public Timestamp getSelLastModifiedTime() {
		return selLastModifiedTime;
	}

	public void setSelLastModifiedTime(Timestamp selLastModifiedTime) {
		this.selLastModifiedTime = selLastModifiedTime;
	}

	public String getSelStatus() {
		return selStatus;
	}

	public void setSelStatus(String selStatus) {
		this.selStatus = selStatus;
	}

}

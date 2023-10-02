package com.tha103.artion.seller.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")

public class SellerHibernateVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sel_id")
	private Integer sel_id;

	@Column(name = "sel_account")
	private String sel_account;

	@Column(name = "sel_password")
	private String sel_password;

	@Column(name = "sel_name")
	private String sel_name;

	@Column(name = "sel_phone")
	private String sel_phone;

	@Column(name = "sel_url")
	private String sel_url;

	@Column(name = "sel_facebook")
	private String sel_facebook;

	@Column(name = "sel_contactPerson")
	private String sel_contactPerson;

	@Column(name = "sel_introduction")
	private String sel_introduction;

	@Column(name = "sel_bankCode")
	private String sel_bankCode;

	@Column(name = "sel_bankNumber")
	private String sel_bankNumber;

	@Column(name = "sel_bankName")
	private String sel_bankName;

	@Column(name = "sel_remark")
	private String sel_remark;

	@Column(name = "sel_title")
	private String sel_title;

	@Column(name = "sel_principal")
	private String sel_principal;

	@Column(name = "sel_uniformNumbers")
	private String sel_uniformNumbers;

	@Column(name = "sel_registeredAddress")
	private String sel_registeredAddress;

	@Column(name = "sel_profilepicture")
	private byte[] sel_profilepicture;

	@Column(name = "sel_registerdTime")
	private Timestamp sel_registerdTime;

	@Column(name = "sel_lastModifiedTime")
	private Timestamp sel_lastModifiedTime;

	@Column(name = "sel_status")
	private String sel_status;

	public SellerHibernateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSel_id() {
		return sel_id;
	}

	public void setSel_id(Integer sel_id) {
		this.sel_id = sel_id;
	}

	public String getSel_account() {
		return sel_account;
	}

	public void setSel_account(String sel_account) {
		this.sel_account = sel_account;
	}

	public String getSel_password() {
		return sel_password;
	}

	public void setSel_password(String sel_password) {
		this.sel_password = sel_password;
	}

	public String getSel_name() {
		return sel_name;
	}

	public void setSel_name(String sel_name) {
		this.sel_name = sel_name;
	}

	public String getSel_phone() {
		return sel_phone;
	}

	public void setSel_phone(String sel_phone) {
		this.sel_phone = sel_phone;
	}

	public String getSel_url() {
		return sel_url;
	}

	public void setSel_url(String sel_url) {
		this.sel_url = sel_url;
	}

	public String getSel_facebook() {
		return sel_facebook;
	}

	public void setSel_facebook(String sel_facebook) {
		this.sel_facebook = sel_facebook;
	}

	public String getSel_contactPerson() {
		return sel_contactPerson;
	}

	public void setSel_contactPerson(String sel_contactPerson) {
		this.sel_contactPerson = sel_contactPerson;
	}

	public String getSel_introduction() {
		return sel_introduction;
	}

	public void setSel_introduction(String sel_introduction) {
		this.sel_introduction = sel_introduction;
	}

	public String getSel_bankCode() {
		return sel_bankCode;
	}

	public void setSel_bankCode(String sel_bankCode) {
		this.sel_bankCode = sel_bankCode;
	}

	public String getSel_bankNumber() {
		return sel_bankNumber;
	}

	public void setSel_bankNumber(String sel_bankNumber) {
		this.sel_bankNumber = sel_bankNumber;
	}

	public String getSel_bankName() {
		return sel_bankName;
	}

	public void setSel_bankName(String sel_bankName) {
		this.sel_bankName = sel_bankName;
	}

	public String getSel_remark() {
		return sel_remark;
	}

	public void setSel_remark(String sel_remark) {
		this.sel_remark = sel_remark;
	}

	public String getSel_title() {
		return sel_title;
	}

	public void setSel_title(String sel_title) {
		this.sel_title = sel_title;
	}

	public String getSel_principal() {
		return sel_principal;
	}

	public void setSel_principal(String sel_principal) {
		this.sel_principal = sel_principal;
	}

	public String getSel_uniformNumbers() {
		return sel_uniformNumbers;
	}

	public void setSel_uniformNumbers(String sel_uniformNumbers) {
		this.sel_uniformNumbers = sel_uniformNumbers;
	}

	public String getSel_registeredAddress() {
		return sel_registeredAddress;
	}

	public void setSel_registeredAddress(String sel_registeredAddress) {
		this.sel_registeredAddress = sel_registeredAddress;
	}

	public byte[] getSel_profilepicture() {
		return sel_profilepicture;
	}

	public void setSel_profilepicture(byte[] sel_profilepicture) {
		this.sel_profilepicture = sel_profilepicture;
	}

	public Timestamp getSel_registerdTime() {
		return sel_registerdTime;
	}

	public void setSel_registerdTime(Timestamp sel_registerdTime) {
		this.sel_registerdTime = sel_registerdTime;
	}

	public Timestamp getSel_lastModifiedTime() {
		return sel_lastModifiedTime;
	}

	public void setSel_lastModifiedTime(Timestamp sel_lastModifiedTime) {
		this.sel_lastModifiedTime = sel_lastModifiedTime;
	}

	public String getSel_status() {
		return sel_status;
	}

	public void setSel_status(String sel_status) {
		this.sel_status = sel_status;
	}

}

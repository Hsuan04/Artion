package com.tha103.artion.activity.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity")

public class ActivityHibernateVO {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "act_id")
		private Integer act_id;
		
		@Column(name = "actName")
		private String act_name;
		
		@Column(name = "actTicketID")
		private Integer act_ticketID;		
		
		@Column(name = "actTicketPrice")
		private Integer act_ticketPrice;
		
		@Column(name = "actTicketStartTime")
		private Timestamp act_ticketStartTime;
		
		@Column(name = "actTicketEndTime")
		private Timestamp act_ticketEndTime;
		
		@Column(name = "actType")
		private Integer act_type;
		
		@Column(name = "actStartDate")
		private Date act_startDate;
		
		@Column(name = "actEndDate")
		private Date act_endDate;
		
		@Column(name = "actStartTime")
		private Time act_startTime;
		
		@Column(name = "actEndTime")
		private Time act_endTime;
		
		@Column(name = "actCity")
		private String act_city;
		
		@Column(name = "actZone")
		private String act_zone;
		
		@Column(name = "actAddress")
		private String act_address;
		
		@Column(name = "actOrganization")
		private String act_organization;
		
		@Column(name = "actEmail")
		private String act_email;
		
		@Column(name = "actPhone")
		private String act_phone;
		
		@Column(name = "actTicketTotal")
		private Integer act_ticketTotal;
		
		@Column(name = "actContent")
		private String act_content;
		
		@Column(name = "actCoverPicture")
		private byte[] act_coverPicture;
		
		@Column(name = "actPicture1")
		private byte[] act_picture1;
		
		@Column(name = "actPicture2")
		private byte[] act_picture2;
		
		@Column(name = "actPicture3")
		private byte[] act_picture3;
		
		@Column(name = "actLikeTimes")
		private Integer act_likeTimes;
		
		@Column(name = "actViews")
		private Integer act_views;
		
		@Column(name = "actApproalStatus")
		private Integer act_approalStatus;
		
		@Column(name = "actStatus")
		private Integer act_status;
		
		@Column(name = "selId")
		private Integer sel_id;
		
		@Column(name = "actLongitude")
		private BigDecimal act_longitude;
		
		@Column(name = "actLatitude")
		private BigDecimal act_latitude;
		
		@Column(name = "actTicketTotalSell")
		private Integer act_ticketTotalSell;
		
		@Column(name = "admId")
		private Integer adm_id;
		
		@Column(name = "actLastModifiedTime")
		private Timestamp act_lastModifiedTime;
		
		@Column(name = "actResultContent")
		private String act_ResultContent;
		
		public ActivityHibernateVO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getAct_id() {
			return act_id;
		}

		public void setAct_id(Integer act_id) {
			this.act_id = act_id;
		}

		public String getAct_name() {
			return act_name;
		}

		public void setAct_name(String act_name) {
			this.act_name = act_name;
		}

		public Integer getAct_ticketID() {
			return act_ticketID;
		}

		public void setAct_ticketID(Integer act_ticketID) {
			this.act_ticketID = act_ticketID;
		}

		public Integer getAct_ticketPrice() {
			return act_ticketPrice;
		}

		public void setAct_ticketPrice(Integer act_ticketPrice) {
			this.act_ticketPrice = act_ticketPrice;
		}

		public Timestamp getAct_ticketStartTime() {
			return act_ticketStartTime;
		}

		public void setAct_ticketStartTime(Timestamp act_ticketStartTime) {
			this.act_ticketStartTime = act_ticketStartTime;
		}

		public Timestamp getAct_ticketEndTime() {
			return act_ticketEndTime;
		}

		public void setAct_ticketEndTime(Timestamp act_ticketEndTime) {
			this.act_ticketEndTime = act_ticketEndTime;
		}

		public Integer getAct_type() {
			return act_type;
		}

		public void setAct_type(Integer act_type) {
			this.act_type = act_type;
		}

		public Date getAct_startDate() {
			return act_startDate;
		}

		public void setAct_startDate(Date act_startDate) {
			this.act_startDate = act_startDate;
		}

		public Date getAct_endDate() {
			return act_endDate;
		}

		public void setAct_endDate(Date act_endDate) {
			this.act_endDate = act_endDate;
		}

		public Time getAct_startTime() {
			return act_startTime;
		}

		public void setAct_startTime(Time act_startTime) {
			this.act_startTime = act_startTime;
		}

		public Time getAct_endTime() {
			return act_endTime;
		}

		public void setAct_endTime(Time act_endTime) {
			this.act_endTime = act_endTime;
		}

		public String getAct_city() {
			return act_city;
		}

		public void setAct_city(String act_city) {
			this.act_city = act_city;
		}

		public String getAct_zone() {
			return act_zone;
		}

		public void setAct_zone(String act_zone) {
			this.act_zone = act_zone;
		}

		public String getAct_address() {
			return act_address;
		}

		public void setAct_address(String act_address) {
			this.act_address = act_address;
		}

		public String getAct_organization() {
			return act_organization;
		}

		public void setAct_organization(String act_organization) {
			this.act_organization = act_organization;
		}

		public String getAct_email() {
			return act_email;
		}

		public void setAct_email(String act_email) {
			this.act_email = act_email;
		}

		public String getAct_phone() {
			return act_phone;
		}

		public void setAct_phone(String act_phone) {
			this.act_phone = act_phone;
		}

		public Integer getAct_ticketTotal() {
			return act_ticketTotal;
		}

		public void setAct_ticketTotal(Integer act_ticketTotal) {
			this.act_ticketTotal = act_ticketTotal;
		}

		public String getAct_content() {
			return act_content;
		}

		public void setAct_content(String act_content) {
			this.act_content = act_content;
		}

		public byte[] getAct_coverPicture() {
			return act_coverPicture;
		}

		public void setAct_coverPicture(byte[] act_coverPicture) {
			this.act_coverPicture = act_coverPicture;
		}

		public byte[] getAct_picture1() {
			return act_picture1;
		}

		public void setAct_picture1(byte[] act_picture1) {
			this.act_picture1 = act_picture1;
		}

		public byte[] getAct_picture2() {
			return act_picture2;
		}

		public void setAct_picture2(byte[] act_picture2) {
			this.act_picture2 = act_picture2;
		}

		public byte[] getAct_picture3() {
			return act_picture3;
		}

		public void setAct_picture3(byte[] act_picture3) {
			this.act_picture3 = act_picture3;
		}

		public Integer getAct_likeTimes() {
			return act_likeTimes;
		}

		public void setAct_likeTimes(Integer act_likeTimes) {
			this.act_likeTimes = act_likeTimes;
		}

		public Integer getAct_views() {
			return act_views;
		}

		public void setAct_views(Integer act_views) {
			this.act_views = act_views;
		}

		public Integer getAct_approalStatus() {
			return act_approalStatus;
		}

		public void setAct_approalStatus(Integer act_approalStatus) {
			this.act_approalStatus = act_approalStatus;
		}

		public Integer getAct_status() {
			return act_status;
		}

		public void setAct_status(Integer act_status) {
			this.act_status = act_status;
		}

		public Integer getSel_id() {
			return sel_id;
		}

		public void setSel_id(Integer sel_id) {
			this.sel_id = sel_id;
		}

		public BigDecimal getAct_longitude() {
			return act_longitude;
		}

		public void setAct_longitude(BigDecimal act_longitude) {
			this.act_longitude = act_longitude;
		}

		public BigDecimal getAct_latitude() {
			return act_latitude;
		}

		public void setAct_latitude(BigDecimal act_latitude) {
			this.act_latitude = act_latitude;
		}

		public Integer getAct_ticketTotalSell() {
			return act_ticketTotalSell;
		}

		public void setAct_ticketTotalSell(Integer act_ticketTotalSell) {
			this.act_ticketTotalSell = act_ticketTotalSell;
		}

		public Integer getAdm_id() {
			return adm_id;
		}

		public void setAdm_id(Integer adm_id) {
			this.adm_id = adm_id;
		}

		public Timestamp getAct_lastModifiedTime() {
			return act_lastModifiedTime;
		}

		public void setAct_lastModifiedTime(Timestamp act_lastModifiedTime) {
			this.act_lastModifiedTime = act_lastModifiedTime;
		}

		public String getAct_ResultContent() {
			return act_ResultContent;
		}

		public void setAct_ResultContent(String act_ResultContent) {
			this.act_ResultContent = act_ResultContent;
		}
		
	}


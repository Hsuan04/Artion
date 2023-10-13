package com.tha103.artion.activity.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tha103.artion.seller.model.SellerVO;
import com.tha103.artion.activityComment.model.ActivityCommentVO;
import com.tha103.artion.activitylike.model.ActivityLikeVO;
import com.tha103.artion.memberCollection.model.MemberCollectionVO;

@Entity
@Table(name = "activity")

public class ActivityVO {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "act_id")
		private Integer actId;
		
		@OneToMany(mappedBy = "memberCollection", cascade = CascadeType.ALL)
		private Set<MemberCollectionVO> memberCollections;
		
		public Set<MemberCollectionVO> getMemberCollections(){
			return memberCollections;
		}
		
		public void setMemberCollections(Set<MemberCollectionVO> memberCollections) {
			this.memberCollections = memberCollections;
		}
		
		@OneToMany(mappedBy = "activityLike", cascade = CascadeType.ALL)
		private Set<ActivityLikeVO> activityLikes;
		
		public Set<ActivityLikeVO> getActivityLikes(){
			return activityLikes;
		}
		
		public void setActivityLikes(Set<ActivityLikeVO> activityLikes) {
			this.activityLikes = activityLikes;
		}
		
		@OneToMany(mappedBy = "activityComment", cascade = CascadeType.ALL)
		private Set<ActivityCommentVO> activityComments;
		
		public Set<ActivityCommentVO> getActivityComments(){
			return activityComments;
		}
		
		public void setActivityComments(Set<ActivityCommentVO> activityComments) {
			this.activityComments = activityComments;
		}
		
		@Column(name = "actName")
		private String actName;
		
		@Column(name = "actTicketID")
		private Integer actTicketID;		
		
		@Column(name = "actTicketPrice")
		private Integer actTicketPrice;
		
		@Column(name = "actTicketStartTime")
		private Timestamp actTicketStartTime;
		
		@Column(name = "actTicketEndTime")
		private Timestamp actTicketEndTime;
		
		@Column(name = "actType")
		private Integer actType;
		
		@Column(name = "actStartDate")
		private Date actStartDate;
		
		@Column(name = "actEndDate")
		private Date actEndDate;
		
		@Column(name = "actStartTime")
		private Time actStartTime;
		
		@Column(name = "actEndTime")
		private Time actEndTime;
		
		@Column(name = "actCity")
		private String actCity;
		
		@Column(name = "actZone")
		private String actZone;
		
		@Column(name = "actAddress")
		private String actAddress;
		
		@Column(name = "actOrganization")
		private String actOrganization;
		
		@Column(name = "actEmail")
		private String actEmail;
		
		@Column(name = "actPhone")
		private String actPhone;
		
		@Column(name = "actTicketTotal")
		private Integer actTicketTotal;
		
		@Column(name = "actContent")
		private String actContent;
		
		@Column(name = "actCoverPicture")
		private byte[] actCoverPicture;
		
		@Column(name = "actPicture1")
		private byte[] actPicture1;
		
		@Column(name = "actPicture2")
		private byte[] actPicture2;
		
		@Column(name = "actPicture3")
		private byte[] actPicture3;
		
		@Column(name = "actLikeTimes")
		private Integer actLikeTimes;
		
		@Column(name = "actViews")
		private Integer actViews;
		
		@Column(name = "actApproalStatus")
		private Integer actApproalStatus;
		
		@Column(name = "actStatus")
		private Integer actStatus;
		
		@ManyToOne
		@JoinColumn(name = "sel_id", referencedColumnName = "sel_id")
		private SellerVO seller;
		
		@Column(name = "actLongitude")
		private BigDecimal actLongitude;
		
		@Column(name = "actLatitude")
		private BigDecimal actLatitude;
		
		@Column(name = "actTicketTotalSell")
		private Integer actTicketTotalSell;
		
		@Column(name = "admId")
		private Integer admId;
		
		@Column(name = "actLastModifiedTime", insertable = false, updatable = false)
		private Timestamp actLastModifiedTime;
		
		@Column(name = "actResultContent")
		private String actResultContent;
		
		public ActivityVO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getActId() {
			return actId;
		}

		public void setActId(Integer actId) {
			this.actId = actId;
		}

		public String getActName() {
			return actName;
		}

		public void setActName(String actName) {
			this.actName = actName;
		}

		public Integer getActTicketID() {
			return actTicketID;
		}

		public void setActTicketID(Integer actTicketID) {
			this.actTicketID = actTicketID;
		}

		public Integer getActTicketPrice() {
			return actTicketPrice;
		}

		public void setActTicketPrice(Integer actTicketPrice) {
			this.actTicketPrice = actTicketPrice;
		}

		public Timestamp getActTicketStartTime() {
			return actTicketStartTime;
		}

		public void setActTicketStartTime(Timestamp actTicketStartTime) {
			this.actTicketStartTime = actTicketStartTime;
		}

		public Timestamp getActTicketEndTime() {
			return actTicketEndTime;
		}

		public void setActTicketEndTime(Timestamp actTicketEndTime) {
			this.actTicketEndTime = actTicketEndTime;
		}

		public Integer getActType() {
			return actType;
		}

		public void setActType(Integer actType) {
			this.actType = actType;
		}

		public Date getActStartDate() {
			return actStartDate;
		}

		public void setActStartDate(Date actStartDate) {
			this.actStartDate = actStartDate;
		}

		public Date getActEndDate() {
			return actEndDate;
		}

		public void setActEndDate(Date actEndDate) {
			this.actEndDate = actEndDate;
		}

		public Time getActStartTime() {
			return actStartTime;
		}

		public void setActStartTime(Time actStartTime) {
			this.actStartTime = actStartTime;
		}

		public Time getActEndTime() {
			return actEndTime;
		}

		public void setActEndTime(Time actEndTime) {
			this.actEndTime = actEndTime;
		}

		public String getActCity() {
			return actCity;
		}

		public void setActCity(String actCity) {
			this.actCity = actCity;
		}

		public String getActZone() {
			return actZone;
		}

		public void setActZone(String actZone) {
			this.actZone = actZone;
		}

		public String getActAddress() {
			return actAddress;
		}

		public void setActAddress(String actAddress) {
			this.actAddress = actAddress;
		}

		public String getActOrganization() {
			return actOrganization;
		}

		public void setActOrganization(String actOrganization) {
			this.actOrganization = actOrganization;
		}

		public String getActEmail() {
			return actEmail;
		}

		public void setActEmail(String actEmail) {
			this.actEmail = actEmail;
		}

		public String getActPhone() {
			return actPhone;
		}

		public void setActPhone(String actPhone) {
			this.actPhone = actPhone;
		}

		public Integer getActTicketTotal() {
			return actTicketTotal;
		}

		public void setActTicketTotal(Integer actTicketTotal) {
			this.actTicketTotal = actTicketTotal;
		}

		public String getActContent() {
			return actContent;
		}

		public void setActContent(String actContent) {
			this.actContent = actContent;
		}

		public byte[] getActCoverPicture() {
			return actCoverPicture;
		}

		public void setActCoverPicture(byte[] actCoverPicture) {
			this.actCoverPicture = actCoverPicture;
		}

		public byte[] getActPicture1() {
			return actPicture1;
		}

		public void setActPicture1(byte[] actPicture1) {
			this.actPicture1 = actPicture1;
		}

		public byte[] getActPicture2() {
			return actPicture2;
		}

		public void setActPicture2(byte[] actPicture2) {
			this.actPicture2 = actPicture2;
		}

		public byte[] getActPicture3() {
			return actPicture3;
		}

		public void setActPicture3(byte[] actPicture3) {
			this.actPicture3 = actPicture3;
		}

		public Integer getActLikeTimes() {
			return actLikeTimes;
		}

		public void setActLikeTimes(Integer actLikeTimes) {
			this.actLikeTimes = actLikeTimes;
		}

		public Integer getActViews() {
			return actViews;
		}

		public void setActViews(Integer actViews) {
			this.actViews = actViews;
		}

		public Integer getActApproalStatus() {
			return actApproalStatus;
		}

		public void setActApproalStatus(Integer actApproalStatus) {
			this.actApproalStatus = actApproalStatus;
		}

		public Integer getActStatus() {
			return actStatus;
		}

		public void setActStatus(Integer actStatus) {
			this.actStatus = actStatus;
		}

		public BigDecimal getActLongitude() {
			return actLongitude;
		}

		public void setActLongitude(BigDecimal actLongitude) {
			this.actLongitude = actLongitude;
		}

		public BigDecimal getActLatitude() {
			return actLatitude;
		}

		public void setActLatitude(BigDecimal actLatitude) {
			this.actLatitude = actLatitude;
		}

		public Integer getActTicketTotalSell() {
			return actTicketTotalSell;
		}

		public void setActTicketTotalSell(Integer actTicketTotalSell) {
			this.actTicketTotalSell = actTicketTotalSell;
		}

		public Integer getAdmId() {
			return admId;
		}

		public void setAdmId(Integer admId) {
			this.admId = admId;
		}

		public Timestamp getActLastModifiedTime() {
			return actLastModifiedTime;
		}

		public void setActLastModifiedTime(Timestamp actLastModifiedTime) {
			this.actLastModifiedTime = actLastModifiedTime;
		}

		public String getActResultContent() {
			return actResultContent;
		}

		public void setActResultContent(String actResultContent) {
			this.actResultContent = actResultContent;
		}

		public SellerVO getSeller() {
			return seller;
		}
		
		public void setSeller(SellerVO seller) {
			this.seller = seller;
		}

	}


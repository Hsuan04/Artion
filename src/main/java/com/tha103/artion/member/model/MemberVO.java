package com.tha103.artion.member.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.tha103.artion.memberLevel.model.MemberLevelVO;
import com.tha103.artion.memberNotify.model.MemberNotifyVO;
import com.tha103.artion.myPromoCode.model.MyPromoCodeVO;

import javax.persistence.CascadeType;

@Entity
@Table(name = "member")
public class MemberVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mem_id")
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
	@Column(name = "mem_registerdTime", updatable = false)
	private Date memRegisterdTime;
	@Column(name = "mem_lastModifiedTime", insertable = false, updatable = false)
	private Date memLastModifiedTime;

	@ManyToOne
	@JoinColumn(name = "memLev_level", referencedColumnName = "memLev_level")
	private MemberLevelVO memLevLevel;

	@Column(name = "mem_profilePhoto", columnDefinition = "longblob")
	private byte[] memProfilePhoto;
	@Column(name = "mem_totalCost")
	private Integer memTotalCost;

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private Set<MyPromoCodeVO> mypromocodes;
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private Set<MemberNotifyVO> membernotifys;
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private Set<MerchOrderVO> merOrders;
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private Set<TicketOrderDetailVO> ticOrdDetails;
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private Set<ActivityCommentVO> actComs;
	@OneToMany(mappedBy ="member",cascade = CascadeType.ALL )
	private Set<ActivityLikeVO> actLikes;
	@OneToMany(mappedBy ="member", cascade = CascadeType.ALL)
	private Set<MemberCollectionVO> memberCollections;
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private Set<ActivityCommentLikeVO>actComLikes;
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
	public MemberLevelVO getMemLevLevel() {
		return memLevLevel;
	}
	public void setMemLevLevel(MemberLevelVO memLevLevel) {
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
	public Set<MyPromoCodeVO> getMypromocodes() {
		return mypromocodes;
	}
	public void setMypromocodes(Set<MyPromoCodeVO> mypromocodes) {
		this.mypromocodes = mypromocodes;
	}
	public Set<MemberNotifyVO> getMembernotifys() {
		return membernotifys;
	}
	public void setMembernotifys(Set<MemberNotifyVO> membernotifys) {
		this.membernotifys = membernotifys;
	}
	public Set<MerchOrderVO> getMerOrders() {
		return merOrders;
	}
	public void setMerOrders(Set<MerchOrderVO> merOrders) {
		this.merOrders = merOrders;
	}
	public Set<TicketOrderDetailVO> getTicOrdDetails() {
		return ticOrdDetails;
	}
	public void setTicOrdDetails(Set<TicketOrderDetailVO> ticOrdDetails) {
		this.ticOrdDetails = ticOrdDetails;
	}
	public Set<ActivityCommentVO> getActComs() {
		return actComs;
	}
	public void setActComs(Set<ActivityCommentVO> actComs) {
		this.actComs = actComs;
	}
	public Set<ActivityLikeVO> getActLikes() {
		return actLikes;
	}
	public void setActLikes(Set<ActivityLikeVO> actLikes) {
		this.actLikes = actLikes;
	}
	public Set<MemberCollectionVO> getMemberCollections() {
		return memberCollections;
	}
	public void setMemberCollections(Set<MemberCollectionVO> memberCollections) {
		this.memberCollections = memberCollections;
	}
	public Set<ActivityCommentLikeVO> getActComLikes() {
		return actComLikes;
	}
	public void setActComLikes(Set<ActivityCommentLikeVO> actComLikes) {
		this.actComLikes = actComLikes;
	}
	

}

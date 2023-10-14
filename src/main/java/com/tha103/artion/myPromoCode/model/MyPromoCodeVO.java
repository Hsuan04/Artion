package com.tha103.artion.myPromoCode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tha103.artion.member.model.MemberVO;
import com.tha103.artion.promocode.model.PromoCodeVO;

@Entity
@Table(name = "mypromocode")
public class MyPromoCodeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "myProCode_id")	
	private Integer myProCodeId;
	@Column(name="myProCode_status",columnDefinition = "boolean")
	private Boolean myProCodeStatus;
	
	@ManyToOne
	@JoinColumn(name="proCode_id",referencedColumnName = "proCode_id")
	private PromoCodeVO proCodeId;
	
	@ManyToOne
	@JoinColumn(name="mem_id",referencedColumnName = "mem_id")
	private MemberVO memId;

	public Integer getMyProCodeId() {
		return myProCodeId;
	}

	public void setMyProCodeId(Integer myProCodeId) {
		this.myProCodeId = myProCodeId;
	}

	public Boolean getMyProCodeStatus() {
		return myProCodeStatus;
	}

	public void setMyProCodeStatus(Boolean myProCodeStatus) {
		this.myProCodeStatus = myProCodeStatus;
	}

	public PromoCodeVO getProCodeId() {
		return proCodeId;
	}

	public void setProCodeId(PromoCodeVO proCodeId) {
		this.proCodeId = proCodeId;
	}

	public MemberVO getMemId() {
		return memId;
	}

	public void setMemId(MemberVO memId) {
		this.memId = memId;
	}
	
	
}

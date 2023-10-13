package com.tha103.artion.merchOrder.model;

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

import com.tha103.artion.member.model.MemberVO;
import com.tha103.artion.merchOrderDetail.model.MerchOrderDetailVO;

@Entity
@Table(name = "merchorder")
// 配合 TestHQLWithParameter.java

public class MerchOrderVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merOrder_id", updatable = false)
	private Integer merOrderId;

	@OneToMany(mappedBy = "merchorder", cascade = CascadeType.ALL)
	private Set<MerchOrderDetailVO> MerchOrderDetails;

	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private MemberVO memId;

	@Column(name = "merOrder_actuallyAmount")
	private Double merOrderActuallyAmount;

	@Column(name = "merOrder_time", insertable = false, updatable = false)
	private Timestamp merOrderTime;

	@Column(name = "merOrder_payStatus")
	private Integer merOrderPayStatus;

	@Column(name = "merOrder_status")
	private Integer merOrderStatus;

	@Column(name = "merOrder_address")
	private String merOrderAddress;

	@Column(name = "merOrder_code")
	private String merOrderCode;

	public MerchOrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchOrderVO(Integer merOrderId, MemberVO memId, Double merOrderActuallyAmount, Timestamp merOrderTime,
			Integer merOrderPayStatus, Integer merOrderStatus, String merOrderAddress, String merOrderCode) {
		super();
		this.merOrderId = merOrderId;
		this.memId = memId;
		this.merOrderActuallyAmount = merOrderActuallyAmount;
		this.merOrderTime = merOrderTime;
		this.merOrderPayStatus = merOrderPayStatus;
		this.merOrderStatus = merOrderStatus;
		this.merOrderAddress = merOrderAddress;
		this.merOrderCode = merOrderCode;
	}

	public Integer getMerOrderId() {
		return merOrderId;
	}

	public void setMerOrderId(Integer merOrderId) {
		this.merOrderId = merOrderId;
	}

	public Set<MerchOrderDetailVO> getMerchOrderDetails() {
		return MerchOrderDetails;
	}

	public void setMerchOrderDetails(Set<MerchOrderDetailVO> merchOrderDetails) {
		MerchOrderDetails = merchOrderDetails;
	}

	public MemberVO getMemId() {
		return memId;
	}

	public void setMemId(MemberVO memId) {
		this.memId = memId;
	}

	public Double getMerOrderActuallyAmount() {
		return merOrderActuallyAmount;
	}

	public void setMerOrderActuallyAmount(Double merOrderActuallyAmount) {
		this.merOrderActuallyAmount = merOrderActuallyAmount;
	}

	public Timestamp getMerOrderTime() {
		return merOrderTime;
	}

	public void setMerOrderTime(Timestamp merOrderTime) {
		this.merOrderTime = merOrderTime;
	}

	public Integer getMerOrderPayStatus() {
		return merOrderPayStatus;
	}

	public void setMerOrderPayStatus(Integer merOrderPayStatus) {
		this.merOrderPayStatus = merOrderPayStatus;
	}

	public Integer getMerOrderStatus() {
		return merOrderStatus;
	}

	public void setMerOrderStatus(Integer merOrderStatus) {
		this.merOrderStatus = merOrderStatus;
	}

	public String getMerOrderAddress() {
		return merOrderAddress;
	}

	public void setMerOrderAddress(String merOrderAddress) {
		this.merOrderAddress = merOrderAddress;
	}

	public String getMerOrderCode() {
		return merOrderCode;
	}

	public void setMerOrderCode(String merOrderCode) {
		this.merOrderCode = merOrderCode;
	}

	@Override
	public String toString() {
		return "MerchOrderVO [merOrderId=" + merOrderId + ", memId=" + memId + ", merOrderActuallyAmount="
				+ merOrderActuallyAmount + ", merOrderTime=" + merOrderTime + ", merOrderPayStatus=" + merOrderPayStatus
				+ ", merOrderStatus=" + merOrderStatus + ", merOrderAddress=" + merOrderAddress + ", merOrderCode="
				+ merOrderCode + "]";
	}

}

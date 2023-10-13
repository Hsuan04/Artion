package com.tha103.artion.ticketOrder.model;

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
import com.tha103.artion.myPromoCode.model.MyPromoCodeVO;
import com.tha103.artion.seller.model.SellerHibernateVO;
import com.tha103.artion.ticketOrderDetail.model.TicketOrderDetailVO;

@Entity
@Table(name = "ticketorder")
// 配合 TestHQLWithParameter.java

public class TicketOrderVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticketOrd_id", updatable = false)
	private Integer ticketOrdId;

	@OneToMany(mappedBy = "ticketorder", cascade = CascadeType.ALL)
	private Set<TicketOrderDetailVO> ticketOrderDetailsDetailVOs;

	@Column(name = "ticketOrd_time", insertable = false, updatable = false)
	private Timestamp ticketOrdTime;

	@ManyToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "mem_id")
	private MemberVO memId;

	@Column(name = "ticketOrd_status")
	private Integer ticketOrdStatus;

	@Column(name = "ticketOrd_totalPrice")
	private Double ticketOrdTotalPrice;

	@Column(name = "ticketOrd_proCodeAmount")
	private Double ticketOrdProCodeAmount;

	@Column(name = "ticketOrd_actuallyAmount")
	private Double ticketOrdActuallyAmount;

	@Column(name = "ticketOrd_payStatus")
	private Integer ticketOrdPayStatus;

	@ManyToOne
	@JoinColumn(name = "myProCode_id", referencedColumnName = "myProCode_id")
	private MyPromoCodeVO myProCodeId;

	@Column(name = "ticketOrd_address")
	private String ticketOrdAddress;

	@ManyToOne
	@JoinColumn(name = "sel_id", referencedColumnName = "sel_id")
	private SellerHibernateVO selId;

	@Column(name = "ticketOrd_code")
	private String ticketOrdCode;

	public TicketOrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOrderVO(Integer ticketOrdId, Timestamp ticketOrdTime, MemberVO memId, Integer ticketOrdStatus,
			Double ticketOrdTotalPrice, Double ticketOrdProCodeAmount, Double ticketOrdActuallyAmount,
			Integer ticketOrdPayStatus, MyPromoCodeVO myProCodeId, String ticketOrdAddress, SellerHibernateVO selId,
			String ticketOrdCode) {
		super();
		this.ticketOrdId = ticketOrdId;
		this.ticketOrdTime = ticketOrdTime;
		this.memId = memId;
		this.ticketOrdStatus = ticketOrdStatus;
		this.ticketOrdTotalPrice = ticketOrdTotalPrice;
		this.ticketOrdProCodeAmount = ticketOrdProCodeAmount;
		this.ticketOrdActuallyAmount = ticketOrdActuallyAmount;
		this.ticketOrdPayStatus = ticketOrdPayStatus;
		this.myProCodeId = myProCodeId;
		this.ticketOrdAddress = ticketOrdAddress;
		this.selId = selId;
		this.ticketOrdCode = ticketOrdCode;
	}

	public Integer getTicketOrdId() {
		return ticketOrdId;
	}

	public void setTicketOrdId(Integer ticketOrdId) {
		this.ticketOrdId = ticketOrdId;
	}

	public Set<TicketOrderDetailVO> getTicketOrderDetailsDetailVOs() {
		return ticketOrderDetailsDetailVOs;
	}

	public void setTicketOrderDetailsDetailVOs(Set<TicketOrderDetailVO> ticketOrderDetailsDetailVOs) {
		this.ticketOrderDetailsDetailVOs = ticketOrderDetailsDetailVOs;
	}

	public Timestamp getTicketOrdTime() {
		return ticketOrdTime;
	}

	public void setTicketOrdTime(Timestamp ticketOrdTime) {
		this.ticketOrdTime = ticketOrdTime;
	}

	public MemberVO getMemId() {
		return memId;
	}

	public void setMemId(MemberVO memId) {
		this.memId = memId;
	}

	public Integer getTicketOrdStatus() {
		return ticketOrdStatus;
	}

	public void setTicketOrdStatus(Integer ticketOrdStatus) {
		this.ticketOrdStatus = ticketOrdStatus;
	}

	public Double getTicketOrdTotalPrice() {
		return ticketOrdTotalPrice;
	}

	public void setTicketOrdTotalPrice(Double ticketOrdTotalPrice) {
		this.ticketOrdTotalPrice = ticketOrdTotalPrice;
	}

	public Double getTicketOrdProCodeAmount() {
		return ticketOrdProCodeAmount;
	}

	public void setTicketOrdProCodeAmount(Double ticketOrdProCodeAmount) {
		this.ticketOrdProCodeAmount = ticketOrdProCodeAmount;
	}

	public Double getTicketOrdActuallyAmount() {
		return ticketOrdActuallyAmount;
	}

	public void setTicketOrdActuallyAmount(Double ticketOrdActuallyAmount) {
		this.ticketOrdActuallyAmount = ticketOrdActuallyAmount;
	}

	public Integer getTicketOrdPayStatus() {
		return ticketOrdPayStatus;
	}

	public void setTicketOrdPayStatus(Integer ticketOrdPayStatus) {
		this.ticketOrdPayStatus = ticketOrdPayStatus;
	}

	public MyPromoCodeVO getMyProCodeId() {
		return myProCodeId;
	}

	public void setMyProCodeId(MyPromoCodeVO myProCodeId) {
		this.myProCodeId = myProCodeId;
	}

	public String getTicketOrdAddress() {
		return ticketOrdAddress;
	}

	public void setTicketOrdAddress(String ticketOrdAddress) {
		this.ticketOrdAddress = ticketOrdAddress;
	}

	public SellerHibernateVO getSelId() {
		return selId;
	}

	public void setSelId(SellerHibernateVO selId) {
		this.selId = selId;
	}

	public String getTicketOrdCode() {
		return ticketOrdCode;
	}

	public void setTicketOrdCode(String ticketOrdCode) {
		this.ticketOrdCode = ticketOrdCode;
	}

	@Override
	public String toString() {
		return "TicketOrderVO [ticketOrdId=" + ticketOrdId + ", ticketOrdTime=" + ticketOrdTime + ", memId=" + memId
				+ ", ticketOrdStatus=" + ticketOrdStatus + ", ticketOrdTotalPrice=" + ticketOrdTotalPrice
				+ ", ticketOrdProCodeAmount=" + ticketOrdProCodeAmount + ", ticketOrdActuallyAmount="
				+ ticketOrdActuallyAmount + ", ticketOrdPayStatus=" + ticketOrdPayStatus + ", myProCodeId="
				+ myProCodeId + ", ticketOrdAddress=" + ticketOrdAddress + ", selId=" + selId + ", ticketOrdCode="
				+ ticketOrdCode + "]";
	}

}

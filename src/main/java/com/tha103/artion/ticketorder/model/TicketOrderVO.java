package com.tha103.artion.ticketorder.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchorder")
// 配合 TestHQLWithParameter.java

public class TicketOrderVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticketOrd_id", updatable = false)
	private Integer ticketOrdId;

	@Column(name = "ticketOrd_time")
	private Timestamp ticketOrdTime;

	@Column(name = "mem_id")
	private Integer memId;

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

	@Column(name = "myProCode_id")
	private Integer myProCodeId;

	@Column(name = "ticketOrd_address")
	private String ticketOrdAddress;

	@Column(name = "sel_id")
	private Integer selId;

	@Column(name = "ticketOrd_code")
	private String ticketOrdCode;

	public TicketOrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOrderVO(Integer ticketOrdId, Timestamp ticketOrdTime, Integer memId, Integer ticketOrdStatus,
			Double ticketOrdTotalPrice, Double ticketOrdProCodeAmount, Double ticketOrdActuallyAmount,
			Integer ticketOrdPayStatus, Integer myProCodeId, String ticketOrdAddress, Integer selId,
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

	public Timestamp getTicketOrdTime() {
		return ticketOrdTime;
	}

	public void setTicketOrdTime(Timestamp ticketOrdTime) {
		this.ticketOrdTime = ticketOrdTime;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
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

	public Integer getMyProCodeId() {
		return myProCodeId;
	}

	public void setMyProCodeId(Integer myProCodeId) {
		this.myProCodeId = myProCodeId;
	}

	public String getTicketOrdAddress() {
		return ticketOrdAddress;
	}

	public void setTicketOrdAddress(String ticketOrdAddress) {
		this.ticketOrdAddress = ticketOrdAddress;
	}

	public Integer getSelId() {
		return selId;
	}

	public void setSelId(Integer selId) {
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

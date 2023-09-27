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
	private Integer ticketOrd_id;

	@Column(name = "ticketOrd_time")
	private Timestamp ticketOrd_time;

	@Column(name = "mem_id")
	private Integer mem_id;

	@Column(name = "ticketOrd_status")
	private Integer ticketOrd_status;

	@Column(name = "ticketOrd_totalPrice")
	private Double ticketOrd_totalPrice;

	@Column(name = "ticketOrd_proCodeAmount")
	private Double ticketOrd_proCodeAmount;

	@Column(name = "ticketOrd_actuallyAmount")
	private Double ticketOrd_actuallyAmount;

	@Column(name = "ticketOrd_payStatus")
	private Integer ticketOrd_payStatus;

	@Column(name = "myProCode_id")
	private Integer myProCode_id;

	@Column(name = "ticketOrd_address")
	private String ticketOrd_address;

	@Column(name = "sel_id")
	private Integer sel_id;

	@Column(name = "ticketOrd_code")
	private String ticketOrd_code;

	public TicketOrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOrderVO(Integer ticketOrd_id, Timestamp ticketOrd_time, Integer mem_id, Integer ticketOrd_status,
			Double ticketOrd_totalPrice, Double ticketOrd_proCodeAmount, Double ticketOrd_actuallyAmount,
			Integer ticketOrd_payStatus, Integer myProCode_id, String ticketOrd_address, Integer sel_id,
			String ticketOrd_code) {
		super();
		this.ticketOrd_id = ticketOrd_id;
		this.ticketOrd_time = ticketOrd_time;
		this.mem_id = mem_id;
		this.ticketOrd_status = ticketOrd_status;
		this.ticketOrd_totalPrice = ticketOrd_totalPrice;
		this.ticketOrd_proCodeAmount = ticketOrd_proCodeAmount;
		this.ticketOrd_actuallyAmount = ticketOrd_actuallyAmount;
		this.ticketOrd_payStatus = ticketOrd_payStatus;
		this.myProCode_id = myProCode_id;
		this.ticketOrd_address = ticketOrd_address;
		this.sel_id = sel_id;
		this.ticketOrd_code = ticketOrd_code;
	}

	public Integer getTicketOrd_id() {
		return ticketOrd_id;
	}

	public void setTicketOrd_id(Integer ticketOrd_id) {
		this.ticketOrd_id = ticketOrd_id;
	}

	public Timestamp getTicketOrd_time() {
		return ticketOrd_time;
	}

	public void setTicketOrd_time(Timestamp ticketOrd_time) {
		this.ticketOrd_time = ticketOrd_time;
	}

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public Integer getTicketOrd_status() {
		return ticketOrd_status;
	}

	public void setTicketOrd_status(Integer ticketOrd_status) {
		this.ticketOrd_status = ticketOrd_status;
	}

	public Double getTicketOrd_totalPrice() {
		return ticketOrd_totalPrice;
	}

	public void setTicketOrd_totalPrice(Double ticketOrd_totalPrice) {
		this.ticketOrd_totalPrice = ticketOrd_totalPrice;
	}

	public Double getTicketOrd_proCodeAmount() {
		return ticketOrd_proCodeAmount;
	}

	public void setTicketOrd_proCodeAmount(Double ticketOrd_proCodeAmount) {
		this.ticketOrd_proCodeAmount = ticketOrd_proCodeAmount;
	}

	public Double getTicketOrd_actuallyAmount() {
		return ticketOrd_actuallyAmount;
	}

	public void setTicketOrd_actuallyAmount(Double ticketOrd_actuallyAmount) {
		this.ticketOrd_actuallyAmount = ticketOrd_actuallyAmount;
	}

	public Integer getTicketOrd_payStatus() {
		return ticketOrd_payStatus;
	}

	public void setTicketOrd_payStatus(Integer ticketOrd_payStatus) {
		this.ticketOrd_payStatus = ticketOrd_payStatus;
	}

	public Integer getMyProCode_id() {
		return myProCode_id;
	}

	public void setMyProCode_id(Integer myProCode_id) {
		this.myProCode_id = myProCode_id;
	}

	public String getTicketOrd_address() {
		return ticketOrd_address;
	}

	public void setTicketOrd_address(String ticketOrd_address) {
		this.ticketOrd_address = ticketOrd_address;
	}

	public Integer getSel_id() {
		return sel_id;
	}

	public void setSel_id(Integer sel_id) {
		this.sel_id = sel_id;
	}

	public String getTicketOrd_code() {
		return ticketOrd_code;
	}

	public void setTicketOrd_code(String ticketOrd_code) {
		this.ticketOrd_code = ticketOrd_code;
	}

	@Override
	public String toString() {
		return "TicketOrderVO [ticketOrd_id=" + ticketOrd_id + ", ticketOrd_time=" + ticketOrd_time + ", mem_id="
				+ mem_id + ", ticketOrd_status=" + ticketOrd_status + ", ticketOrd_totalPrice=" + ticketOrd_totalPrice
				+ ", ticketOrd_proCodeAmount=" + ticketOrd_proCodeAmount + ", ticketOrd_actuallyAmount="
				+ ticketOrd_actuallyAmount + ", ticketOrd_payStatus=" + ticketOrd_payStatus + ", myProCode_id="
				+ myProCode_id + ", ticketOrd_address=" + ticketOrd_address + ", sel_id=" + sel_id + ", ticketOrd_code="
				+ ticketOrd_code + "]";
	}

}

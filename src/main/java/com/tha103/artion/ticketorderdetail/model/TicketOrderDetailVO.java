package com.tha103.artion.ticketorderdetail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchorder")
// 配合 TestHQLWithParameter.java

public class TicketOrderDetailVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticOrdDetail_id", updatable = false)
	private Integer ticOrdDetail_id;

	@Column(name = "ticketOrd_id")
	private Integer ticketOrd_id;

	@Column(name = "ticketOrdDetail_quantity")
	private Integer ticketOrdDetail_quantity;

	@Column(name = "ticOrdDetail_price")
	private Double ticOrdDetail_price;

	@Column(name = "act_id")
	private Integer act_id;

	public TicketOrderDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOrderDetailVO(Integer ticOrdDetail_id, Integer ticketOrd_id, Integer ticketOrdDetail_quantity,
			Double ticOrdDetail_price, Integer act_id) {
		super();
		this.ticOrdDetail_id = ticOrdDetail_id;
		this.ticketOrd_id = ticketOrd_id;
		this.ticketOrdDetail_quantity = ticketOrdDetail_quantity;
		this.ticOrdDetail_price = ticOrdDetail_price;
		this.act_id = act_id;
	}

	public Integer getTicOrdDetail_id() {
		return ticOrdDetail_id;
	}

	public void setTicOrdDetail_id(Integer ticOrdDetail_id) {
		this.ticOrdDetail_id = ticOrdDetail_id;
	}

	public Integer getTicketOrd_id() {
		return ticketOrd_id;
	}

	public void setTicketOrd_id(Integer ticketOrd_id) {
		this.ticketOrd_id = ticketOrd_id;
	}

	public Integer getTicketOrdDetail_quantity() {
		return ticketOrdDetail_quantity;
	}

	public void setTicketOrdDetail_quantity(Integer ticketOrdDetail_quantity) {
		this.ticketOrdDetail_quantity = ticketOrdDetail_quantity;
	}

	public Double getTicOrdDetail_price() {
		return ticOrdDetail_price;
	}

	public void setTicOrdDetail_price(Double ticOrdDetail_price) {
		this.ticOrdDetail_price = ticOrdDetail_price;
	}

	public Integer getAct_id() {
		return act_id;
	}

	public void setAct_id(Integer act_id) {
		this.act_id = act_id;
	}

	@Override
	public String toString() {
		return "TicketOrderDetailVO [ticOrdDetail_id=" + ticOrdDetail_id + ", ticketOrd_id=" + ticketOrd_id
				+ ", ticketOrdDetail_quantity=" + ticketOrdDetail_quantity + ", ticOrdDetail_price="
				+ ticOrdDetail_price + ", act_id=" + act_id + "]";
	}

}

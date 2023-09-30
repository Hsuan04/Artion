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
	private Integer ticOrdDetailId;

	@Column(name = "ticketOrd_id")
	private Integer ticketOrdId;

	@Column(name = "ticketOrdDetail_quantity")
	private Integer ticketOrdDetailQuantity;

	@Column(name = "ticOrdDetail_price")
	private Double ticOrdDetailPrice;

	@Column(name = "act_id")
	private Integer actId;

	public TicketOrderDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOrderDetailVO(Integer ticOrdDetailId, Integer ticketOrdId, Integer ticketOrdDetailQuantity,
			Double ticOrdDetailPrice, Integer actId) {
		super();
		this.ticOrdDetailId = ticOrdDetailId;
		this.ticketOrdId = ticketOrdId;
		this.ticketOrdDetailQuantity = ticketOrdDetailQuantity;
		this.ticOrdDetailPrice = ticOrdDetailPrice;
		this.actId = actId;
	}

	public Integer getTicOrdDetailId() {
		return ticOrdDetailId;
	}

	public void setTicOrdDetailId(Integer ticOrdDetailId) {
		this.ticOrdDetailId = ticOrdDetailId;
	}

	public Integer getTicketOrdId() {
		return ticketOrdId;
	}

	public void setTicketOrdId(Integer ticketOrdId) {
		this.ticketOrdId = ticketOrdId;
	}

	public Integer getTicketOrdDetailQuantity() {
		return ticketOrdDetailQuantity;
	}

	public void setTicketOrdDetailQuantity(Integer ticketOrdDetailQuantity) {
		this.ticketOrdDetailQuantity = ticketOrdDetailQuantity;
	}

	public Double getTicOrdDetailPrice() {
		return ticOrdDetailPrice;
	}

	public void setTicOrdDetailPrice(Double ticOrdDetailPrice) {
		this.ticOrdDetailPrice = ticOrdDetailPrice;
	}

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	@Override
	public String toString() {
		return "TicketOrderDetailVO [ticOrdDetailId=" + ticOrdDetailId + ", ticketOrdId=" + ticketOrdId
				+ ", ticketOrdDetailQuantity=" + ticketOrdDetailQuantity + ", ticOrdDetailPrice=" + ticOrdDetailPrice
				+ ", actId=" + actId + "]";
	}

}

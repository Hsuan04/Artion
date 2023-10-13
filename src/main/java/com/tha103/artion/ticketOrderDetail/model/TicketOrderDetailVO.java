package com.tha103.artion.ticketOrderDetail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tha103.artion.activity.model.ActivityHibernateVO;
import com.tha103.artion.ticketOrder.model.TicketOrderVO;

@Entity
@Table(name = "merchorder")
// 配合 TestHQLWithParameter.java

public class TicketOrderDetailVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticOrdDetail_id", updatable = false)
	private Integer ticOrdDetailId;

	@ManyToOne
	@JoinColumn(name = "ticketOrd_id", referencedColumnName = "ticketOrd_id")
	private TicketOrderVO ticketOrdId;

	@Column(name = "ticketOrdDetail_quantity")
	private Integer ticketOrdDetailQuantity;

	@Column(name = "ticOrdDetail_price")
	private Double ticOrdDetailPrice;

	@ManyToOne
	@JoinColumn(name = "act_id", referencedColumnName = "act_id")
	private ActivityHibernateVO actId;

	public TicketOrderDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOrderDetailVO(Integer ticOrdDetailId, TicketOrderVO ticketOrdId, Integer ticketOrdDetailQuantity,
			Double ticOrdDetailPrice, ActivityHibernateVO actId) {
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

	public TicketOrderVO getTicketOrdId() {
		return ticketOrdId;
	}

	public void setTicketOrdId(TicketOrderVO ticketOrdId) {
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

	public ActivityHibernateVO getActId() {
		return actId;
	}

	public void setActId(ActivityHibernateVO actId) {
		this.actId = actId;
	}

	@Override
	public String toString() {
		return "TicketOrderDetailVO [ticOrdDetailId=" + ticOrdDetailId + ", ticketOrdId=" + ticketOrdId
				+ ", ticketOrdDetailQuantity=" + ticketOrdDetailQuantity + ", ticOrdDetailPrice=" + ticOrdDetailPrice
				+ ", actId=" + actId + "]";
	}

}

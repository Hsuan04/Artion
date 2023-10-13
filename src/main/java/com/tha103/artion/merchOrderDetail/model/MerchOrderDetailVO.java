package com.tha103.artion.merchOrderDetail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tha103.artion.merch.model.MerchVO;
import com.tha103.artion.merchOrder.model.MerchOrderVO;

@Entity
@Table(name = "merchorderdetail")
// 配合 TestHQLWithParameter.java

public class MerchOrderDetailVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merchOrdDetail_id", updatable = false)
	private Integer merchOrdDetailId;

	@ManyToOne
	@JoinColumn(name = "merOrder_id", referencedColumnName = "merOrder_id")
	private MerchOrderVO merOrderId;

	@ManyToOne
	@JoinColumn(name = "merch_id", referencedColumnName = "merch_id")
	private MerchVO merchId;

	@Column(name = "merOrderDetail_quantity")
	private Integer merOrderDetailQuantity;

	@Column(name = "merOrderDetail_price")
	private Integer merOrderDetailPrice;

	public MerchOrderDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchOrderDetailVO(Integer merchOrdDetailId, MerchOrderVO merOrderId, MerchVO merchId,
			Integer merOrderDetailQuantity, Integer merOrderDetailPrice) {
		super();
		this.merchOrdDetailId = merchOrdDetailId;
		this.merOrderId = merOrderId;
		this.merchId = merchId;
		this.merOrderDetailQuantity = merOrderDetailQuantity;
		this.merOrderDetailPrice = merOrderDetailPrice;
	}

	public Integer getMerchOrdDetailId() {
		return merchOrdDetailId;
	}

	public void setMerchOrdDetailId(Integer merchOrdDetailId) {
		this.merchOrdDetailId = merchOrdDetailId;
	}

	public MerchOrderVO getMerOrderId() {
		return merOrderId;
	}

	public void setMerOrderId(MerchOrderVO merOrderId) {
		this.merOrderId = merOrderId;
	}

	public MerchVO getMerchId() {
		return merchId;
	}

	public void setMerchId(MerchVO merchId) {
		this.merchId = merchId;
	}

	public Integer getMerOrderDetailQuantity() {
		return merOrderDetailQuantity;
	}

	public void setMerOrderDetailQuantity(Integer merOrderDetailQuantity) {
		this.merOrderDetailQuantity = merOrderDetailQuantity;
	}

	public Integer getMerOrderDetailPrice() {
		return merOrderDetailPrice;
	}

	public void setMerOrderDetailPrice(Integer merOrderDetailPrice) {
		this.merOrderDetailPrice = merOrderDetailPrice;
	}

	@Override
	public String toString() {
		return "MerchOrderDetailVO [merchOrdDetailId=" + merchOrdDetailId + ", merOrderId=" + merOrderId + ", merchId="
				+ merchId + ", merOrderDetailQuantity=" + merOrderDetailQuantity + ", merOrderDetailPrice="
				+ merOrderDetailPrice + "]";
	}

}

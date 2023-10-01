package com.tha103.artion.merchorderdetail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchorderdetail")
// 配合 TestHQLWithParameter.java

public class MerchOrderDetailVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merchOrdDetail_id", updatable = false)
	private Integer merchOrdDetailId;

	@Column(name = "merOrder_id")
	private Integer merOrderId;

	@Column(name = "merch_id")
	private Integer merchId;

	@Column(name = "merOrderDetail_quantity")
	private Integer merOrderDetailQuantity;

	@Column(name = "merOrderDetail_price")
	private Integer merOrderDetailPrice;

	public MerchOrderDetailVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchOrderDetailVO(Integer merchOrdDetailId, Integer merOrderId, Integer merchId,
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

	public Integer getMerOrderId() {
		return merOrderId;
	}

	public void setMerOrderId(Integer merOrderId) {
		this.merOrderId = merOrderId;
	}

	public Integer getMerchId() {
		return merchId;
	}

	public void setMerchId(Integer merchId) {
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

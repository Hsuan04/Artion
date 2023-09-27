package com.tha103.artion.merchorder.model;

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

public class MerchOrderVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merOrder_id", updatable = false)
	private Integer merOrder_id;

	@Column(name = "mem_id")
	private Integer mem_id;

	@Column(name = "merOrder_actuallyAmount")
	private Double merOrder_actuallyAmount;

	@Column(name = "merOrder_time")
	private Timestamp merOrder_time;

	@Column(name = "merOrder_payStatus")
	private Integer merOrder_payStatus;

	@Column(name = "merOrder_status")
	private Integer merOrder_status;

	@Column(name = "merOrder_address")
	private String merOrder_address;

	@Column(name = "merOrder_code")
	private String merOrder_code;

	public MerchOrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchOrderVO(Integer merOrder_id, Integer mem_id, Double merOrder_actuallyAmount, Timestamp merOrder_time,
			Integer merOrder_payStatus, Integer merOrder_status, String merOrder_address, String merOrder_code) {
		super();
		this.merOrder_id = merOrder_id;
		this.mem_id = mem_id;
		this.merOrder_actuallyAmount = merOrder_actuallyAmount;
		this.merOrder_time = merOrder_time;
		this.merOrder_payStatus = merOrder_payStatus;
		this.merOrder_status = merOrder_status;
		this.merOrder_address = merOrder_address;
		this.merOrder_code = merOrder_code;
	}

	public Integer getMerOrder_id() {
		return merOrder_id;
	}

	public void setMerOrder_id(Integer merOrder_id) {
		this.merOrder_id = merOrder_id;
	}

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public Double getMerOrder_actuallyAmount() {
		return merOrder_actuallyAmount;
	}

	public void setMerOrder_actuallyAmount(Double merOrder_actuallyAmount) {
		this.merOrder_actuallyAmount = merOrder_actuallyAmount;
	}

	public Timestamp getMerOrder_time() {
		return merOrder_time;
	}

	public void setMerOrder_time(Timestamp merOrder_time) {
		this.merOrder_time = merOrder_time;
	}

	public Integer getMerOrder_payStatus() {
		return merOrder_payStatus;
	}

	public void setMerOrder_payStatus(Integer merOrder_payStatus) {
		this.merOrder_payStatus = merOrder_payStatus;
	}

	public Integer getMerOrder_status() {
		return merOrder_status;
	}

	public void setMerOrder_status(Integer merOrder_status) {
		this.merOrder_status = merOrder_status;
	}

	public String getMerOrder_address() {
		return merOrder_address;
	}

	public void setMerOrder_address(String merOrder_address) {
		this.merOrder_address = merOrder_address;
	}

	public String getMerOrder_code() {
		return merOrder_code;
	}

	public void setMerOrder_code(String merOrder_code) {
		this.merOrder_code = merOrder_code;
	}

	@Override
	public String toString() {
		return "MerchOrderVO [merOrder_id=" + merOrder_id + ", mem_id=" + mem_id + ", merOrder_actuallyAmount="
				+ merOrder_actuallyAmount + ", merOrder_time=" + merOrder_time + ", merOrder_payStatus="
				+ merOrder_payStatus + ", merOrder_status=" + merOrder_status + ", merOrder_address=" + merOrder_address
				+ ", merOrder_code=" + merOrder_code + "]";
	}

}

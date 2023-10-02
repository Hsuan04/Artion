package com.tha103.artion.merch.model;

import java.sql.Timestamp;
import java.util.Arrays;

import javax.persistence.*;


@Entity
@Table(name = "merch")
public class MerchVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "merch_id", updatable = false)
	private Integer merchId;
	
	@Column(name = "merch_picture1", columnDefinition = "longblob")
	private Byte[] merchPicture1;
	
	@Column(name = "merch_picture2", columnDefinition = "longblob")
	private Byte[] merchPicture2;
	
	@Column(name = "merch_picture3", columnDefinition = "longblob")
	private Byte[] merchPicture3;
	
	@Column(name = "merch_picture4", columnDefinition = "longblob")
	private Byte[] merchPicture4;
	
	@Column(name = "merch_name")
	private String merchName;
	
	@Column(name = "merch_total")
	private Integer merchTotal;
	
	@Column(name = "merch_price")
	private Integer merchPrice;
	
	@Column(name = "merch_sort")
	private Integer merchSort;
	
	@Column(name = "merch_startTime")
	private Timestamp merchStartTime;
	
	@Column(name = "merch_endTime")
	private Timestamp merchEndTime;
	
	@Column(name = "merch_introduction")
	private String merchIntroduction;
	
	@Column(name = "merch_sellAmount")
	private Integer merchSellAmount;
	
	@Column(name = "merch_status")
	private Integer merchStatus;
	
	public MerchVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MerchVO(Integer merch_id, Byte[] merch_picture1, Byte[] merch_picture2, Byte[] merch_picture3,
			Byte[] merch_picture4, String merch_name, Integer merch_total, Integer merch_price, Integer merch_sort,
			Timestamp merch_startTime, Timestamp merch_endTime, String merch_introduction, Integer merch_sellAmount,
			Integer merch_status) {
		super();
		this.merchId = merch_id;
		this.merchPicture1 = merch_picture1;
		this.merchPicture2 = merch_picture2;
		this.merchPicture3 = merch_picture3;
		this.merchPicture4 = merch_picture4;
		this.merchName = merch_name;
		this.merchTotal = merch_total;
		this.merchPrice = merch_price;
		this.merchSort = merch_sort;
		this.merchStartTime = merch_startTime;
		this.merchEndTime = merch_endTime;
		this.merchIntroduction = merch_introduction;
		this.merchSellAmount = merch_sellAmount;
		this.merchStatus = merch_status;
	}
	public Integer getMerch_id() {
		return merchId;
	}
	public void setMerch_id(Integer merch_id) {
		this.merchId = merch_id;
	}
	public Byte[] getMerch_picture1() {
		return merchPicture1;
	}
	public void setMerch_picture1(Byte[] merch_picture1) {
		this.merchPicture1 = merch_picture1;
	}
	public Byte[] getMerch_picture2() {
		return merchPicture2;
	}
	public void setMerch_picture2(Byte[] merch_picture2) {
		this.merchPicture2 = merch_picture2;
	}
	public Byte[] getMerch_picture3() {
		return merchPicture3;
	}
	public void setMerch_picture3(Byte[] merch_picture3) {
		this.merchPicture3 = merch_picture3;
	}
	public Byte[] getMerch_picture4() {
		return merchPicture4;
	}
	public void setMerch_picture4(Byte[] merch_picture4) {
		this.merchPicture4 = merch_picture4;
	}
	public String getMerch_name() {
		return merchName;
	}
	public void setMerch_name(String merch_name) {
		this.merchName = merch_name;
	}
	public Integer getMerch_total() {
		return merchTotal;
	}
	public void setMerch_total(Integer merch_total) {
		this.merchTotal = merch_total;
	}
	public Integer getMerch_price() {
		return merchPrice;
	}
	public void setMerch_price(Integer merch_price) {
		this.merchPrice = merch_price;
	}
	public Integer getMerch_sort() {
		return merchSort;
	}
	public void setMerch_sort(Integer merch_sort) {
		this.merchSort = merch_sort;
	}
	public Timestamp getMerch_startTime() {
		return merchStartTime;
	}
	public void setMerch_startTime(Timestamp merch_startTime) {
		this.merchStartTime = merch_startTime;
	}
	public Timestamp getMerch_endTime() {
		return merchEndTime;
	}
	public void setMerch_endTime(Timestamp merch_endTime) {
		this.merchEndTime = merch_endTime;
	}
	public String getMerch_introduction() {
		return merchIntroduction;
	}
	public void setMerch_introduction(String merch_introduction) {
		this.merchIntroduction = merch_introduction;
	}
	public Integer getMerch_sellAmount() {
		return merchSellAmount;
	}
	public void setMerch_sellAmount(Integer merch_sellAmount) {
		this.merchSellAmount = merch_sellAmount;
	}
	public Integer getMerch_status() {
		return merchStatus;
	}
	public void setMerch_status(Integer merch_status) {
		this.merchStatus = merch_status;
	}
	@Override
	public String toString() {
		return "MerchVO [merch_id=" + merchId + ", merch_picture1=" + Arrays.toString(merchPicture1)
				+ ", merch_picture2=" + Arrays.toString(merchPicture2) + ", merch_picture3="
				+ Arrays.toString(merchPicture3) + ", merch_picture4=" + Arrays.toString(merchPicture4)
				+ ", merch_name=" + merchName + ", merch_total=" + merchTotal + ", merch_price=" + merchPrice
				+ ", merch_sort=" + merchSort + ", merch_startTime=" + merchStartTime + ", merch_endTime="
				+ merchEndTime + ", merch_introduction=" + merchIntroduction + ", merch_sellAmount="
				+ merchSellAmount + ", merch_status=" + merchStatus + "]";
	}
	
	
}

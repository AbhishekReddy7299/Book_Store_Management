package com.obsm.cart.model;

public class Order {
	private long orderId;
	private String recipientName; //same as customer’s full name
	private long phoneNumber;	//: same as customer’s phone
	private String address;	//: same as customer’s address
	private String city;	//: same as customer’s city
	private String zipCode;	//: same as customer’s zip code
	private String country;	//: same as customer’s country
	private Status orderStatus = Status.PROCESSING;
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Status getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Order() {
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", recipientName=" + recipientName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
}

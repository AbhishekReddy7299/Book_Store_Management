package com.obsm.book.model;

public class CustomerCart {
	private long cartId;
	private long customerId;
	private long orderId;
	private long bookId;
	private long numberOfBooks;
	private double totalCost;
	private Status cartStatus = Status.NOT_ACCEPTED;
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public long getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(long numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Status getCartStatus() {
		return cartStatus;
	}
	public void setCartStatus(Status cartStatus) {
		this.cartStatus = cartStatus;
	}
	public CustomerCart() {
	}
	@Override
	public String toString() {
		return "CustomerCart [cartId=" + cartId + ", customerId=" + customerId + ", orderId=" + orderId + ", bookId="
				+ bookId + ", numberOfBooks=" + numberOfBooks + ", totalCost=" + totalCost + ", cartStatus="
				+ cartStatus + "]";
	}
}

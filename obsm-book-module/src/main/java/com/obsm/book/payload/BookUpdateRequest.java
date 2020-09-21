package com.obsm.book.payload;

public class BookUpdateRequest {
	private double price;
	private int rating;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookUpdateRequest() {
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "BookUpdateRequest [price=" + price + ", rating=" + rating + "]";
	}

	
	
}

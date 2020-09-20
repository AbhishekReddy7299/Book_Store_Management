package com.obsm.admin.model;

import java.time.LocalDate;

public class Book {	
	private long bookId;
	private String title;
	private String author;
	private String description;
	private int rating;
	private double price;
	private long catogeryId;
	private LocalDate publishDate;
	private String image;
	private boolean isSold = false; 
	
	public boolean isSold() {
		return isSold;
	}
	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getCatogeryId() {
		return catogeryId;
	}
	public void setCatogeryId(long catogeryId) {
		this.catogeryId = catogeryId;
	}
	public Book() {
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", rating=" + rating + ", price=" + price + ", catogeryId=" + catogeryId + ", publishDate="
				+ publishDate + ", image=" + image + "]";
	}
	
}

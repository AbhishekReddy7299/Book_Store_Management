package com.obsm.book.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name="book_data")
public class Book {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookId;
	
	@Column(name="title")
	@NotNull
	private String title;
	
	@Column(name="author")
	@NotNull
	private String author;
	
	@Column(name="description")
	@NotNull
	private String description;
	
	@Column(name="rating")
    @NotNull
	private int rating;
	
	@Column(name="price")
	@NotNull
	private double price;
	
	@Column(name="cath_id")
	@NotNull
	private long catogeryId;
	
	@Column(name="publish_date")
	@NotNull
	private LocalDate publishDate;
	
	@Column(name="image")
	private String image;
	
	public Book() {
	
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

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", rating=" + rating + ", price=" + price + ", catogeryId=" + catogeryId + ", publishDate="
				+ publishDate + ", image=" + image + "]";
	}
		
}

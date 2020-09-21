package com.obsm.review.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="review_data")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long reviewId;
	@Column(name="rating_column")
	@NotNull
	private int rating;
	@Column(name="headline_column")
	@NotNull
	private String headline;
	@Column(name="comment_column")
	@NotNull
	private String comment;
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Review() {
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", rating=" + rating + ", headline=" + headline + ", comment=" + comment
				+ "]";
	}
}

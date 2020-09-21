package com.obsm.review.payload;

public class ReviewUpdateRequest {
	private int rating;
	private String headline;
	private String comment;
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
	@Override
	public String toString() {
		return "ReviewUpdateRequest [rating=" + rating + ", headline=" + headline + ", comment=" + comment + "]";
	}

}

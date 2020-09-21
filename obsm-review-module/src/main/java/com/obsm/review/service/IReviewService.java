package com.obsm.review.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obsm.review.exception.ReviewNotFound;
import com.obsm.review.model.Review;
import com.obsm.review.payload.ReviewUpdateRequest;
public interface IReviewService {
	public ResponseEntity<Review> addReview(Review review);
	public ResponseEntity deleteReview(long reviewId) throws ReviewNotFound;
	public ResponseEntity<Review> updateReview(ReviewUpdateRequest reviewUpdateRequest, long reviewId) throws ReviewNotFound;
	public ResponseEntity<Review> getReview(long reviewId) throws ReviewNotFound;
	public ResponseEntity<List<Review>> getAllReviews();


}

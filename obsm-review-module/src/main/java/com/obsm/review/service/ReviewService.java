package com.obsm.review.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.obsm.review.utils.Helper;
import com.obsm.review.exception.ReviewNotFound;
import com.obsm.review.model.Review;
import com.obsm.review.payload.ReviewUpdateRequest;
import com.obsm.review.repository.ReviewRepository;

@Service
@Transactional

public class ReviewService implements IReviewService{
	@Autowired
    ReviewRepository reviewRepository;
	
	@Override
	public ResponseEntity<Review> addReview(Review review) {
		try {
			if (review != null) {
				return new ResponseEntity<>(reviewRepository.save(review), HttpStatus.CREATED);
			} else throw new ReviewNotFound("Not a valid request");
		}catch(ReviewNotFound reviewNotFound){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity deleteReview(long reviewId) throws ReviewNotFound {
		try {
			Review deletedReview = reviewRepository.getOne(reviewId);
			if (reviewRepository.existsById(reviewId)) {
				reviewRepository.delete(deletedReview);
				return new ResponseEntity(HttpStatus.OK);
			} else throw new ReviewNotFound("Review is Null");
		}catch (ReviewNotFound reviewNotFound){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}

	}

	@Override
	public ResponseEntity<Review> updateReview(ReviewUpdateRequest reviewUpdateRequest, long reviewId)throws ReviewNotFound {
		try {
			Review updatedReview = reviewRepository.getOne(reviewId);
			if (!reviewRepository.existsById(reviewId)) {
				throw new ReviewNotFound("Review doesn't exists!");
			}
			Helper.copyReviewDetails(updatedReview, reviewUpdateRequest);
			return new ResponseEntity<>(reviewRepository.save(updatedReview),HttpStatus.ACCEPTED);
		}catch(ReviewNotFound reviewNotFound){
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Review> getReview(long reviewId) throws ReviewNotFound {
		try {
			Review review = reviewRepository.getOne(reviewId);
			if(reviewRepository.existsById(reviewId))
				return new ResponseEntity<>(review, HttpStatus.FOUND);
			else throw new ReviewNotFound("No Review is available");
		}catch (ReviewNotFound reviewNotFound){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	
	}

	@Override
	public ResponseEntity<List<Review>> getAllReviews() {
		return new ResponseEntity(reviewRepository.findAll(),HttpStatus.FOUND);
	}

}

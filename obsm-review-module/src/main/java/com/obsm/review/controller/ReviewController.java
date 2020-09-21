package com.obsm.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.obsm.review.exception.ReviewNotFound;
import com.obsm.review.model.Review;
import com.obsm.review.payload.ReviewUpdateRequest;
import com.obsm.review.service.IReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	@Autowired
	IReviewService service;
	
	@PostMapping("/addReview")
	public ResponseEntity<Review> addReview(@RequestBody Review review){
		return (service.addReview(review));
	}

	@DeleteMapping("/deleteReview/{reviewId}")
	public ResponseEntity deleteReview(@PathVariable long reviewId) throws ReviewNotFound {
		return service.deleteReview(reviewId);
	}

	@PutMapping("/updateReview/{reviewId}")
	public ResponseEntity<Review> updateReview(@RequestBody ReviewUpdateRequest reviewUpdateRequest, @PathVariable long reviewId) throws ReviewNotFound {
		return service.updateReview(reviewUpdateRequest, reviewId);
	}

	@GetMapping("getReview/{reviewId}")
	public ResponseEntity<Review> getReview(@PathVariable long reviewId) throws ReviewNotFound  {
		return service.getReview(reviewId);
	}

	@GetMapping("/getAllReviews")
	public ResponseEntity<List<Review>> getAllReviews() {
		return service.getAllReviews();
	}
}



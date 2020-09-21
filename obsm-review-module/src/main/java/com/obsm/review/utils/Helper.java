package com.obsm.review.utils;

import com.obsm.review.model.Review;
import com.obsm.review.payload.ReviewUpdateRequest;

public class Helper {
	public static void copyReviewDetails(Review review, ReviewUpdateRequest reviewRequest) {
		if (reviewRequest.getRating() != 0)
            review.setRating(reviewRequest.getRating());
        if (reviewRequest.getHeadline() != null)
            review.setHeadline(reviewRequest.getHeadline());
        if (reviewRequest.getComment() != null)
            review.setComment(reviewRequest.getComment());
	}
}

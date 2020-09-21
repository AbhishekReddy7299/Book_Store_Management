package com.obsm.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obsm.review.model.Review;

	@Repository
	public interface ReviewRepository extends JpaRepository<Review, Long>{

	}


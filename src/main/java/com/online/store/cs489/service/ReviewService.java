package com.online.store.cs489.service;

import com.online.store.cs489.domain.Review;
import com.online.store.cs489.dto.Response;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews();

    Response approveReview(Long reviewId);

    Review getReviewById(Long rid);
}

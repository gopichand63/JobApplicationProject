package JobProject.JobProjectDemo.review.service;

import JobProject.JobProjectDemo.review.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    void addReview(Long companyId, Review review);

    boolean updateReview(Long companyId, Long reviewId, Review review);

    boolean deleteReview(Long companyId, Long reviewId);

}

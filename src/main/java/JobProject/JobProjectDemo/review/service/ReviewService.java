package JobProject.JobProjectDemo.review.service;

import JobProject.JobProjectDemo.review.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

}

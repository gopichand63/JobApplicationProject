package JobProject.JobProjectDemo.review.controller;


import JobProject.JobProjectDemo.review.model.Review;
import JobProject.JobProjectDemo.review.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId) {
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long companyId,
                                            @RequestBody Review review) {
        reviewService.addReview(companyId, review);
        return new ResponseEntity<>("Review Added Successfully", HttpStatus.OK);
    }

    @PutMapping("reviews/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId,
                                               @PathVariable Long reviewId,
                                               @RequestBody Review review) {
        boolean isReviewUpdated = reviewService.updateReview(companyId, reviewId, review);
        if (isReviewUpdated) {
            return new ResponseEntity<>("Review Updated Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Review Not Updated Successfully", HttpStatus.NOT_FOUND);
        }
    }
}

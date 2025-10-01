package JobProject.JobProjectDemo.review.repository;

import JobProject.JobProjectDemo.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

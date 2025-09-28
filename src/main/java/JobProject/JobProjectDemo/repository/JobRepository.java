package JobProject.JobProjectDemo.repository;


import JobProject.JobProjectDemo.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // You get CRUD methods automatically:
    // save(), findAll(), findById(), deleteById(), etc.
}

package JobProject.JobProjectDemo.company.repository;

import JobProject.JobProjectDemo.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}

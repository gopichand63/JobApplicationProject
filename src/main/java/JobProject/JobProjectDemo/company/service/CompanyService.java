package JobProject.JobProjectDemo.company.service;

import JobProject.JobProjectDemo.company.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);
}

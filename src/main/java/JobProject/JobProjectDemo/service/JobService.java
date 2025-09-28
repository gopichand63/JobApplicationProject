package JobProject.JobProjectDemo.service;

import JobProject.JobProjectDemo.model.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();

    Job createJob(Job job);

    Job getJobById(Long id);

    void deleteJobById(Long id);

    boolean updatedJob(Long id, Job updatedJob);
}

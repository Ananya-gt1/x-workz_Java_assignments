package com.xworkz.weather.service;

import com.xworkz.weather.dto.JobDTO;
import com.xworkz.weather.repository.JobRepository;
import com.xworkz.weather.repository.JobRepositoryImpl;

public class JobServiceImpl implements JobService{

    @Override
    public String jobValidate(JobDTO dto) {

        JobRepository jobRepository=new JobRepositoryImpl();
        jobRepository.save(dto);
        return "failed";
    }

}

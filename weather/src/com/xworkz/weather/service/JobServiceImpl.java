package com.xworkz.weather.service;

import com.xworkz.weather.dto.JobDTO;
import com.xworkz.weather.repository.JobRepository;
import com.xworkz.weather.repository.JobRepositoryImpl;

public class JobServiceImpl implements JobService{

    @Override
    public String jobValidate(JobDTO jobDTO) {

        JobRepository jobRepository=new JobRepositoryImpl();
        if(jobDTO.getName()==null || jobDTO.getName().length()<4 ||jobDTO.getName().length()>30)
        {
            return "Entered invalid name";
        }

        jobRepository.save(jobDTO);
        return "The form submitted successfully";
    }

}

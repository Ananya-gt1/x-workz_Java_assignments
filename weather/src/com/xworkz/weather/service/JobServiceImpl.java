package com.xworkz.weather.service;

import com.xworkz.weather.dto.JobDTO;

public class JobServiceImpl implements JobService{

    @Override
    public String jobValidate(JobDTO dto) {
        return "failed";
    }

}

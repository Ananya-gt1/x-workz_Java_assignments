package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.dto.JobDTO;
import com.xworkz.weather.service.JobService;
import com.xworkz.weather.service.JobServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/job",loadOnStartup = 5)
public class JobServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String education=req.getParameter("education");
        String skills=req.getParameter("skills");
        String expectedSalary=req.getParameter("expectedSalary");
        String experience=req.getParameter("experience");

        JobDTO dto=new JobDTO(name,email,education,skills,expectedSalary,experience);
        System.out.println("Birth Certificate"+dto);

        JobService jobService=new JobServiceImpl();
        jobService.jobValidate(dto);
    }
}

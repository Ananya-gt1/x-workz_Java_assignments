package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.dto.JobDTO;
import com.xworkz.weather.service.JobService;
import com.xworkz.weather.service.JobServiceImpl;

import javax.servlet.*;
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
        int expectedSalary=Integer.parseInt(req.getParameter("expectedSalary"));
        String experience=req.getParameter("experience");

        JobDTO jobDTO=new JobDTO(name,email,education,skills,expectedSalary,experience);
        System.out.println("Job Application"+jobDTO);

        JobService jobService=new JobServiceImpl();
        String result=jobService.jobValidate(jobDTO);

        //servlet chaining
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("JobApplication.jsp");
        req.setAttribute("message",result);

        if(!result.equals("The form submitted successfully"))
        {
            req.setAttribute("jobDTO",jobDTO);
        }
        requestDispatcher.forward(req,resp);
    }
}

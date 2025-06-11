package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.dto.DeathDTO;
import com.xworkz.weather.service.DeathService;
import com.xworkz.weather.service.DeathServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/death",loadOnStartup = 2)
public class DeathServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String cause=req.getParameter("cause");
        String date=req.getParameter("date");
        String time=req.getParameter("time");
        String ageAtDeath=req.getParameter("ageAtDeath");
        String certifiedBy=req.getParameter("certifiedBy");
        String hospitalName=req.getParameter("hospitalName");
        String mannerOfDeath=req.getParameter("mannerOfDeath");
        String gender=req.getParameter("gender");
        String marks=req.getParameter("marks");

        DeathDTO dto=new DeathDTO(name,cause,date,time,ageAtDeath,certifiedBy,hospitalName,mannerOfDeath,gender,marks);
        System.out.println("Death Certificate"+dto);

        DeathService deathService=new DeathServiceImpl();
        deathService.deathValidate(dto);
    }
}

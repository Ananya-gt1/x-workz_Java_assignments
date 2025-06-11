package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.service.BirthService;
import com.xworkz.weather.service.BirthServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/birth",loadOnStartup = 1)
public class BirthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String birthName=req.getParameter("birthName");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        String doctorName=req.getParameter("doctorName");
        String nurseName=req.getParameter("nurseName");
        String hospitalName=req.getParameter("hospitalName");
        String hospitalType=req.getParameter("hospitalType");

        BirthDTO dto=new BirthDTO(birthName,fatherName,motherName,doctorName,nurseName,hospitalName,hospitalType);
        System.out.println("Birth Certificate"+dto);

        BirthService birthService=new BirthServiceImpl();
        birthService.birthValidate(dto);
    }
}

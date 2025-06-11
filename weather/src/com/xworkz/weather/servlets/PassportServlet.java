package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.dto.PassportDTO;
import com.xworkz.weather.service.PassportService;
import com.xworkz.weather.service.PassportServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport",loadOnStartup = 6)
public class PassportServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String adharNo=req.getParameter("adharNo");
        String address=req.getParameter("address");
        String panNo=req.getParameter("panNo");
        String state=req.getParameter("state");
        String city=req.getParameter("city");
        String pincode=req.getParameter("pincode");
        String passportType=req.getParameter("passportType");
        String payment=req.getParameter("payment");

        PassportDTO dto=new PassportDTO(name,adharNo,address,panNo,state,city,pincode,passportType,payment);
        System.out.println("Birth Certificate"+dto);

        PassportService passportService=new PassportServiceImpl();
        passportService.passportValidate(dto);

    }
}

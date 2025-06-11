package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.dto.MarriageDTO;
import com.xworkz.weather.service.MarriageService;
import com.xworkz.weather.service.MarriageServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/marriage",loadOnStartup = 4)
public class MarriageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        String date = req.getParameter("date");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");
        String officerPresent = req.getParameter("officerPresent");

        MarriageDTO dto = new MarriageDTO(groomName, brideName, location, address, religion, date, witness1,witness2,officerPresent);
        System.out.println("Birth Certificate" + dto);

        MarriageService marriageService=new MarriageServiceImpl();
        marriageService.marriageValidate(dto);
    }
}

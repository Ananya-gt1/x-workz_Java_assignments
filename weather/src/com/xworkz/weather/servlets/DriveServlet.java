package com.xworkz.weather.servlets;

import com.xworkz.weather.dto.BirthDTO;
import com.xworkz.weather.dto.DriveDTO;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/drive",loadOnStartup = 3)
public class DriveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String address=req.getParameter("address");
        String mobileNo=req.getParameter("mobileNo");
        String appliedDate=req.getParameter("appliedDate");
        String vehicleType=req.getParameter("vehicleType");

        DriveDTO DTO=new DriveDTO(name,address,mobileNo,appliedDate,vehicleType);
        System.out.println("Driving License Certificate"+DTO);
    }
}

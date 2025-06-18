package com.xworkz.ananya.servlet;

import com.xworkz.ananya.dto.RgisterDTO;
import com.xworkz.ananya.service.RegisterService;
import com.xworkz.ananya.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/register")
public class ResigsterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nameName=req.getParameter("nameName");
        double moblieNoName=Double.parseDouble(req.getParameter("moblieNoName"));
        String emailName=req.getParameter("emailName");
        String passwordName=req.getParameter("passwordName");

//        RequestDispatcher requestDispatcher= req.getRequestDispatcher("registeration.jsp");
//        requestDispatcher.forward(req,resp);

        System.out.println("User Name:"+nameName);
        System.out.println("Mobile No:"+moblieNoName);
        System.out.println("Email:"+emailName);
        System.out.println("Password:"+passwordName);

        RgisterDTO dto=new RgisterDTO(nameName,moblieNoName,emailName,passwordName);

        RegisterService registerService=new RegisterServiceImpl();
        registerService.registerValidate(dto);
    }
}

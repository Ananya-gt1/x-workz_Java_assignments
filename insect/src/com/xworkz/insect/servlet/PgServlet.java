package com.xworkz.insect.servlet;

import com.xworkz.insect.dto.PgDTO;
import com.xworkz.insect.service.PgService;
import com.xworkz.insect.service.PgServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/pg",loadOnStartup = 1)
public class PgServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nameName=req.getParameter("nameName");
        String occupationName=req.getParameter("occupationName");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        String dateOfBirthName=req.getParameter("dateOfBirthName");
        String addressName=req.getParameter("addressName");
        String checkBoxName=req.getParameter("checkBoxName");

        PgDTO dto=new PgDTO(nameName,occupationName,fatherName,motherName,dateOfBirthName,addressName,checkBoxName);
        System.out.println("PG Form:"+dto);

        PgService pgService=new PgServiceImpl();
        pgService.pgValidate(dto);
    }

}

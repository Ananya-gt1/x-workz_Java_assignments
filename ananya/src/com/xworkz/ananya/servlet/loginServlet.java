package com.xworkz.ananya.servlet;

import com.xworkz.ananya.dto.LoginDTO;
import com.xworkz.ananya.service.LoginService;
import com.xworkz.ananya.service.LoginServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/login")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nameName = req.getParameter("nameName");
        String passwordName = req.getParameter("passwordName");

        System.out.println("User Name:" + nameName);
        System.out.println("Password:" + passwordName);

        LoginDTO dto = new LoginDTO(nameName, passwordName);

        LoginService loginService = new LoginServiceImpl();
        loginService.loginValidate(dto);
    }
}
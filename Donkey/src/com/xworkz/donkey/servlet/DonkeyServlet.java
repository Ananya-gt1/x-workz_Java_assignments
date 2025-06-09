package com.xworkz.donkey.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/contact",loadOnStartup = 1)

public class DonkeyServlet extends GenericServlet {

    public DonkeyServlet(){
        System.out.println("The object is created...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Overriding Service method....");
    }

}

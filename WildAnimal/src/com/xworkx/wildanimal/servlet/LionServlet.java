package com.xworkx.wildanimal.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/king",loadOnStartup = 1)
public class LionServlet extends GenericServlet {

    public LionServlet(){
        System.out.println("Running Lion Servlet.......");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Overriding Service method....");
    }
}

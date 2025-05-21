package com.xworkz.form.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actor",loadOnStartup = 1)

public class ActorServlet extends GenericServlet {

    public ActorServlet(){
        System.out.println("The Actor Servlet....");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Overriding Service method....");

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>");
        writer.println("Succesfully Completed");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}

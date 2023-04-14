package br.edu.utfpr.control_os.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "homeServlet", value = "/hello-servlet")
public class HomeController extends HttpServlet {
    private String message;


    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Hello

        request.setAttribute("message", message);
        request.getRequestDispatcher("/index.jsp"). forward(request, response);
    }

    public void destroy() {
    }
}
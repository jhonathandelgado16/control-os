package br.edu.utfpr.controlos.controller;

import br.edu.utfpr.control_os.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddOsServlet", value = "/adicionar-os")
public class AddOsController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String service = request.getParameter("service");
        String description = request.getParameter("description");
        String date_service = request.getParameter("date_service");
        String days_guarantee = request.getParameter("days_guarantee");
        String client = request.getParameter("client");

        if(service == null && description == null && date_service == null && days_guarantee == null && client == null){
            request.getRequestDispatcher("/WEB-INF/view/add-os.jsp").forward(request, response);
        } else {
            request.setAttribute("flash.service", service);
            response.sendRedirect("visualizar-os");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String service = request.getParameter("service");
        String description = request.getParameter("description");
        String date_service = request.getParameter("date_service");
        String days_guarantee = request.getParameter("days_guarantee");
        String client = request.getParameter("client");

        if(service == null && description == null && date_service == null && days_guarantee == null && client == null){
            request.getRequestDispatcher("/WEB-INF/view/add-os.jsp").forward(request, response);
        } else {

            Integer counterOS = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_OS);
            if(counterOS == null){
                counterOS = 0;
            }
            counterOS++;
            getServletContext().setAttribute(Constants.COUNTER_OS, counterOS);

            request.setAttribute("flash.service", service);
            request.getRequestDispatcher("/visualizar-os").forward(request, response);
        }
    }

    public void destroy() {
    }
}
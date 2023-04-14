package br.edu.utfpr.control_os.controller;

import br.edu.utfpr.control_os.model.domain.ServiceOrder;
import br.edu.utfpr.control_os.service.ServiceOrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowOsServlet", value = "/listar-os")
public class ShowOsController extends HttpServlet {

    ServiceOrderService osService = new ServiceOrderService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        boolean alert = false;

        if(request.getAttribute("os") != null){
            alert = true;
        }

        List<ServiceOrder> osDTOs = osService.findAll();

        System.out.println(osDTOs);

        request.setAttribute("alert", alert);
        request.setAttribute("oss", osDTOs);

        request.getRequestDispatcher("/WEB-INF/view/list-os.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/list-os.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
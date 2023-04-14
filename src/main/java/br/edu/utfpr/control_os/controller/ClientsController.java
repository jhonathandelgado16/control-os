package br.edu.utfpr.control_os.controller;

import br.edu.utfpr.control_os.model.domain.Client;
import br.edu.utfpr.control_os.model.domain.ServiceOrder;
import br.edu.utfpr.control_os.model.dto.ServiceOrderDTO;
import br.edu.utfpr.control_os.model.mapper.ServiceOrderMapper;
import br.edu.utfpr.control_os.service.ClientService;
import br.edu.utfpr.control_os.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClientsServlet", value = "/clientes")
public class ClientsController extends HttpServlet {

    ClientService clientService = new ClientService();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<Client> clients = clientService.findAll();

        request.setAttribute("clients", clients);

        request.getRequestDispatcher("/WEB-INF/view/clients.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String contact = request.getParameter("contact");

        Client client = new Client(name, contact);

        //persiste no banco de dados
        clientService.save(client);

        //cria o DTO para encaminhar para a visão
        List<Client> clients = clientService.findAll();

        request.setAttribute("clients", clients);

        response.sendRedirect("clientes");
    }

    public void destroy() {
    }
}
package br.edu.utfpr.control_os.controller;

import br.edu.utfpr.control_os.model.domain.Client;
import br.edu.utfpr.control_os.model.domain.ServiceOrder;
import br.edu.utfpr.control_os.model.dto.ClientDTO;
import br.edu.utfpr.control_os.model.dto.ServiceOrderDTO;
import br.edu.utfpr.control_os.model.mapper.ServiceOrderMapper;
import br.edu.utfpr.control_os.service.ClientService;
import br.edu.utfpr.control_os.service.ServiceOrderService;
import br.edu.utfpr.control_os.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddOsServlet", value = "/adicionar-os")
public class AddOsController extends HttpServlet {

    ClientService clientService = new ClientService();
    ServiceOrderService osService = new ServiceOrderService();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Client> clients = clientService.findAll();

        request.setAttribute("clients", clients);

        request.getRequestDispatcher("/WEB-INF/view/add-os.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String service = request.getParameter("service");
        String description = request.getParameter("description");
        String dateService = request.getParameter("date_service");
        String daysGuarantee = request.getParameter("days_guarantee");
        String idClient = request.getParameter("id_client");
        Long idClientLong = Long.parseLong(idClient);
        int daysInt = Integer.parseInt(daysGuarantee);



            Integer counterOS = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_OS);
            if(counterOS == null){
                counterOS = 0;
            }
            counterOS++;
            getServletContext().setAttribute(Constants.COUNTER_OS, counterOS);

            ServiceOrder os = new ServiceOrder(service, description, dateService, daysInt, idClientLong);

            //persiste no banco de dados
            osService.save(os);

            //cria o DTO para encaminhar para a visão
            ServiceOrderDTO osDTO = ServiceOrderMapper.toDTO(os);

            //guarda os dados no escopo de flash, pois será feito um redirecionamento no servlet seguinte
            request.setAttribute("flash.os", osDTO);

            request.setAttribute("flash.service", service);

            response.sendRedirect("listar-os");
    }

    public void destroy() {
    }
}
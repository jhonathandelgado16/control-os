package br.edu.utfpr.control_os.service;

import br.edu.utfpr.control_os.model.dao.ServiceOrderDAO;
import br.edu.utfpr.control_os.model.domain.ServiceOrder;
import br.edu.utfpr.control_os.model.dao.ClientDAO;
import br.edu.utfpr.control_os.model.domain.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ServiceOrderService extends AbstractService<Long, ServiceOrder>{

    public ServiceOrderService() {
        dao = new ServiceOrderDAO();
    }

    public String getNameClient(Long idClient){

        ClientService clientService = new ClientService();

        Client client = clientService.getById(idClient);

        return client.getName();
    }
    public String calculateDateEndGuarantee(String date, int days) throws ParseException {
        String strDate = date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(strDate));
        cal.add(Calendar.DAY_OF_MONTH, days);

        return sdf.format(cal.getTime());
    }
}

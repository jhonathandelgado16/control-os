package br.edu.utfpr.control_os.service;

import br.edu.utfpr.control_os.model.dao.ClientDAO;
import br.edu.utfpr.control_os.model.domain.Client;

public class ClientService extends AbstractService<Long, Client>{

    public ClientService() {
        dao = new ClientDAO();
    }
}

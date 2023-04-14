package br.edu.utfpr.control_os.model.mapper;

import br.edu.utfpr.control_os.model.domain.Client;
import br.edu.utfpr.control_os.model.dto.ClientDTO;


public class ClientMapper {

    public ClientMapper getInstance(){
        return new ClientMapper();
    }

    public static Client toEntity(ClientDTO dto){

        Client entity = new Client(dto.getName(), dto.getContact());
        return entity;
    }

    public static ClientDTO toDTO(Client entity){
        ClientDTO dto = new ClientDTO(entity.getName(), entity.getContact());
        return dto;
    }
}

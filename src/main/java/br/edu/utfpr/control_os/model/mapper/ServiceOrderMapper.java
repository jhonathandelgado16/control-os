package br.edu.utfpr.control_os.model.mapper;

import br.edu.utfpr.control_os.model.domain.Client;
import br.edu.utfpr.control_os.model.domain.ServiceOrder;
import br.edu.utfpr.control_os.model.dto.ClientDTO;
import br.edu.utfpr.control_os.model.dto.ServiceOrderDTO;

public class ServiceOrderMapper {

    public static ServiceOrder toEntity(ServiceOrderDTO dto){
        ServiceOrder entity = new ServiceOrder(dto.getId_service_order(), dto.getService(), dto.getDescription(), dto.getDate_service(), dto.getDays_guarantee(), dto.getId_client());
        return entity;
    }

    public static ServiceOrderDTO toDTO(ServiceOrder entity){
        ServiceOrderDTO dto = new ServiceOrderDTO(entity.getId_service_order(), entity.getService(), entity.getDescription(), entity.getDate_service(), entity.getDays_guarantee(), entity.getId_client());
        return dto;
    }
}

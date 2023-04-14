package br.edu.utfpr.control_os.model.dto;

import br.edu.utfpr.control_os.model.domain.Client;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.ManyToOne;

@Data
public class ServiceOrderDTO {

    @NonNull
    private Long id_service_order;
    @NonNull
    private String service;
    @NonNull
    private String description;
    @NonNull
    private String date_service;
    @NonNull
    private int days_guarantee;
    @NonNull
    private Long id_client;
}

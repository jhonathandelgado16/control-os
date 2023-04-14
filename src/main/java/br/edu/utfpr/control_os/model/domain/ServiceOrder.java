package br.edu.utfpr.control_os.model.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_service_order")
@Data(staticConstructor = "of")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class ServiceOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public ServiceOrder(Long idServiceOrder, String service, String description, String dateService, int daysGuarantee, Long idClient) {
    }
}
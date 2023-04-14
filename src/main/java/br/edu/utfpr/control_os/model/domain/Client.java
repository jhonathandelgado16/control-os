package br.edu.utfpr.control_os.model.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_client")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;

    @NonNull
    private String name;

    @NonNull
    private String contact;
}

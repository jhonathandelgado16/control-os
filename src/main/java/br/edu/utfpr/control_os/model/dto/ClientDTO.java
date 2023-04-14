package br.edu.utfpr.control_os.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class ClientDTO {
    @NonNull
    private String name;
    @NonNull
    private String contact;
}

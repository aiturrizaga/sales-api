package pe.edu.vallegrande.sales.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class LoginDTO {
    @NotNull
    @Size(max = 50)
    @Email
    @NotEmpty
    private String email;

    @NotNull
    @Size(max = 50)
    @NotEmpty
    private String password;
}
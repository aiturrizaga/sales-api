package pe.edu.vallegrande.sales.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
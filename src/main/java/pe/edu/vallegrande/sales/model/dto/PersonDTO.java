package pe.edu.vallegrande.sales.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString
@Builder
public class PersonDTO {
    private UUID id;

    @NotNull
    @Size(max = 50)
    private String name;

    @NotNull
    @Size(max = 50)
    private String lastname;

    @Size(max = 100)
    private String adress;

    @Size(max = 20)
    private String phone;

    private LocalDate birthdate;

    @NotNull
    @Size(max = 50)
    private String email;

    private boolean active;

    private Set<RoleDTO> roles;
}
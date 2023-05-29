package pe.edu.vallegrande.sales.model.dto;

import javax.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class RoleDTO {
    @Size(max = 30)
    String id;
}

package pe.edu.vallegrande.sales.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rol")
public class Role {
    @Id
    @Size(max = 30)
    @Column(name = "id", nullable = false, length = 30)
    private String id;

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Size(max = 100)
    @Column(name = "description", length = 100)
    private String description;

    @NotNull
    @Column(name = "active", nullable = false)
    private Boolean active = false;

}
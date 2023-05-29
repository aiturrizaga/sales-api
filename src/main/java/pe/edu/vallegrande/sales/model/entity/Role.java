package pe.edu.vallegrande.sales.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
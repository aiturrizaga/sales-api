package pe.edu.vallegrande.sales.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Size(max = 100)
    @Column(name = "description", length = 100)
    private String description;

    @NotNull
    @Column(name = "sale_price", nullable = false)
    private BigDecimal salePrice;

    @Size(max = 50)
    @Column(name = "categoy", length = 50)
    private String categoy;

    @Column(name = "active", nullable = false)
    private boolean active = true;

}
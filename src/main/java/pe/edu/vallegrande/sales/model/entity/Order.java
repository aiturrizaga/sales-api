package pe.edu.vallegrande.sales.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "order")
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @Column(name = "date_order", nullable = false)
    private Instant dateOrder;

    @NotNull
    @Column(name = "amount_total", nullable = false)
    private BigDecimal amountTotal;

    @Size(max = 20)
    @NotNull
    @Column(name = "state", nullable = false, length = 20)
    private String state;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Person customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "seller_id", nullable = false)
    private Person seller;

    @Size(max = 20)
    @NotNull
    @Column(name = "pay_method", nullable = false, length = 20)
    private String payMethod;

}
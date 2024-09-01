package org.orderinventory.orderinventory;

import jakarta.persistence.*;
@Table(name = "inventar")
@Entity
public class Inventar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "magazina_id")
    private Magazina magazina;

    @ManyToOne
    @JoinColumn(name = "produkti_id")
    private Produkt produkt;

    private int sasia;


}


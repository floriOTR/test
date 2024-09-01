package org.orderinventory.orderinventory;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transaksion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    private double shuma;

    @ManyToOne
    @JoinColumn(name = "banka_id")
    private Banka banka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getShuma() {
        return shuma;
    }

    public void setShuma(double shuma) {
        this.shuma = shuma;
    }

    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }
}



package org.orderinventory.orderinventory;

import jakarta.persistence.*;

@Table(name = "")
@Entity
public class Magazina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vendodhja;
    private String pronari;
    private String numriTelefonit;
    private String banka;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendodhja() {
        return vendodhja;
    }

    public void setVendodhja(String vendodhja) {
        this.vendodhja = vendodhja;
    }

    public String getPronari() {
        return pronari;
    }

    public void setPronari(String pronari) {
        this.pronari = pronari;
    }

    public String getNumriTelefonit() {
        return numriTelefonit;
    }

    public void setNumriTelefonit(String numriTelefonit) {
        this.numriTelefonit = numriTelefonit;
    }

    public String getBanka() {
        return banka;
    }

    public void setBanka(String banka) {
        this.banka = banka;
    }
}


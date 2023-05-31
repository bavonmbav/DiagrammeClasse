package com.systeme.gestion.entity;

import java.math.BigDecimal;

public class OpportuniteDTO {
    private String titre;
    private String description;
    private BigDecimal montant;

    public OpportuniteDTO(String titre, String description, BigDecimal montant) {
        this.titre = titre;
        this.description = description;
        this.montant = montant;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}

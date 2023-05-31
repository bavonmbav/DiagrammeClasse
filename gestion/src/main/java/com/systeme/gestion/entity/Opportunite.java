package com.systeme.gestion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Opportunite {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long membreId;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;
    private String titre;
    private String description;
    private BigDecimal montant;
    @Enumerated(EnumType.STRING)
    private EtapeProgression etapeProgression;
    @Enumerated(EnumType.STRING)
    private EtatOpportunite etat;
}

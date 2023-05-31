package com.systeme.gestion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    Long id;
    String  name ;
    String  stage;
    DecimalFormat amount;
    Date closingDate;
    @ManyToOne
    private Contact contact;
}

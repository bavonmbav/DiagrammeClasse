package com.systeme.gestion.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointement {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Date atdate ;
    String notes;
    @ManyToOne
    private Contact contact;
}

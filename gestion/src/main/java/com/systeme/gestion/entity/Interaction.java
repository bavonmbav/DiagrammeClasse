package com.systeme.gestion.entity;

import com.systeme.gestion.implement.Document;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Interaction {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String  type ;
    Date date ;
    String  description;
    String  notes;
    
    @ManyToOne
    private Contact contact;

    public void setDocument(Document document) {
    }
}

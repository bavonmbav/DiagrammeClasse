package com.systeme.gestion.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String  firstName ;
    String  lastName ;
    String  email ;
    String  phone;
    String  company;
    String  equipe;
    String category;
}

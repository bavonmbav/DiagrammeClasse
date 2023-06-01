package com.systeme.gestion.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Interaction {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String  type ;
    private String  description;
    private String  notes;
    private String details;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime timestamp;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;
}

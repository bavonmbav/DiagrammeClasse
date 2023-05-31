package com.systeme.gestion.service;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.entity.Interaction;
import com.systeme.gestion.implement.Document;
import com.systeme.gestion.implement.Note;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;

import java.time.Instant;
import java.util.List;

public interface InteractionServiceIT {
    void enregistrerInteraction(Interaction interaction);
    List<Interaction> getHistoriqueInteractions(Long contact);
}

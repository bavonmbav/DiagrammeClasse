package com.systeme.gestion.service;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.entity.Interaction;
import com.systeme.gestion.implement.Document;
import com.systeme.gestion.implement.Note;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;

import java.time.Instant;
import java.util.List;

public interface InteractionServiceIT {
    List<Interaction> findByContact();
//    List<Interaction> findByType(String type);
//    List<Interaction> findByDateBetween(Instant startDate, Instant endDate);
//    List<Interaction> getInteractionHistory(Contact contact);

    public void deleteInteraction(Long id);
    public void addNotesToInteraction(Interaction interaction, String notes);
    public void addDocumentToInteraction(Interaction interaction, Document document) ;
    public void addContactToInteraction(Interaction interaction, Contact contact) ;
    public void addInteraction(Interaction interaction);
}

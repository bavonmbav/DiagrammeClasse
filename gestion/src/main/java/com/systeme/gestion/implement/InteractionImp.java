package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.entity.Interaction;
import com.systeme.gestion.repository.InteractionRepository;
import com.systeme.gestion.service.InteractionServiceIT;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Iterator;
import java.util.List;

@Service
public class InteractionImp implements InteractionServiceIT{
    @Autowired
   private InteractionRepository interactionRepository;
//    @Autowired
//    InteractionServiceIT interactionServiceIT;
    @Override
    public List<Interaction> findByContact() {

        return (List<Interaction>) interactionRepository.findAll();
    }
    @Override
    public void addInteraction(Interaction interaction) {
        interactionRepository.save(interaction);
    }
//    @Override
//    public List<Interaction> findByType(String type) {
//        return (List<Interaction>) interactionRepository.findAll();
//    }
//    @Override
//    public List<Interaction> findByDateBetween(Instant startDate, Instant endDate) {
//        return interactionServiceIT.findByDateBetween(startDate, endDate);
//    }
//    @Override
//    public List<Interaction> getInteractionHistory(Contact contact) {
//        return interactionServiceIT.getInteractionHistory(contact);
//    }
    @Override
    public void deleteInteraction(Long id) {
        interactionRepository.deleteById(id);
    }
    public void addNotesToInteraction(Interaction interaction, String notes) {
        // Ajoutez ici la logique pour ajouter des notes à l'interaction
        Note note = new Note();
        note.setContact(notes);

        interaction.setNotes(notes);
        interactionRepository.save(interaction);
    }

    @Override
    public void addDocumentToInteraction(Interaction interaction, Document document) {
        // Ajoutez ici la logique pour ajouter un document à l'interaction
        // par exemple, vous pouvez avoir une relation avec une entité Document
        // et définir la relation appropriée ici
        document.setInteraction(interaction);
        JdbcAggregateTemplate documentRepository = null;
        documentRepository.save(document);

        interaction.setDocument(document);
        interactionRepository.save(interaction);
    }
    @Override
    public void addContactToInteraction(Interaction interaction, Contact contact) {
        // Ajoutez ici la logique pour ajouter un contact à l'interaction
        // par exemple, vous pouvez avoir une relation avec une entité Contact
        // et définir la relation appropriée ici
        interaction.setContact(contact);
        interactionRepository.save(interaction);
    }
}

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class InteractionImp implements InteractionServiceIT{
    @Autowired
   private InteractionRepository interactionRepository;

    @Override
    public void enregistrerInteraction(Interaction interaction) {
        interactionRepository.save(interaction);
    }

    @Override
    public List<Interaction> getHistoriqueInteractions(Long contact) {
      return interactionRepository.findByContactId(contact);
    }
}

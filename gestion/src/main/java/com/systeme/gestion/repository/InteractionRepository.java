package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.entity.Interaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface InteractionRepository extends CrudRepository<Interaction, Long> {
    List<Interaction> findByContactId(Long contactId);
}

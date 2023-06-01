package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Appointement;
import com.systeme.gestion.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointementRepository extends CrudRepository<Appointement, Long> {
    List<Appointement> findByUtilisateur(Utilisateur utilisateur);

    List<Appointement> findByNotes(String notes);
}

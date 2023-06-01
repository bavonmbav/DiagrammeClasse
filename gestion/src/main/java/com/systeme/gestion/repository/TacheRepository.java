package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Tache;
import com.systeme.gestion.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheRepository extends CrudRepository<Tache, Long> {

    List<Tache> findByUtilisateur(Utilisateur user);
}

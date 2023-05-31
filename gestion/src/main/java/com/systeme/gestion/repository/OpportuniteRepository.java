package com.systeme.gestion.repository;

import com.systeme.gestion.entity.EtatOpportunite;
import com.systeme.gestion.entity.Opportunite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpportuniteRepository extends CrudRepository<Opportunite, Long> {
    List<Opportunite> findByMembreId(Long membreId);
    List<Opportunite> findByEtat(EtatOpportunite etat);

}

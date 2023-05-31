package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Opportunite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpportuniteRepository extends CrudRepository<Opportunite, Long> {

}

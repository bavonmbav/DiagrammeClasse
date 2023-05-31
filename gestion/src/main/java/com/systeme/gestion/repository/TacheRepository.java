package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Tache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends CrudRepository<Tache, Long> {

}

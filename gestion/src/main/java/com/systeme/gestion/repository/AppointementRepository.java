package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Appointement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointementRepository extends CrudRepository<Appointement, Long> {
}

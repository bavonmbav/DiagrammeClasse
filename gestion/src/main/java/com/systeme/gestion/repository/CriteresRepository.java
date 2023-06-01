package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Criteres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteresRepository extends JpaRepository<Criteres, Long> {

}

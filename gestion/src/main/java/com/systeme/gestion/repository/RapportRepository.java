package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface RapportRepository extends JpaRepository<Rapport, Long> {
        List<Rapport> findByCritere1AndCritere2(String critere, Long critere2);
    }



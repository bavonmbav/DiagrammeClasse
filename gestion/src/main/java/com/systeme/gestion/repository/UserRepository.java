package com.systeme.gestion.repository;


import com.systeme.gestion.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Utilisateur, Long> {
}

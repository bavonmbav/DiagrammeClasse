package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository  extends JpaRepository<Contact, Long> {
   List<Contact> findByEquipe(String equipeName);
    List<Contact> findByCategory(String categoryName);
}

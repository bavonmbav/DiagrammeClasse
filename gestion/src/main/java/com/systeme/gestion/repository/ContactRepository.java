package com.systeme.gestion.repository;

import com.systeme.gestion.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository  extends CrudRepository<Contact, Long> {
}

package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.repository.ContactRepository;
import com.systeme.gestion.service.ContactsServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GestionController {

    @Autowired
    private ContactsServiceIT contactRepository;

//    add contact

    @PostMapping("/contact")
    public Contact addContact(@Validated @RequestBody Contact contact){
        return contactRepository.saveContact(contact);
    }
    @GetMapping("/contact")
    public List<Contact>getContact(){
        return contactRepository.findByFirstName();
    }
}

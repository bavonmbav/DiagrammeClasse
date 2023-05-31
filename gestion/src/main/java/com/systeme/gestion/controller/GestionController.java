package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.repository.ContactRepository;
import com.systeme.gestion.service.ContactsServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    //get contact par id
    @GetMapping("/contact/{id}")
    public Contact getContactById(@PathVariable Long id) {
        return contactRepository.getContactById(id);
    }

    @PutMapping("/contact/{id}")
    public Contact updateContact( @RequestBody Contact updatedContact,@PathVariable Long id) {
        return contactRepository.updateContactBy(updatedContact,id);
    }

    //oraginser selon leur groupe
    @GetMapping("/contact/group/{groupName}")
    public List<Contact> getContactsByGroup(@PathVariable String groupName) {
        return contactRepository.getContactsByGroup(groupName);
    }
    //oraniser selon leur categorie
    @GetMapping("/contact/category/{categoryName}")
    public List<Contact> getContactsByCategory(@PathVariable String categoryName) {
        return contactRepository.getContactsByCategory(categoryName);
    }
    //delete contact
    @DeleteMapping("/contact/{id}")
    public String deleteContact(@PathVariable Long id) {
        contactRepository.deleteContactBy(id);
        return "contact deleted successfully";
    }

}

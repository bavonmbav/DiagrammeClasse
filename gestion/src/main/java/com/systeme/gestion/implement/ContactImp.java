package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.repository.ContactRepository;
import com.systeme.gestion.service.ContactsServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ContactImp implements ContactsServiceIT {
    @Autowired
    private ContactRepository repository;

    public ContactImp(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public Contact getContactById(Long id) {
        return repository.findById(id).orElse(null);
    }
    //par groupe
    @Override
    public List<Contact> getContactsByGroup(String equipeName) {
        return  repository.findByEquipe(equipeName);
    }

    @Override
    public List<Contact> getContactsByCategory(String categoryName) {
        return repository.findByCategory(categoryName);
    }

    @Override
    public List<Contact> findByFirstName() {
        return  (List<Contact>)repository.findAll();
    }
    @Override
    public Contact saveContact(Contact contact){
        return repository.save(contact);
    }
    @Override
    public Contact updateContactBy(Contact contact, long id){
        // complete le code
        Contact contacts = repository.findById(id).orElse(null);
        if (contacts != null) {
            contacts.setFirstName(contact.getFirstName());
            contacts.setLastName(contact.getLastName());
            // Set other properties as needed
            return repository.save(contacts);
        }
        return null;
    }
    @Override
    public void deleteContactBy(Long id){
        repository.deleteById(id);
    }
}

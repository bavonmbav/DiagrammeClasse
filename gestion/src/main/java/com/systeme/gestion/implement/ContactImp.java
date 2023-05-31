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
        Contact existingDepartement = repository.findById(id).get();
        if(Objects.nonNull(contact.getFirstName()) &&
                !"".equalsIgnoreCase(contact.getFirstName())){
            existingDepartement.setFirstName(contact.getFirstName());
        }
        if(Objects.nonNull(contact.getCompany()) &&
                !"".equalsIgnoreCase(contact.getCompany())){
            existingDepartement.setCompany(contact.getCompany());
        }
        if(Objects.nonNull(contact.getPhone()) &&
                !"".equalsIgnoreCase(contact.getPhone())){
            existingDepartement.setPhone(contact.getPhone());
        }
        return repository.save(existingDepartement);
    }
    @Override
    public void deleteContactBy(Long id){
        repository.deleteById(id);
    }
}

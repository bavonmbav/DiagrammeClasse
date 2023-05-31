package com.systeme.gestion.service;

import com.systeme.gestion.entity.Contact;

import java.util.List;

public interface ContactsServiceIT {
    Contact getContactById(Long id);
    List<Contact> getContactsByGroup(String equipeName);
    List<Contact> getContactsByCategory(String categoryName);
    List<Contact> findByFirstName();
    public Contact saveContact(Contact contact);
    public Contact updateContactBy(Contact contact, long id);
    public void deleteContactBy(Long id);
}

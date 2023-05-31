package com.systeme.gestion.service;

import com.systeme.gestion.entity.Contact;

import java.util.List;

public interface ContactsServiceIT {

    List<Contact> findByFirstName();
    public Contact saveContact(Contact contact);
    public Contact updateContactBy(Contact contact, long id);
    public void deleteContactBy(Long id);
}

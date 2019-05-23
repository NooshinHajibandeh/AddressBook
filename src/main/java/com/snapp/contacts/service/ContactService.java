package com.snapp.contacts.service;

import java.util.List;

public interface ContactService {

    /**
     * this method adds a new contact
     *
     * @param dto new contact
     */
    void save(ContactDto dto);


    /**
     * this method searches contacts
     *
     * @param contact search contact
     * @return list of contacts
     */
    List<ContactDto> searchContact(ContactDto contact);
}

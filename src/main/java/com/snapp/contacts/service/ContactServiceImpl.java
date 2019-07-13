package com.snapp.contacts.service;

import com.snapp.contacts.repo.Contact;
import com.snapp.contacts.repo.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nooshin Hajibandeh
 * @since 22/05/2019.
 */
@Component
public class ContactServiceImpl implements ContactService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactServiceImpl.class);

    private ContactRepository repository;

    @Autowired
    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    public void save(ContactDto dto) {
        repository.save(convertContact(dto));
        LOGGER.info("Contact is saved");
    }

    public List<ContactDto> searchContact(ContactDto contact) {
        return convertContacts(repository.findAllBy(contact.getName(), contact.getEmail(), contact.getPhone(),
                contact.getOrganization()));
    }

    private Contact convertContact(ContactDto dto) {
        Contact entity = new Contact();
        entity.setFullName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setOrganization(dto.getOrganization());
        entity.setPhone(dto.getPhone());
        return entity;
    }

    private List<ContactDto> convertContacts(List<Contact> contacts) {
        List<ContactDto> contactList = new ArrayList<>();
        contacts.forEach((contact) -> {
            ContactDto contactDto = new ContactDto();
            contactDto.setName(contact.getFullName());
            contactDto.setEmail(contact.getEmail());
            contactDto.setOrganization(contact.getOrganization());
            contactDto.setPhone(contact.getPhone());
            contactList.add(contactDto);
        });
        return contactList;
    }
}

package com.snapp.contacts.web;

import com.snapp.contacts.service.ContactDto;
import com.snapp.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactsController {

    private ContactService contactService;

    @Autowired
    public ContactsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PutMapping
    public void addContact(@RequestBody ContactDto contact) {
        contactService.save(contact);
    }

    @GetMapping
    @ResponseBody
    public List<ContactDto> searchContact(@RequestBody ContactDto contact) {
        return contactService.searchContact(contact);
    }

}

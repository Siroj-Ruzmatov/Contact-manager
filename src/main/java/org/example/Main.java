package org.example;

import org.example.service.ContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        List<Contact> contactList = new ArrayList<>();

        while (true) {
            contactService.menu();
            int n = contactService.getMenuNumber();
            switch (n) {
                case 1:
                    Contact contact = contactService.createContact();
                    contactList.add(contact);
                    break;
                case 2:
                    contactService.printContacts(contactList);
                    break;
            }
        }

    }

}

package org.example;

import org.example.service.ContactService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService contactService = new ContactService();

       while (true) {
           contactService.menu();
           int n = contactService.getMenuNumber();
           switch (n){
               case 1:
                contactService.addContact();
           }
       }

    }


}

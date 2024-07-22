package org.example.service;

import org.example.Contact;

import java.util.Scanner;

public class ContactService {

    Contact contact = new Contact();

    public static void menu(){
        System.out.println("*** Menu ***\n" + "1.Contact add\n" + "2.Contact List\n" + "3.Searching Contacts\n"
                + "4.Delete Contact(by phone number)\n" + "0.Exit");
    }

    public static int getMenuNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a menu number: ");
        return scanner.nextInt();
    }

    public void addContact(){
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        boolean isValidName = false;
        boolean isValidSurname = false;
        boolean isValidPhone = false;

        while(!isValidName){
            System.out.print("Enter contact name: ");
            String nameStr = scanner.nextLine();

            if(nameStr == null || nameStr.trim().length() < 3 || nameStr.trim().equals("")){
                System.out.println("Please enter a valid name.");
            } else  {
                isValidName = true;
                contact.setName(nameStr);
            }

        }

        while (!isValidSurname) {
            System.out.print("Enter contact surname: ");
            String surnameStr = scanner.nextLine();

            if(surnameStr == null || surnameStr.trim().length() < 3 || surnameStr.trim().equals("")){
                System.out.println("Please enter a valid surname.");
            } else  {
                isValidSurname = true;
                contact.setSurname(surnameStr);
            }
        }

        while (!isValidPhone){
            System.out.print("Enter contact phone number: ");
            String phoneStr = scanner.nextLine();

            Boolean thereIsLetterOnStr = false;

            char[] phoneArray = phoneStr.toCharArray();
            for (int i = 0; i < phoneArray.length; i++) {
                if (!Character.isDigit(phoneArray[i])) {
                    thereIsLetterOnStr = true;
                }
            }

            if(phoneStr == null || phoneStr.trim().length() < 12 || phoneStr.trim().equals("") || !phoneStr.startsWith("998") || thereIsLetterOnStr){
                System.out.println("Please enter a valid phone number.");
            }else {
                isValidPhone = true;
                contact.setPhone(phoneStr);
            }

        }
        System.out.println("Successfully entered contact");

    }

}

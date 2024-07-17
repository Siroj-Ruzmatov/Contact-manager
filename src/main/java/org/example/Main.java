package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       while (true) {
           menu();
           int n = getMenuNumber();
           switch (n){
               case 1:
           }
       }

    }

    public static void menu(){
        System.out.println("*** Menu ***\n" + "1.Contact add\n" + "2.Contact List\n" + "3.Searching Contacts\n"
                + "4.Delete Contact(by phone number)\n" + "0.Exit");
    }

    public static int getMenuNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a mune number: ");
        return scanner.nextInt();
    }
}

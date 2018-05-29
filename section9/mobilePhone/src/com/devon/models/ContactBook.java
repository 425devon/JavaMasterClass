package com.devon.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public ContactBook() {
        this.startProgram();
    }

    private void startProgram(){

    }

    public void createContact(){
        Contact contact = new Contact();
        System.out.println("Create new contact");
        System.out.println("Please enter first name:");
        contact.setFirstName(scanner.nextLine().toLowerCase());
        System.out.println("Please enter last name:");
        contact.setLastName(scanner.nextLine().toLowerCase());
        System.out.println("Please enter phone number:");
        contact.setPhoneNumber(scanner.nextLong());
        contacts.add(contact);
    }
    //still needs back to menu
    public void findContact(){
        System.out.println("Enter 1 to search by first name, Enter 2 to search by last name, Or Enter 0 to go back to menu:");
        int choice = scanner.nextInt();
        if(choice <1 || choice > 2){
            System.out.println("Im sorry I did not understand");
            this.findContact();
        }else {
            if (choice == 1) {
                searchByFirstName();
            } else if(choice == 2) {
                searchByLastName();
            }
        }
    }

    public Contact searchByFirstName(){
        System.out.println("Please enter first name:");
        String firstName = scanner.next();
        System.out.println(firstName);
        for(Contact c : contacts){
            if(c.getFirstName().equals(firstName)){
                System.out.printf("Contact found, Fist name: %s, Last name %s \n" +
                        "Number: %d%n", c.getFirstName(), c.getLastName(), c.getPhoneNumber());
                return c;
            }
        }
        System.out.println("Contact not found");
        return null;

    }

    public Contact searchByLastName(){
        System.out.println("Please enter last name:");
        String lastName = scanner.next();
        for(Contact c : contacts){
            if(c.getLastName().equals(lastName)){
                System.out.printf("Contact found, Fist name: %s, Last name %s \n" +
                        "Number: %d%n", c.getFirstName(), c.getLastName(), c.getPhoneNumber());
                return c;
            }
        }
        System.out.println("Contact not found");
        return null;
    }

    public void printContacts(){
        for(Contact c: contacts){
            System.out.printf("First name: %s Last Name: %s Phone Number: %d%n",
                    c.getFirstName(), c.getLastName(), c.getPhoneNumber());
        }
    }
}

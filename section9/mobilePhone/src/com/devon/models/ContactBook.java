package com.devon.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public ContactBook() {
        this.menu();
    }


    //still needs back to menu
    private void menu(){
        boolean quit = false;
        int choice;
        System.out.println("Welcome to Contacts!\nPlease choose fom the following menu\n" +
                "1 - Find contact \n" +
                "2 - Create new contact \n" +
                "3 - Print all contacts \n" +
                "4 - Exit program");
        while(!quit){
            System.out.println("Enter option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    findContact();
                    break;
                case 2:
                    createContact();
                    break;
                case 3:
                    printContacts();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    private void createContact(){
        Contact contact = new Contact();
        System.out.println("Create new contact");
        System.out.println("Please enter first name:");
        contact.setFirstName(scanner.next().toLowerCase());
        System.out.println("Please enter last name:");
        contact.setLastName(scanner.next().toLowerCase());
        System.out.println("Please enter phone number:");
        contact.setPhoneNumber(scanner.nextLong());
        contacts.add(contact);
        System.out.println("Contact successfully created \n");
        this.menu();
    }

    private void findContact(){
        System.out.println("Enter 1 to search by first name, Enter 2 to search by last name, Or Enter 0 to go back to menu:");
        int choice = scanner.nextInt();
        if(choice < 0 || choice > 2){
            System.out.println("Im sorry I did not understand");
            this.findContact();
        }else {
            if (choice == 1) {
                searchByFirstName();
            } else if(choice == 2) {
                searchByLastName();
            } else if(choice == 0){
                menu();
            }
        }
    }

    private Contact searchByFirstName(){
        System.out.println("Please enter first name:");
        String firstName = scanner.next().toLowerCase();
        for(Contact c : contacts){
            if(c.getFirstName().equals(firstName)){
                System.out.printf("Contact found, Fist name: %s, Last name %s \n" +
                        "Number: %d%n", c.getFirstName(), c.getLastName(), c.getPhoneNumber());
                System.out.println("Press 0 to return to menu\nPress 1 to edit contact\n" +
                        "Press 2 to delete contact");
                int choice = scanner.nextInt();
                if(choice == 0){
                    this.menu();
                }else if(choice == 1){
                    this.editContact(c);
                }else if(choice == 2){
                    this.delete(c);
                }
                return c;
            }
        }
        System.out.println("Contact not found");
        this.menu();
        return null;

    }

    private Contact searchByLastName(){
        System.out.println("Please enter last name:");
        String lastName = scanner.next().toLowerCase();
        for(Contact c : contacts){
            if(c.getLastName().equals(lastName)){
                System.out.printf("Contact found, Fist name: %s, Last name %s \n" +
                        "Number: %d%n", c.getFirstName(), c.getLastName(), c.getPhoneNumber());
                System.out.println("Press 0 to return to menu\nPress 1 to edit contact\n" +
                        "Press 2 to delete contact");
                int choice = scanner.nextInt();
                if(choice == 0){
                    this.menu();
                }else if(choice == 1){
                    this.editContact(c);
                }else if(choice == 2){
                    this.delete(c);
                }
                return c;
            }
        }
        System.out.println("Contact not found");
        this.menu();
        return null;
    }

    private void printContacts(){
        for(Contact c: contacts){
            System.out.printf("First name: %s Last Name: %s Phone Number: %d%n",
                    c.getFirstName(), c.getLastName(), c.getPhoneNumber());
        }
        this.menu();
    }

    private void editContact(Contact c){
        int index = contacts.indexOf(c);
        String fName, lName;
        long number;

        System.out.println("Edit first name:");
        c.setFirstName(scanner.next());
        System.out.println("Edit last name:");
        c.setLastName(scanner.next());
        System.out.println("Edit phone number:");
        c.setPhoneNumber(scanner.nextLong());

        contacts.set(index, c);
        System.out.println("Contact successfully updated");
        menu();
    }

    private void delete(Contact c){
        contacts.remove(c);
        System.out.println("Contact Deleted");
        this.menu();
    }
}

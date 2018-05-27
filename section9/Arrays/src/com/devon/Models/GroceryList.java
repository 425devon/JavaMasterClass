package com.devon.Models;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> shoppingList = new ArrayList<String>();

    public GroceryList() {}

    public void addItem(String item){
        shoppingList.add(item);
    }

    public void printList(){
        for(int i = 0; i < this.shoppingList.size(); i++){
            System.out.printf("item number: %d, %s \n",i+1,this.shoppingList.get(i));
        }
    }

    public void modifyList(int index, String item){
        this.shoppingList.set(index, item);
    }

    public void removeItem(int index){
        String item = this.shoppingList.get(index);
        this.shoppingList.remove(index);
        System.out.printf("%s has been removed from the list \n", item);
    }

    public boolean findItem(String searchItem){
        boolean exists = this.shoppingList.contains(searchItem);
        if(exists){
            System.out.printf("%s is on the list \n", searchItem);
            return true;
        }else {
            System.out.printf("%s is not on the list \n", searchItem);
            return false;
        }
    }

    public int getIdxOfItem(String item){
        return this.shoppingList.indexOf(item);
    }

    public void createListFromUserInput(){
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    this.printList();
                    break;
                case 2:
                    addScanItem();
                    break;
                case 3:
                    modifyScanList();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    private void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print options.");
        System.out.println("\t 1 - To print list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify and item from the list");
        System.out.println("\t 4 - To remove an item for the list");
        System.out.println("\t 5 - To search for an item on the list");
        System.out.println("\t 6 - To quit the application");
    }

    private void addScanItem(){
        System.out.print("Please enter the grocery item: ");
        this.shoppingList.add(scanner.nextLine());
    }

    private void modifyScanList(){
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter item to replace with:");
        String replacement = scanner.nextLine();

        this.shoppingList.set(itemNumber-1, replacement);
    }

    private void removeItem(){
        System.out.print("Enter item number to remove:");
        int index = scanner.nextInt()-1;
        String item = this.shoppingList.get(index);
        this.shoppingList.remove(index);
        System.out.printf("%s has been removed from the list \n", item);
    }

    private boolean findItem(){
        System.out.print("Please enter item to search: ");
        String searchItem = scanner.nextLine();
        boolean exists = this.shoppingList.contains(searchItem);
        if(exists){
            System.out.printf("%s is on the list \n", searchItem);
            return true;
        }else {
            System.out.printf("%s is not on the list \n", searchItem);
            return false;
        }
    }




}

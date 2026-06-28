package com.axsos.coffeeApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CoffeeKiosk {
        ArrayList<Items> menu;
        ArrayList<Order> orders;
    public CoffeeKiosk(){
        this.menu = new ArrayList<>() ;
        this.orders = new ArrayList<>();
    }
    public void addMenuItem(String name , double price){
        Items newItem = new Items(name, price);

        newItem.setIndex(menu.size());

//        newItem.index = menu.size(); if we dont use setter we use this
        menu.add(newItem);
    }
    public void addMenuItemInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the new item u want to add to the list or press q to stop adding");
        String itemName =scanner.nextLine();
        while (!itemName.equals("q")){
            System.out.println("enter item price");
            try{
            double price = Double.parseDouble(scanner.nextLine());

            addMenuItem(itemName,price);
            System.out.println("you can add new item or press q to stop the proccess");
            itemName = scanner.nextLine();

            }catch (NumberFormatException e){
                System.out.println("invalid input type please enter the correct price");
            }
        }
        System.out.println("Menu have been updated");
        displayMenu();
    }
    public void displayMenu(){
        for(Items item:menu){
            System.out.printf("%d %s  ᡕᠵデ气亠 $%.2f %n" ,item.getIndex() ,item.getName(),item.getPrice());

        }

    }
    public void newOrder() {
        Scanner scanner = new Scanner(System.in);

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = scanner.nextLine();

        // Your code:

        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = scanner.nextLine();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            try{
                int index = Integer.parseInt(itemNumber);
                if(index <0 || index >= menu.size()){
                    System.out.println("invalid number plaese choose a number conitining from the given menu ");
                }else{
                       Items selectItem = menu.get(index);
                       order.addItem(selectItem);
                       System.out.println(selectItem.getName() + " : has been add to your order do u wanna something else sir?");

                }
            }catch (NumberFormatException e){
                System.out.println("plaese enter a valid number !!");
            }
            // Get the item object from the menu, and add the item to the order


            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item or to quit enter q : ");
            itemNumber = scanner.nextLine();
        }
        // After you have collected their order, print the order details
        orders.add(order);
        order.display();

    }
}

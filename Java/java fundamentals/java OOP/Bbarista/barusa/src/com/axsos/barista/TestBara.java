package com.axsos.barista;

public class TestBara {
    public static void main(String[] args) {

        // Menu items
        Items mocha = new Items("mocha", 3.5);
        Items latte = new Items("latte", 4.0);
        Items dripCoffee = new Items("drip coffee", 2.0);
        Items cappuccino = new Items("cappuccino", 4.5);

        // Two guest orders
        Order guestOrder1 = new Order();
        Order guestOrder2 = new Order();

        // Three named orders
        Order order1 = new Order("aws1");
        Order order2 = new Order("aws2");
        Order order3 = new Order("Dusk");

        // Add at least two items to each order
        guestOrder1.addItem(mocha);
        guestOrder1.addItem(latte);

        guestOrder2.addItem(dripCoffee);
        guestOrder2.addItem(cappuccino);

        order1.addItem(dripCoffee);
        order1.addItem(cappuccino);

        order2.addItem(mocha);
        order2.addItem(mocha);

        order3.addItem(latte);
        order3.addItem(dripCoffee);
        order3.addItem(cappuccino);

        // Test getStatusMessage
        order1.setIsReady(true);
        order3.setIsReady(false);
        // guestOrder1, guestOrder2, and order2 stay not-ready by default

        System.out.println("Status Messages");
        System.out.println("Guest Order 1: " + guestOrder1.getStatusMessage());
        System.out.println("Guest Order 2: " + guestOrder2.getStatusMessage());

        // Test getOrderTotal
        System.out.println("Order Totals");
        System.out.println(order1.getTotalO());
        System.out.println(order2.getTotalO());
        System.out.println(order3.getTotalO());

        // Test display
        System.out.println("Display Orders");
        guestOrder1.display();
        System.out.println();
        guestOrder2.display();
        System.out.println();
        order1.display();
        System.out.println();
        order2.display();
        System.out.println();
        order3.display();
    }
}
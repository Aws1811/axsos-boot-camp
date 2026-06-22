package com.axsos.coffeeApp;

public class Main {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
//        items added are here
        kiosk.addMenuItem("mocha" ,5);
        kiosk.addMenuItem("coffe" ,1);
        kiosk.addMenuItem("milkshake" ,8);
        kiosk.addMenuItem("vanila" ,16);
        kiosk.addMenuItem("choco" ,2);
    kiosk.newOrder();
    }
}

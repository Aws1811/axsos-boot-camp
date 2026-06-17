package com.axsos.cafeJava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coppuciPrice = 6.4;
        double lattehPrice = 2.00;
        double coffePrice = 1.50;

        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"


//  Sali ordered a coffee. Based on her order status, print the correct status message to the console.
        if (isReadyOrder3) {
            System.out.println(customer3);
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }

//  Ahmad ordered a cappuccino.

        if (isReadyOrder2) {
            System.out.println(customer2+readyMessage);
             String output = String.format("%s %s %s", customer2, displayTotalMessage, coppuciPrice);
            System.out.println(output);
        } else {
            System.out.println(pendingMessage);
        }
//  Sali just ordered 2 lattes
        System.out.println(displayTotalMessage+(lattehPrice * 2));

        if (isReadyOrder4) {
            System.out.println(customer3+readyMessage);

        } else {
            System.out.println(customer3+pendingMessage);
        }
//  Adam just realized he was charged for a coffee

System.out.println(displayTotalMessage + (lattehPrice -coffePrice));

    }
}
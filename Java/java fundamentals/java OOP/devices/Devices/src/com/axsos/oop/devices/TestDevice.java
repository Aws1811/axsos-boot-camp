package com.axsos.oop.devices;

public class TestDevice {
    public static void main(String[] args) {

// create an instance of the Phone class and store it in a reference variable called check
        Phone check = new Phone();

//        do the method call 3 times
        check.call();
        check.call();
        check.call();

//        play games twice
        check.playGame();
        check.playGame();

//        then charge you phone 1 time
        check.charging();

//      check the battery at the final result
        check.displayBattery();

    }
}

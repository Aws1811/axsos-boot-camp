package com.axsos.oop.devices;

public class Phone extends Device{

//    this method to do the call on the phone
    public void call(){
        setBattery(getBattery()-5);
        System.out.println("charging now after a call with my friendo is " + getBattery());
    }

//  this method to play a game
    public void playGame(){
        setBattery(getBattery()-20);
        System.out.println("charging now after a fantastic gaming is : " + getBattery());

    }

//    this method for charging your phone
    public void charging(){
    setBattery(getBattery()+50);
    System.out.println("charging now after a good charging is :" + getBattery());

    }
}

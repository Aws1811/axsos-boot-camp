package com.axsos.oop.devices;

public class Phone extends Device{
    public void call(){
        setBattery(getBattery()-5);
        System.out.println("charging now after a call with my friendo is " + getBattery());
    }
    public void playGame(){
        setBattery(getBattery()-20);
        System.out.println("charging now after a fantastic gaming is : " + getBattery());

    }
    public void charging(){
    setBattery(getBattery()+50);
    System.out.println("charging now after a good charging is :" + getBattery());

    }
}

package com.axsos.oop.devices;

public class Device {
//    encabsoliting
    private int battery;

//    this is the constracter
    public  Device(){
        this.battery=100;
    }

//    this is the getters
    public int getBattery(){
        return battery;
    }

//    this is the setter
    public void setBattery(int battery){
        this.battery = battery;
    }

// this is for displaying the battery
    public void displayBattery(){
        System.out.println("your battery charge now is : " + battery);
    }
}

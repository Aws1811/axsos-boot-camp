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
        if(battery>0 && battery<100){
        this.battery = battery;
        }else {
            System.out.println("invalid battery lvl");
        }
    }

// this is for displaying the battery
    public void displayBattery(){
        if(getBattery() <10){
            System.out.println("⚠ BATTERY CRITICAL!");
        }
        System.out.println("your battery charge now is : " + battery);
    }
}

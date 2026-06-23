package com.axsos.oop.zookeeper;

public class Mammal {
    private int energy;
//     here is the constracter
    public Mammal(){
        this.energy = 100;
    }
//     here the getter
    public int getEnergy(){
        return energy;
    }
//     and the setter
    public void setEnergy(int energy){
        this.energy = energy;
    }
//    for displaying the current energy

    public void displayEnergy(){
        System.out.println("animal energy now is :" + energy);
    }
}

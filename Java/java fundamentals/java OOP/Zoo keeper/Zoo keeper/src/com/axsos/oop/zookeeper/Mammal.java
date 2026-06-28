package com.axsos.oop.zookeeper;

public class Mammal {
    private int energy;
    private int maxEnergy;
//     here is the constracter
    public Mammal(){
        this.energy = 100;
        this.maxEnergy = 100;
    }
//     here the getter
    public int getEnergy(){
        return energy;
    }
    public int getMaxEnergy(){
        return maxEnergy;
    }

//     and the setter
    public void setEnergy(int energy){
        if(energy <0){
           this.energy  = 0;
        }
        else if (energy >maxEnergy){
            this.energy = maxEnergy;
        }else{
        this.energy = energy;

        }
    }
    public void setMaxEnergy(int maxEnergy){
        this.maxEnergy =maxEnergy;
    }
//    for displaying the current energy

    public void displayEnergy(){
        System.out.println("animal energy now is :" + energy);
    }
}

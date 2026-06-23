package com.axsos.oop.zookeeper;

public class Bat extends Mammal {
//    this to set a new constracter from the setenergy in the Mammal class
    public Bat(){
        setEnergy(300);
    }
//  here to see the fly method
    public void fly() {
        setEnergy(getEnergy() - 50);
        if (getEnergy() > 300) {
            setEnergy(300);
        }
    if(getEnergy() < 0){
        setEnergy(0);
        System.out.println("the bat fall apart seems he is really tired the energy now is 0");
    }else{
        System.out.println("bat now is preforming an airstrike his energy now is : " + getEnergy());
    }
    }


//  here to see the bat eating human
    public void eatHuman() {
        setEnergy(getEnergy() + 25);
        if (getEnergy()>300) {
            setEnergy(300);
        }
        if(getEnergy() <= 0){
            setEnergy(0);
        }else {
            System.out.println("this damn Bat seems so happy with the human he ate so the energy now is :" + getEnergy());
        }
    }

//  the town gets an attack be careful
    public void attackTown(){
        setEnergy(getEnergy()-100);
        if(getEnergy()>300){
            setEnergy(300);
        }
        if(getEnergy() <= 0){
            setEnergy(0);
        }else {
            System.out.println("the town now is turned to dust with the bat attack , he use a lot of energy so the energy now is :" +getEnergy());
        }
    }
}


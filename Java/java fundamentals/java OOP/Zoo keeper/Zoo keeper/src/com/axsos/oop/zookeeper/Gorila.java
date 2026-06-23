package com.axsos.oop.zookeeper;

public class Gorila extends Mammal {

// here to see the gorilla throwin a thing to the void

    public void throwSomething(){
        setEnergy(getEnergy()-5);
        if(getEnergy() >100){
            setEnergy(100);
        }

        System.out.println("the gorilla seems to throw something at someone it seems her energy now is : " + getEnergy());

    }

//     here seeing the gorilla eatiing an banana

    public void eatBanana(){
        setEnergy(getEnergy()+10);
        if(getEnergy() >100){
            setEnergy(100);
        }

        System.out.println("gorilla seems very happy with eating this banana , now she is full of motivition her energy now is :"+ getEnergy()) ;


    }

//    here to climb a tree or a thing

    public  void  climb(){
        setEnergy(getEnergy()-10);
        if(getEnergy() >100){
            setEnergy(100);
        }

        System.out.println("oohh the gorilla seems tired after this climb her energy now is :"+ getEnergy()) ;

    }

}
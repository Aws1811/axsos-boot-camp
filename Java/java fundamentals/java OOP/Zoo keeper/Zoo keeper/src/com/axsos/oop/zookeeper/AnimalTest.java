package com.axsos.oop.zookeeper;

public class AnimalTest {
    public static void main(String[] args) {
        Gorila gorila = new Gorila();
        Bat bat = new Bat();
//        here is the gorilla info
        System.out.println(" gorilla info");

        gorila.throwSomething();
        gorila.throwSomething();
        gorila.throwSomething();
        gorila.eatBanana();
        gorila.eatBanana();
        gorila.climb();
        gorila.displayEnergy();


//        here is the bat info

        System.out.println(" bat info");
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHuman();
        bat.eatHuman();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
    }
}

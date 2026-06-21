package com.axsos.puzzle;
import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

//         ten rolls test
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

//        here to create a random letters
        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

//        here to create a random password
        String randomPassword = generator.generatePassword();
        System.out.println(randomPassword);

//        here  to get a new set of Passwords
        String[] getSet = generator.getNewPasswordSet();
        for(String pw : getSet){
            System.out.print(pw + " ");
        }
        System.out.println();
//here to shuffle the set of passwords
        String[] getShuffle = generator.shufflePassword(getSet);
        for (String sPw : getShuffle){
            System.out.print(sPw +" ");
        }
        System.out.println();
    }
}

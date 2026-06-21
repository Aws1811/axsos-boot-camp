package com.axsos.puzzle;
import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava {


     ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        System.out.println("to get 10 rolls");
        ArrayList <Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int roll = randMachine.nextInt(21);
            rolls.add(roll);
        }
        return rolls;
    }

     char getRandomLetter() {
//        System.out.println("generat one letter only");

        Random randMachine = new Random();

        char[] lettersArray = new char[26];
        for (int i = 0; i < 26; i++) {
            lettersArray[i] = (char) ('a' + i);
        }

        int numberRan = randMachine.nextInt(26);
//        System.out.println(lettersArray[numberRan]);
        return lettersArray[numberRan];
    }

     String generatePassword() {
//        System.out.println("generat one single password");

        String thePassword = "";
        for (int i = 0; i < 8; i++) {
            thePassword += getRandomLetter();
        }
//        System.out.println(thePassword);
        return thePassword;
    }

     String[] getNewPasswordSet() {
        System.out.println("generat set password");
        Random randMachine = new Random();
        int length = randMachine.nextInt(10);
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
//        System.out.print(passwordSet[i] +" ");
        }
//        System.out.println(".");

        return passwordSet;
    }
     String[] shufflePassword(String[] setOfPasswords){
//        System.out.println(".");
        System.out.println("here is the shuffle one");
        Random randMachine = new Random();
        String  temp;
    for(int i = 0 ; i < setOfPasswords.length ; i++){
        int randomNumber =randMachine.nextInt(i+1);
        temp = setOfPasswords[i];
        setOfPasswords[i] = setOfPasswords[randomNumber];
        setOfPasswords[randomNumber] = temp;

    }

        return setOfPasswords;
    }




}
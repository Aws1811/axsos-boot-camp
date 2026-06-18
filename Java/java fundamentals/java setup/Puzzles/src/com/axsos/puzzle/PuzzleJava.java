package com.axsos.puzzle;
import java.util.Random;


public class PuzzleJava {
    public static void main(String[] args){
        getRandomLetter();
        getTenRolls();
        generatePassword();
        getNewPasswordSet();
    }
         static void getTenRolls(){
        Random randMachine = new Random();
             int[] myArray;
             myArray = new int[10];
            for(int i  = 0; i<10;i++){
                myArray[i] = randMachine.nextInt(21);
                System.out.println(myArray[i]);
            }
        }
        static int getRandomLetter(){
            Random randMachine = new Random();

            char[] lettersArray = new char[26];
            for(int i =0;i<26;i++){
                lettersArray[i] = (char)('a'+i);
        }

        int numberRan = randMachine.nextInt(27);
        System.out.println(lettersArray[numberRan]);
        return lettersArray[numberRan] ;
        }
        static String generatePassword(){
        String Password = "";
        for (int i = 0 ;i<8;i++){
            Password += getRandomLetter();
        }return Password;
        }
        static String getNewPasswordSet(){
            Random randMachine = new Random();
            int length =randMachine.nextInt(21);
            String[] passwordSet = new String[length];
            for(int i = 0 ;i<length;i++){
                passwordSet[i] = generatePassword();
                return passwordSet;
            }
        }



}
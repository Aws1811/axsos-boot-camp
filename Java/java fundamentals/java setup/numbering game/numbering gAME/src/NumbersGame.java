import java.util.Random;
import java.util.Scanner;
public class NumbersGame {
    public static void main(String[] args){

//         the starting  text game
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
//        this is for getting a random number to guess
        int answer = new Random().nextInt(0,10);
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
//        now to start looping
        while(true){
            String guess = scanner.nextLine();
//            this to prevent more than 3 attempts of trying to guess
            if(counter == 1){
                System.out.println("you still have 2 more attempets");
            } else if (counter == 2) {
                System.out.println("you still have 1 more attempets");
            } else if (counter >= 3) {
                if(guess.equals("yes")){
                    counter = 0;
                    answer = new Random().nextInt(0,10);
                    System.out.println("New game! Guess away.");
                } else {
                    System.out.println("you are out of attempets");
                    System.out.println("if yu wanna try again type (yes)");
                }
                continue;
            }
//            here for stopping the game completely
            if(guess.equals("q")) {
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                break;
            }
//            here to prevent miss add for like charcter (a) or something not na a number
            try{
                if(Integer.parseInt(guess) >10 || Integer.parseInt(guess) <0){
                    System.out.println("keep you guessing between 10 and 0 buddy");
                    continue;
                }
                if(Integer.parseInt(guess)==answer){
                    System.out.println("Lucky guess! But can you do it again?");
                    break;
                }else{
                    System.out.println("Swing and a miss! Keep trying...");
                }
            }catch (NumberFormatException e){
                System.out.println("thats wont work buddy");
                continue;
            }
            counter++;
        }
        System.out.println("Game over. Shutting down...");
    }
}
// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

// public class Variables {
//     public static void main(String[] args){
//         int ourInt; // we can declare a variable without setting its value
//         ourInt = 400; // we can assign a value to the variable later in our code
//         double pi = 3.14159265; // we can also declare and assign on the same line
//         boolean bool = true;
//         char singleCharacter = 'A';
        
//         String multipleCharacters = "ABC";
//     }
// }

// boolean isRaining = true;
    
// if(isRaining) {
//     System.out.println("Bring an umbrella.");
// }
// else {
//     System.out.println("Have fun!");
// }

// public class ConditionalsAndOperators {
//     public static void main(String[] args) {    
//         // Predict the output and run the code to check your prediction
  
//         int temperature = 85;
//         boolean isCloudy = true;
  
//         if(temperature < 40 && isCloudy){
//           System.out.println("It might snow.");
//         }else if(isCloudy){
//           System.out.println("It might rain.");
//         }else{
//           System.out.println("We should have nice weather today.");
//         }
//         // it might rain
//         System.out.println(isCloudy ? "Bring an umbrella" : "Have fun!");
//     }
// }

// int day = 2;
// switch(day){
//     case 1:
//         System.out.println("Monday");
//         break;
//     case 2:
//         System.out.println("Tuesday");
//         break;
//     case 3:
//         System.out.println("Wednesday");
//         break;
//     case 4:
//         System.out.println("Thursday");
//         break;
//     case 5:
//         System.out.println("Friday");
//         break;
//     case 6:
//         System.out.println("Saturday");
//         break;
//     case 7:
//         System.out.println("Sunday");
//         break;
//     default:
//         System.out.println("There are only seven days in a week...");
// }

// public class SwitchAndTernary {
//     public static void main(String[] args) {   
//       // Your friend has asked you to watch the replay of a game you missed 
//       // Can you predict the output?
//       int goals = 3;
//       boolean watchReplay = false;
//       System.out.println("Are we watching this?");
//       switch(goals){
//         case 0:
//           System.out.println("Sounds like a boring game.");
//           break;
//         case 1:
//           System.out.println("Was it a good goal?");
//           watchReplay = true;
//       break;
//         case 2:
//           System.out.println("Was it a tie?");
//           watchReplay = true;
//       break;
//         case 3:
//           System.out.println("I can't wait to see it!");
//           watchReplay = true;
//       break;
//         default:
//           System.out.println("More than 3 goals? I'm in!");
//           watchReplay = true;
//       }
//       System.out.println(watchReplay ? "I'll see you in a bit." : "I'll pass.");
//     }
    // Are we watching this?
    // I can't wait to see it!
    // I'll see you in a bit.
// }


// public class Strings {
//     public static void main(String[] args){
//         // Predict the output
//         String message;
//         String output;
//         message = "Hello there!";
         output = String.format("Message %d: %s", 1, message.concat(" How are you doing today?"));
//         System.out.println(output);
//     }
//     // Message 1: Hello there! How are you doing today?
// }

// public class Methods {
//     public static void main(String[] args){
//         // Print "Hello Huda, how are you today?" and "Hello Sami Taha, how are you today?"
//         // Your code here
//         String name = "Huda";
//         String firstName = "Sami";
//         String lastName = "Taha";
//         System.out.println(greeting(name));
//         System.out.println(greeting(firstName,lastName));
//     }
//     // Don't worry about the 'public' and 'static' keywords for now.
//     // We will discuss them later.
//     public static String greeting(String name){
//         return String.format("Hello %s, how are you today?", name);
//     }
//     public static String greeting(String firstName, String lastName){
//         return String.format("Hello %s %s, how are you today?", firstName, lastName);
//     }
// }


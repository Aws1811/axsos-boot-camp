package com.axsos.alfredo;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s . Lovely to see you.",name);
    }
    public String guestGreeting(String name, Date time){
        String dayTime;
        SimpleDateFormat hourFormat = new SimpleDateFormat("H");
        int hour = Integer.parseInt(hourFormat.format(time));

        if(hour <12){
            dayTime = "morning";
        } else if (hour <18) {
            dayTime = "afternoon";
        }else{
            dayTime = "evening";
        }
        return String.format(" Good %s, how are you  %s" ,dayTime , name);
    }

    public String dateAnnouncement() {
        return String.format("it is currently %s" , new Date().toString());
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")!=-1){
            return "Right away, sir";

        }else if(conversation.indexOf("Alfred") != -1){
            return "At your service , as always sir";
        }else{
            return "I'm not sure what you need , sir";
        }
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
package com.axsos.map;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    HashMap <String,String> musicMap = new HashMap<String ,String >();
        musicMap.put("first Song" , "owowo");
        musicMap.put("second Song" , "nanana");
        musicMap.put("fourth Song" , "lwllw");
        musicMap.put("fivith Song" , "awawa");

        System.out.println(musicMap.get("fourth Song"));
        for(Map.Entry<String,String> aws : musicMap.entrySet()){
            System.out.println(aws.getKey()+ aws.getValue());
        }
    }
}
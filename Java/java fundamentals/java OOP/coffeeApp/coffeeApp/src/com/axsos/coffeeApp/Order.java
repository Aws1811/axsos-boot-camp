package com.axsos.coffeeApp;
import java.util.ArrayList;
public class Order {
    private String name ;
    private boolean ready;
    private ArrayList <Items> theItem = new ArrayList<Items>();

public Order(){
     this.name = "Guest";
    this.theItem = new ArrayList<Items>();
}
public Order(String name){
    this.name = name;
    theItem = new ArrayList<Items>();
}
public Order(String name ,boolean ready , ArrayList<Items> theItem){
    this.name = name;
    this.ready = ready;
    this.theItem = theItem;
}
public  String getName(){
    return name;
}
public  boolean isReady(){
    return ready;
}
public ArrayList<Items> getArray(){
    return theItem;
}
    public void setName(String  name){
    this.name = name;
    }
    public void setIsReady(boolean ready){
    this.ready = ready;
    }
    public void setArray(ArrayList<Items> theItem){
    this.theItem = theItem;
    }
public void addItem(Items item){
    theItem.add(item);
}
public  String getStatusMessage(){
    String message;
    if(ready){
        message = "your order is ready";
    }else {
        message = "Thank you for waiting , your order will be ready soon";
    }
    return message;
}
public  double getTotalO(){
    double total = 0;
    for(Items item:theItem){
    total  = total + item.getPrice();
    }
    return total;
}
public void display(){
    System.out.printf("Customer Name : %s%n" , name);
    for (Items item:theItem){

    System.out.printf("%s  -  $%.2f %n",item.getName(),item.getPrice());
    }
    System.out.printf("the total will be $%.2f sir %n" , getTotalO());
}
}

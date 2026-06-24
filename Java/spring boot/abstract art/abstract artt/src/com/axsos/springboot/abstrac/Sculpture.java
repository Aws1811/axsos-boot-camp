package com.axsos.springboot.abstrac;

public class Sculpture extends Art {
    private String material;

    public Sculpture(String title, String author, String description, String material){
        super(title,author,description);
        this.material =material;
    }

    public String getMaterial(){
        return material;

    }
    public void setMaterial(String material){
        this.material=material;
    }
//    TODO implement sculpture class
    @Override
    public void viewArt() {
    System.out.printf("This sculpture is called %s, created by %s. %s %n", getTitle(), getAuthor(), getDescription());
    System.out.printf("It is made of %s, truly a masterpiece! %n", material);
}
}

package com.axsos.springboot.abstrac;

public  class Painting extends Art {
//    TODO implement Painting class

    private String paintType;

    public Painting(String title , String author , String description , String paintType){
        super(title,author,description);
        this.paintType =paintType;
    }

    public String getPaintType(){
        return paintType;
    }
    public void setPaintType(String paintType){
        this.paintType = paintType;
    }
    @Override
    public void viewArt(){
        System.out.printf(" this paint called %s which is painted by %s and here here story %s %n %n" ,getTitle() ,getAuthor(),getDescription());
        System.out.printf("the main paint used here is %s it was a really good looking one fr %n %n" ,paintType );
    }

}


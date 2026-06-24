package com.axsos.springboot.abstrac;

public class Museum {
    public static void main(String[] args) {
//        TODO: create painting and sculptures here
        Painting p1 = new Painting("the fallen night" , "the dio", "its made in the night" , " red");
        Painting p2 = new Painting("end before the begggining" , "verso", "for those who come after" , " silveric");
        Painting p3 = new Painting("corption" , "king crimson", "the joureny never end" , " mondomim");
        Sculpture s1 = new Sculpture("lomuire" , "aws" , "the undeed of the dead","bronze");
        Sculpture s2 = new Sculpture("old lumire" , "aws" , "the undeed of the dead","gold");
    p1.viewArt();
    p2.viewArt();
    p3.viewArt();
    s1.viewArt();
    s2.viewArt();
    }
}

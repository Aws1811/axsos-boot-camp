package com.axsos.springboot.abstrac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
//        TODO: create painting and sculptures here
        Painting p1 = new Painting("the fallen night", "the dio", "its made in the night", " red");
        Painting p2 = new Painting("end before the begggining", "verso", "for those who come after", " silveric");
        Painting p3 = new Painting("corption", "king crimson", "the joureny never end", " mondomim");
        Sculpture s1 = new Sculpture("lomuire", "aws", "the undeed of the dead", "bronze");
        Sculpture s2 = new Sculpture("old lumire", "aws", "the undeed of the dead", "gold");
        ArrayList<Art> museum = new ArrayList<>();
        museum.add(p1);
        museum.add(p2);
        museum.add(p3);
        museum.add(s1);
        museum.add(s2);
        Collections.shuffle(museum);
        for (int i = 0; i < museum.size(); i++) {
            museum.get(i).viewArt();

//            or using for each :-
//            for(Art art: museum){
//                  art.viewArt();
//        }
        }
    }
}

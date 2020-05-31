package com.company;

import java.util.*;

public class Tracks {

    private int length;
    private ArrayList<Integer> Length = new ArrayList<Integer>();

    public void SetLength(int a){
        for (int i = 0; i < a; i++){
            length = (int) (100000*Math.random());
            System.out.println(length);
            Length.add(length);
        }
        System.out.println("");
    }

    public ArrayList<Integer> GetLength(){
        return Length;
    }
}

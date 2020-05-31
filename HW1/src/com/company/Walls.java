package com.company;

import java.util.*;

public class Walls {

    private ArrayList<Integer> Height = new ArrayList<Integer>();
    private int height;

    public void SetHeight(int a){
        for (int i = 0; i < a; i++){
            height = (int) (150*Math.random());
            System.out.println(height);
            Height.add(height);
        }
        System.out.println("");
    }

    public ArrayList<Integer> GetHeight(){
        return Height;
    }
}

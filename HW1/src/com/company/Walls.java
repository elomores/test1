package com.company;

public class Walls {

    private int height;

    public void SetHeight(){
        height = (int) (150*Math.random());
        System.out.println(height);
    }

    public int GetHeight(){
        return height;
    }
}

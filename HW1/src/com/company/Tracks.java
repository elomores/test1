package com.company;

public class Tracks {

    private int length;

    public void SetLength(){
        length = (int) (100000*Math.random());
        System.out.println(length);
    }

    public int GetLength(){
        return length;
    }
}

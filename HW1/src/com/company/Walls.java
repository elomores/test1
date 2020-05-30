package com.company;
import java.util.*;

public class Walls {

    protected ArrayList<Integer> Heigth = new ArrayList<Integer>();
    protected int height;

    public void SetHeight(){
        for (int i = 0; i < 10; i++){
            height = (int) (150000*Math.random());
            Heigth.add(height);
        }
    }

    public ArrayList<String> GetHeight()
}

package com.company;

public class Cat {

    private int cat_jump_height;
    private int cat_run_length;

    public void Cat_SetHeight(int a){
        cat_jump_height = a;
        System.out.println("Cat can jump " + cat_jump_height + "!");
    }

    public void Cat_SetLength(int b){
        cat_run_length = b;
        System.out.println("Cat can run for " + cat_run_length + "!");
    }

    public int Cat_GetHeight(){
        return cat_jump_height;
    }

    public int Cat_GetLength(){
        return cat_run_length;
    }
}

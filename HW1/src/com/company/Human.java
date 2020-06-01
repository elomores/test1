package com.company;

public class Human {
    private int human_jump_height;
    private int human_run_length;

    public void Human_SetHeight(int a){
        human_jump_height = a;
        System.out.println("Human can jump " + human_jump_height + "!");
        System.out.println(" ");
    }

    public void Human_SetLength(int b){
        human_run_length = b;
        System.out.println("Human can run for " + human_run_length + "!");
        System.out.println(" ");
    }

    public int Human_GetHeight(){
        return human_jump_height;
    }

    public int Human_GetLength(){
        return human_run_length;
    }
}

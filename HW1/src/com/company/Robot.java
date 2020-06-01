package com.company;

public class Robot {
    private int robot_jump_height;
    private int robot_run_length;

    public void Robot_SetHeight(int a){
        robot_jump_height = a;
        System.out.println("Robot can jump " + robot_jump_height + "!");
        System.out.println(" ");

    }

    public void Robot_SetLength(int b){
        robot_run_length = b;
        System.out.println("Robot can run for " + robot_run_length + "!");
        System.out.println(" ");
    }

    public int Robot_GetHeight(){
        return robot_jump_height;
    }

    public int Robot_GetLength(){
        return robot_run_length;
    }
}

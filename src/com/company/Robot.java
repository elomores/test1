package com.company;

public class Robot implements Challengers {
    private String Name = "B.O.B";
    private int RunDistance = 200;
    private int JumpHeight = 5;

    public Robot(String name, int distance, int jumpHeight) {
        Name = name;
        RunDistance = distance;
        JumpHeight = jumpHeight;
    }

    @Override
    public void run() {

        System.out.println("Robot " + Name + " is running " + getRunDistance());
        }

    @Override
    public void jump() {

        System.out.println("Robot " + Name + " is jumping " + getJumpHeight());
        }

    @Override
    public int getRunDistance() {

        return RunDistance;
        }

    @Override
    public int getJumpHeight() {

        return JumpHeight;
        }
}

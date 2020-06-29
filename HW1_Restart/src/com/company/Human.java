package com.company;

public class Human implements Challengers{

    private String name = "Bob";
    private int runDistance = 150;
    private int jumpHeight = 7;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {

        System.out.println("Human " + name + " is running " + getRunDistance());
    }

    @Override
    public void jump() {

        System.out.println("Human " + name + " is jumping " + getJumpHeight());
    }

    @Override
    public int getRunDistance() {

        return runDistance;
    }

    @Override
    public int getJumpHeight() {

        return jumpHeight;
    }

}

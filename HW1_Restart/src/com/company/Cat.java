package com.company;

public class Cat implements Challengers{

    private String name = "Bobby";
    private int runDistance = 100;
    private int jumpHeight = 10;



    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {

        System.out.println("Cat " + name + " is running " + getRunDistance());
    }

    @Override
    public void jump() {

        System.out.println("Cat " + name + " is jumping " + getJumpHeight());
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

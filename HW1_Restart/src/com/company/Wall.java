package com.company;

public class Wall implements Challenges {

    private int Height;

    public Wall (String name, int height){
        Height = height;
    }

    public int getHeight() {

        return Height;
    }

    public boolean moving (Challengers actions) {
        System.out.println("The wall height is " + this.Height);

        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("jump success");

            return true;
        } else {
            System.out.println("jump unsuccessfully");

            return false;
        }
    }
}

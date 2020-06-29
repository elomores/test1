package com.company;

public class Track implements Challenges
{
    private int Length;

    public Track (String name, int length) {

        Length = length;

    }

    public int getLength() {

        return Length;
    }

    public boolean moving(Challengers actions) {
        System.out.println("The road  length is " + this.Length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("run success");

            return true;
        } else {
            System.out.println("run unsuccessfully");

            return false;
        }
    }
}

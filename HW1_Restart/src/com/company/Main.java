package com.company;

public class Main {

    public static void main(String[] args) {

        Challengers[] challengers = new Challengers[3];
        challengers[0] = new Cat ("Bobby", 100, 10);
        challengers[1] = new Human ("Bob", 150, 7);
        challengers[2] = new Robot ("B.O.B", 200, 5);

        Challenges[] challenges = new Challenges[6];

        for (int i = 0; i < challenges.length/2; i++){
            int distance = (int) (Math.random() * 200);
            challenges[i] = new Track("Track " + i, distance);
        }

        for (int i = challenges.length/2; i < challenges.length; i++){
            int height = (int) (Math.random() * 10);
            challenges[i] = new Wall ("Wall " + i, height);
        }

        for (int i = 0; i < challengers.length; i++) {
            boolean result = true;
            for (int j = 0; j < challenges.length; j++) {


                result = challenges[j].moving(challengers[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("unsuccessfully!!");
            }
        }
    }
}

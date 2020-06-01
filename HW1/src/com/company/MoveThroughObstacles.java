package com.company;

import java.util.ArrayList;

public class MoveThroughObstacles {

    public void initialize() {
        Robot T_800 = new Robot();
        Cat Marple = new Cat();
        Human George = new Human();
        Comparison Challenge = new Comparison();
        ArrayList challengers = new ArrayList();

        George.Human_SetHeight(100);
        George.Human_SetLength(60000);

        Marple.Cat_SetHeight(150);
        Marple.Cat_SetLength(45000);

        T_800.Robot_SetHeight(50);
        T_800.Robot_SetLength(100000);

        challengers.add(0, "Cat");
        challengers.add(1, "Human");
        challengers.add(2, "Robot");
        challengers.add(3, Marple.Cat_GetHeight());
        challengers.add(4, George.Human_GetHeight());
        challengers.add(5, T_800.Robot_GetHeight());
        challengers.add(6, Marple.Cat_GetLength());
        challengers.add(7, George.Human_GetLength());
        challengers.add(8, T_800.Robot_GetLength());

        System.out.println(challengers.size());

        Challenge.Compare(challengers, 6, 7);
    }
}

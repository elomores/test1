package com.company;

public class MoveThroughObstacles {

    public void initialize() {
        Robot T_800 = new Robot();
        Cat Marple = new Cat();
        Human George = new Human();
        Walls barriers = new Walls();
        Tracks racetracks = new Tracks();
        Comparison Challenge = new Comparison();

        George.Human_SetHeight(100);
        George.Human_SetLength(60000);

        Marple.Cat_SetHeight(150);
        Marple.Cat_SetLength(45000);

        T_800.Robot_SetHeight(50);
        T_800.Robot_SetLength(100000);

        barriers.SetHeight(7);
        racetracks.SetLength(8);

        Challenge.compare(T_800.Robot_GetHeight(), barriers.GetHeight(), "Robot", "Wall");
        Challenge.compare(Marple.Cat_GetHeight(), barriers.GetHeight(), "Cat", "Wall");
        Challenge.compare(George.Human_GetHeight(), barriers.GetHeight(), "Human", "Wall");
        Challenge.compare(T_800.Robot_GetLength(), racetracks.GetLength(), "Robot", "Road");
        Challenge.compare(Marple.Cat_GetLength(), racetracks.GetLength(), "cat", "Road");
        Challenge.compare(George.Human_GetLength(), racetracks.GetLength(), "Robot", "Road");
    }
}

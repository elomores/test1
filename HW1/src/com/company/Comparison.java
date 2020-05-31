package com.company;

import java.util.*;

public class Comparison {
    public void compare(int a, ArrayList list2, String name1, String name2) {
        for (int i = 0; i < list2.size(); i++) {
            int b = (int) list2.get(i);
            if (a < b){
                System.out.println("The " + name1 + " can't overcome the " + name2 +" of " + b + ". Break!");
                break;
            }
            if (i == 9){
                System.out.println("The " + name1 + " can overcome all obstacles of " + name2 + " type");
            }
        }
    }
}
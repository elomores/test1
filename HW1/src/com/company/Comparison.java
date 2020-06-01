package com.company;

import java.util.*;

public class Comparison {

    Walls a = new Walls();
    Tracks b = new Tracks();

    public void Compare(ArrayList list, int h, int l) {

        ArrayList list2 = new ArrayList();

        for (int i = 0; i < h; i ++){
            a.SetHeight();
            int c = (int) a.GetHeight();
            list2.add(c);
        }
        System.out.println(" ");

        for (int i = 0; i < l; i ++){
            b.SetLength();
            int d = (int) b.GetLength();
            list2.add(d);
        }
        System.out.println(" ");

        for (int i = 3; i < list.size()-3; i++) {
            for (int j = 0; j < h; j++){
                if ((int) list.get(i) < (int) list2.get(j)) {
                    System.out.println(list.get(i - 3) + " couldn't go through the Wall height of witch is " + list2.get(j));
                    break;
                }
                else{
                    System.out.println(list.get(i - 3) + " could go through the Wall height of witch is " + list2.get(j) + ". Congratulations!");
                }
            }
        }

        for (int i = list.size()-3; i < list.size(); i++) {
            for (int j = h; j < list2.size(); j++){
                if ((int) list.get(i) < (int) list2.get(j)) {
                    System.out.println(list.get(i - ((int) list.size() -3)) + " couldn't go through the Track length of witch is " + list2.get(j));
                    break;
                }
                else{
                    System.out.println(list.get(i - ((int) list.size() -3)) + " could through the Track length of witch is " + list2.get(j) + "! Congratulations!");
                }
            }
        }
    }
}

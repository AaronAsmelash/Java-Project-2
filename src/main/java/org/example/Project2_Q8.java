package org.example;

import java.util.ArrayList;

public class Project2_Q8 {
//    You have a list of strings and you want to keep only those that start with
//    “A” and you want to return them in lower case".
public static void main(String[] args) {
    String [] randoms = new String[8];
    randoms [0] = "Aaron";
    randoms [1] = "apple";
    randoms [2] = "Debt";
    randoms [3] = "Rope";
    randoms [4] = "Aruba";
    randoms [5] = "pencil";
    randoms [6] = "Truck";
    randoms [7] = "bomB";
    String as= "SDJFKSN";

    ArrayList<String> list = new ArrayList <String>();
    for (int i = 0; i < randoms.length ; i++) {
        if (randoms[i].contains("a")){

            list.add(randoms[i].toLowerCase());
        }
    }
    System.out.println(list);
}
}

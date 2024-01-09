package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Project2_Q10 {
//    How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(5);
        numList.add(6);
        numList.add(5);
        numList.add(8);
        numList.add(1);
        numList.add(7);
        numList.add(5);

        Set<Integer> set = new HashSet<>(numList);
        ArrayList<Integer> noDupes = new ArrayList<>(set);

        System.out.println("List without duplicates: " + noDupes);
    }
}
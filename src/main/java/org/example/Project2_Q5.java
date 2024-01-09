package org.example;

import java.util.Arrays;
import java.util.Locale;

public class Project2_Q5 {
//    Check if Two Strings are Anagrams: Given two strings, determine if they
//    are anagrams, meaning they contain the same characters in a different order.
//    For example, "listen" and "silent" are anagrams.
public static void main(String[] args) {
    String somebody = "Aaronx";
    String nobody = "Xanora";

    somebody = somebody.toLowerCase();
    nobody = nobody.toLowerCase();

    char [] someArray = somebody.toCharArray();
    char [] noArray = nobody.toCharArray();

    Arrays.sort(someArray);
    Arrays.sort(noArray);

    if (Arrays.equals(someArray,noArray)){
        System.out.println("anagram");
    }else{
        System.out.println("not anagram");
    }
}
}

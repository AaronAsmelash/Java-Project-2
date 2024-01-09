package org.example;

public class Project2_Q3 {
//    Reverse a string: Write a function to reverse a given string.
//    For example, given the input "Hello", the output should be "olleH".
public static void main(String[] args) {
    String word = "HydroChloricAcid";
    String reverseWord = "";
    for (int i = word.length()-1; i >= 0 ; i--) {
        reverseWord = reverseWord + word.charAt(i);
    }
    System.out.println(reverseWord);

    System.out.println("__________________________________________________");
//    For a StringBuilder.
    StringBuilder random = new StringBuilder("HydroChloricAcid");

    StringBuilder modnar =random.reverse();

    System.out.println(modnar);

}
}

package org.example;

public class Project2_Q7 {
//    Count the Number of Words in a String: Write a function to count the
//    number of words in a given string. Words are separated by spaces or
//    punctuation. For example, the input "Hello, world!" should return 2.
public static void main(String[] args) {
    String str = "My name is Ed and I like buttered toast";
    String [] strArray = str.split(" ");
    int count = 0;
    for (int i = 0; i < strArray.length; i++) {
        count++;
    }
    System.out.println(count);
}
}

package org.example;

public class Project2_Q9 {
//    Find the First Non-Repeating Character in a String: Given a string, find and
//    return the first non-repeating character. For example, in the string
//    "abracadabra", the first non-repeating character is 'c'.
    public static char storeRepeats(String n){
        n=n.toLowerCase();
        int [] charCount = new int[255];

        for (int i = 0; i < n.length(); i++) {
            charCount[n.charAt(i)]++;
        }
        for (int i = 0; i < n.length(); i++) {
            if (charCount[n.charAt(i)]==1){
                return n.charAt(i);
            }
        }
        return 0;
    }
public static void main(String[] args) {
    String thing = "excellent";
    char result = storeRepeats(thing);
    System.out.println(result);
}
}

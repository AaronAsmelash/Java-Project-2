package org.example;

public class Project2_Q4 {
//    Check if a String is Palindrome: Determine whether a given string is a
//    palindrome, which means it reads the same forwards and backward. For
//    example, "madam" is a palindrome.
public static void main(String[] args) {
    String thing = "Wakanda";
    String gniht = "";
    for (int i = thing.length()-1; i >=0 ; i--) {
        gniht = gniht + thing.charAt(i);}
        if (gniht.equalsIgnoreCase(thing)){
            System.out.println("Wow, "+ thing+" is palindromatic");
        }else{
            System.out.println("Awwh, "+thing+" is not palindromatic");
        }
    }
}

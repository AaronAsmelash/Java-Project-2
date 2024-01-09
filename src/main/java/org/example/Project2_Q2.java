package org.example;

public class Project2_Q2 {
//    Find out how many alpha characters are present in a string?
public static void main(String[] args) {
    String random = "Ia)*$@#(2MnOtTIReD1637AtAL15L5";
    String alphaRandom = random.replaceAll("[!-@]","");
    System.out.println(alphaRandom); // to verify only alpha characters remain
    System.out.println(alphaRandom.length()); // determines the number of remaining alpha characters
}

}

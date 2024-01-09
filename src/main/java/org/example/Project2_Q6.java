package org.example;

public class Project2_Q6 {
    //    Create a method to count how many vowels are present in a string
//    “documentation”
    public static int countVowel(String word) {
        int count = 0;
        String w = word.toLowerCase();
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'a' || w.charAt(i) == 'e' || w.charAt(i) == 'i' || w.charAt(i) == 'o' || w.charAt(i) == 'u') {
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        String word = "amlkcslvskpvoeuiowoiqrjlewt";
        int vowel = countVowel(word);
        System.out.println(vowel);
    }
}

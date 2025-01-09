package aakash.co.in.vowlcount;


import java.util.Arrays;
import java.util.List;

public class VowelCountInString {
    /*public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }*/
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countVowels("Hello World")); // Output: 3 because o comes two times
    }
}


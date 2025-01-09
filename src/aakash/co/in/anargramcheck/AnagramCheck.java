package aakash.co.in.anargramcheck;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        else
        {
            char[] a1 =s1.toCharArray();
            char[] a2 =s1.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1, a2);
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // Output: true
    }
}


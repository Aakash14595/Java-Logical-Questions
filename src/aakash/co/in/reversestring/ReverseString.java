package aakash.co.in.reversestring;

import java.util.Arrays;

public class ReverseString {
        public static void main(String[] args) {
            System.out.println("Reverse every string in the sentence");
            String str="I am working on microservices using jdk 8";
            String[] arr =str.split(" ");
            for (int i=0;i< arr.length;i++) {
                StringBuilder sb=new StringBuilder(arr[i]);
                arr[i]= sb.reverse().toString();
            }
            System.out.println(Arrays.toString(arr));
            /*String input = "hello";
            StringBuilder reversed = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
            System.out.println(reversed); */ // Output: "olleh"
            /* String s="abc";
        String reverse="";
        for (int i = s.length()-1;i>=0;  i--) {
            reverse=reverse+s.charAt(i);

        }
        System.out.println("reverse  "+reverse);*/


        }
    }



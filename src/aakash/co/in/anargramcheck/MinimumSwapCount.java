package aakash.co.in.anargramcheck;


import java.util.Arrays;

public class MinimumSwapCount {

    // Function to find the minimum number of swaps
    public static int minSwaps(String str1, String str2) {
        // If lengths are different, they cannot be transformed
        if (str1.length() != str2.length()) {
            return -1; // Impossible to transform
        }

        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // If sorted arrays are not equal, they are not anagrams
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (!Arrays.equals(arr1, arr2)) {
            return -1; // Not anagrams, no solution
        }

        // Count the minimum number of swaps needed
        int swapCount = 0;
        char[] strArray = str1.toCharArray();

        // Convert string1 into string2 with minimum swaps
        for (int i = 0; i < strArray.length; i++) {
            // If the character is already in the correct position
            if (strArray[i] == str2.charAt(i)) {
                continue;
            }

            // Find the position of the correct character to swap with
            int j = i;
            while (strArray[j] != str2.charAt(i)) {
                j++;
            }

            // Swap characters at positions i and j
            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;

            // Increase swap count
            swapCount++;
        }

        return swapCount;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        int result = minSwaps(str1, str2);

        if (result == -1) {
            System.out.println("The strings are not anagrams, cannot convert.");
        } else {
            System.out.println("Minimum number of swaps required: " + result);
        }
    }
}


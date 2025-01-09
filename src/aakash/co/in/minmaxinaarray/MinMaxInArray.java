package aakash.co.in.minmaxinaarray;

public class MinMaxInArray {
    public static void findMinMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 2, 8};
        findMinMax(nums); // Output: Min: 2, Max: 8
    }
}


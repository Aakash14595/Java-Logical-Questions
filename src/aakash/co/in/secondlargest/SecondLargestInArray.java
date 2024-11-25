package aakash.co.in.secondlargest;


public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}


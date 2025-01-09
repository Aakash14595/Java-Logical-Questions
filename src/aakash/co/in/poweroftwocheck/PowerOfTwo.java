package aakash.co.in.poweroftwocheck;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        System.out.println((n & (n - 1)));
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));  // Output: true
        System.out.println(isPowerOfTwo(10)); // Output: false
    }
}


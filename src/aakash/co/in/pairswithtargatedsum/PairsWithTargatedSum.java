package aakash.co.in.pairswithtargatedsum;

import java.util.HashSet;
//  array is given need to find out those pairs which have sum 6
public class PairsWithTargatedSum {
    public static void findPairs(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 7, 1, 5};
        findPairs(nums, 6); // Output: (4, 2), (5, 1)
    }
}


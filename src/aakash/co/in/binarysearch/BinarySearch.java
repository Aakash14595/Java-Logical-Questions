package aakash.co.in.binarysearch;


public class BinarySearch {
    // method to find the position of the element in the array using binary search
    public static int binarySearch(int[] nums, int target) {
       int left=0,right=nums.length-1;
       while(left<=right)
       {
           int mid=left+(right-left)/2;
           if(nums[mid]==target)
               return mid;
           else if(nums[mid]<target)
                left=mid+1;
           else
                right=mid-1;

       }
       return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int item=7;
        String result= binarySearch(nums, item)>0?" Item is present at the position "+binarySearch(nums, 7):"Item is not present";
        System.out.println(result);
    }
}


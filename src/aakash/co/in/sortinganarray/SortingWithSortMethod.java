package aakash.co.in.sortinganarray;

import java.util.Arrays;

public class SortingWithSortMethod {
    public static void main(String[] as)
    {
        int[] arr ={1,4,5,3,6,7}  ;
        System.out.println(" Sorted Array is ="+Arrays.toString(SortArray(arr)));
    }
    public static int[] SortArray(int[] arr)
    {
        Arrays.sort(arr);
        return arr;
    }
}

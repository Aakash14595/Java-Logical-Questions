package aakash.co.in.missingnoinarray;

public class MissingNumber {
    public static void main(String[] as)
    {
      int[] arr ={1,3,4,5,6,7}  ;
      int noOfElementsActually=7;
      System.out.println(" Missing No is "+findMissingNoInArray(arr,noOfElementsActually));
    }
    public static int findMissingNoInArray(int[] arr, int n)
    {   int sum=n*(n+1)/2;
        int arrSum=0;
        for (int j : arr) {
            arrSum = arrSum + j;
        }
       return sum-arrSum;
    }
}

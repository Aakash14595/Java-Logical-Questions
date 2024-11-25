package aakash.co.in.fibbonacci;

public class FibonacciRecursion {
    //   0 1 1 2 3 5 8
    public static void main (String as[])
    {
        int n=7;
      System.out.println(" fibonacci series with recursion till n ="+n);

        for (int i = 0; i < n; i++) {
            System.out.println(fib(i)+" ");;
        }


    }
    public static int fib (int n)
    {
        if (n<=1){
            return n;
        }
        else {
            return fib(n-2)+fib(n-1);
        }

    }

}

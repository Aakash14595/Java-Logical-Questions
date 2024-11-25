package aakash.co.in.PalindromCheck;

public class StringPalindrom {
    public static void main(String as[])
    {
        String s="mymym";
        String result=palindromeCheck(s)?"Palindrome":"Not Palindrome";
        System.out.println(s+" IS "+result);
    }
    public static Boolean palindromeCheck(String s)
    {
        for (int front = 0,rear=s.length()-1; front <=rear; front++,rear--) {
            if (s.charAt(front) == s.charAt(rear))
            {
                return  true;
            }
        }
        return  false;
    }


}

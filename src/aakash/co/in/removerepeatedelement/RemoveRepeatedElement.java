package aakash.co.in.removerepeatedelement;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveRepeatedElement {

    public static void  main(String as[])
    {
        ArrayList <Integer> al= new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(2);
        al.add(1);
        System.out.println(" unsorted list with repeated elements :"+al);
        TreeSet<Integer> st= new TreeSet<>(al);
        ArrayList <Integer> alsorted= new ArrayList<>(st);
        System.out.println(" sorted list without repeated elements :"+alsorted);



    }


}

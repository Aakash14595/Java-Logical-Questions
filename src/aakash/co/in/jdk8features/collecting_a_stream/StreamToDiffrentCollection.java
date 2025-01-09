package aakash.co.in.jdk8features.collecting_a_stream;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToDiffrentCollection extends AllCollection{
    public static void main(String as[]){
       streamWithList() ;
       streamWithArray();
       streamWithStrings();
       streamWithStrings2();
       addDataIntoMap();
       //streamWithMaps();
    }
    public  static void streamWithList()
    {
        System.out.println("Strem with List =========>>>>");
        List<Integer> ll = l.stream().collect(Collectors.toList()) ;
         System.out.println(ll);    
    }
    public  static void streamWithArray()
      {
          System.out.println("Strem with Arrays =========>>>>");
          int arr[] = Arrays.stream(ar).toArray();

          Arrays.stream(ar).boxed().collect(Collectors.summingInt(vv->vv.intValue()));
          System.out.println(Arrays.toString(arr));

    }
    public  static void streamWithStrings()
    {
        String str="my name is aakash";
        System.out.println("Strem with Strings =========>>>>");
        System.out.println("<<<<<=========Charqacter count with string =========>>>>");
        Stream<Character> characterStream=str.chars().mapToObj(c->(char)c);// here we will get ascii values from chars then we are converting it to stream of Character
        Map<Character,Long > characterLongMap=characterStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        characterLongMap.forEach((k,v)->System.out.println(k+"  : "+v));
    }
    public  static void streamWithStrings2()
    {
        String str="my name is aakash";
        //String rev;
        System.out.println("Stream with Strings =========>>>>");
        System.out.println("<<<<<=========reverse  every  word inside string =========>>>>");
        //List<String>ll=Arrays.stream(str.split(" ")).map(ss->new StringBuilder(ss).reverse().toString()).collect(Collectors.toList());
        Map <String,Integer> hm=new HashMap<>();
        Arrays.stream(str.split(" "))
                .forEach(ss->hm.put(new StringBuilder(ss).reverse().toString(),ss.length()));

        System.out.println(hm);
    }
    /*public  void streamWithMaps()
    {
        // there is no stream method available for Map to convert it inot a stream
        System.out.println("Stream with map =========>>>>");
        System.out.println("Find fruits with its colours =========>>>>");
        Map<String, Set<String>>frc=Stream.of(mapOfFruits).forEach(mm->mm.computeIfPresent(mm.get(k)));

    }*/
}


package aakash.co.in.jdk8features.groupby;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithGroupByImplementation {
    public static void groupByStringLength(String str){
        Map<Integer, List<String>> mp= Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::length));//groupingBy(a->a.length())
        mp.forEach((k,v)->System.out.println(k+"  : "+v));

    }
    public static void groupByStringCount(String str){
        Map<String,Long> mp=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        mp.forEach((k,v)->System.out.println(k+"  : "+v));

    }
    public static void groupByCharacterCount1(String str){
        Map<Character,Long> mp=str.chars()// we get here ascii values of character
                .mapToObj(c->(char)c).filter(character -> !Character.isWhitespace(character)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        mp.forEach((k,v)->System.out.println(k+"  : "+v));

    }
    public static void groupByCharacterCount2(String str){
        Map<String,Long> mp=Arrays.stream(str.split(""))// we get here ascii values of character
                .filter(ch -> !ch.equals(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        mp.forEach((k,v)->System.out.println(k+"  : "+v));

    }

}

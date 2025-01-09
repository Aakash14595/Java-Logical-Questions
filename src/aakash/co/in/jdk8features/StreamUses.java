package aakash.co.in.jdk8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUses {
    public static void main(String as[]) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        /* INTERMEDIATE OPERATION*/

        // converting a array to stream
        String[] arr={"a","b","c"};
        Stream<String > stream=Arrays.stream(arr);
        stream.forEach(System.out::println);//(t->System.out.println(t))

        // map use
        Arrays.stream(arr).map(data->data+"yyy").forEach(System.out::println);//(t->System.out.println(t))
        // sort stream elements
        String[] arr1={"c","b","a","b"};
        Arrays.stream(arr1).sorted().forEach(System.out::println);//.forEach(t->System.out.println(t)
       // find distinct stream elements
        Arrays.stream(arr1).distinct().forEach(System.out::println);

        /* TERMINAL OPERATION*/

        // converting a collection to stream
        Stream<Integer> strm = numbers.stream();
        List<Integer> numbers1 =strm.filter(a->a>2).collect(Collectors.toList());
        // converting a stream to collection
        System.out.println("no which are greater than 2    "+numbers1);

        // reduce: Combines elements to produce a single value
        System.out.println("reduce  "+numbers.stream().reduce(Integer::sum));
        // count
        System.out.println("count  "+(long) numbers.size());
        // find first
        System.out.println("find first  "+numbers.stream().findFirst());

        // All Match
        System.out.println("All Match  "+numbers.stream().allMatch(t->t==2));

        // Any Match
        System.out.println("Any Match  "+numbers.stream().anyMatch(t->t==2));

        // None Match
        System.out.println("None Match  "+numbers.stream().noneMatch(t->t==2));


       

    }
}

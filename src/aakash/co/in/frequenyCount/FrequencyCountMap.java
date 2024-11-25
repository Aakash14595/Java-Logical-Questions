package aakash.co.in.frequenyCount;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCountMap {
    public static  void  main(String as[])
    {
        String str="aakash is good";
        // one way of doing
        Map<Character,Integer> mm=new HashMap<>();
        for (char ch:str.toCharArray()) {
          if (ch!=' '){
              mm.put(ch, mm.getOrDefault(ch,0)+1);
          }
        }
        mm.forEach((k,v)->System.out.println(k+"  : "+v));


         // one way of doing
       /* Map<Character,Long> frequencyMap=str.chars()
                .filter(ch->ch!=' ')
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(chn->chn,Collectors.counting()));
        frequencyMap.forEach((k,v)->System.out.println(k+" : "+v));*/







    }
}

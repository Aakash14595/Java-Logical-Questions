import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main  (String[] as)
    {
        String str="I am working on microservices using jdk 8";
        HashMap<String,String> hm= new HashMap<>();
        hm.put("1","abc");
        hm.put("2","abc");
        hm.put("3","abc");
        Map hm1= hm.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(hm1);


    }


}

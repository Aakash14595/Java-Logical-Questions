package aakash.co.in.jdk8features.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamsWithGroupBy extends StreamWithGroupByImplementation {
    public static void main(String[] as){
        String str1="my name is aakash";
        String str2="my name is aakash my name is vikas";
        String str3="my name is aakash my name is vikas";
        /*  2  : [my, is]
            4  : [name]
            6  : [aakash]*/
        groupByStringLength(str1);
    /*  aakash  : 1
        name  : 2
        vikas  : 1
        is  : 2
        my  : 2 */
        groupByStringCount(str2);
        groupByCharacterCount1(str1);
        groupByCharacterCount2(str1);




        }

    }


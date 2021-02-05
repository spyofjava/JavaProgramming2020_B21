package day54_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Uniques_Duplicates {
    public static void main(String[] args) {

        String str = "aabcccdee";
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")),each);

            if (f > 1){
                map.put(each,f);
            }
        }

        System.out.println( map);


/*
Warmup task:
    1. write a program that stores the duplicated characters from a string into a map

            Ex:
                str = "aabcccdee";
                output:
                    {a=2, c=3, e=2}
    2. write a program that stores the unique characters from a string into a map

            Ex:
                str = "abacbdeef";
                output:
                    {c=1, d=1, f=1}
 */



    }
}

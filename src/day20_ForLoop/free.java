package day20_ForLoop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class free {

    public static void main(String[] args) {

        System.out.println(clean("one two three","two"));
    }



    public static String clean (String text ,String badWord) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList(text.split(" ")));
        list.removeAll(Arrays.asList(badWord));
        return list.toString().substring(1).replace(",","").replaceFirst("]","");



    }



}

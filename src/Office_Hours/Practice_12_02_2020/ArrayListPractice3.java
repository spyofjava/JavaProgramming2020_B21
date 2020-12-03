package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> list2 = list1; //same room different door
        ArrayList<Integer> list3 = list2; //same room different door
        ArrayList<Integer> list4 = list3; //same room different door

        list2.add(25);
        System.out.println(list2);
        System.out.println(list1);

        list1.removeIf(p->p<5);
        System.out.println(list1);
        System.out.println(list2);


        System.out.println(list1==list3);//true
        System.out.println(list1==list4);//true
        System.out.println(list2.equals(list4));//true




    }
}

package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.isEmpty());
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        System.out.println(list1.isEmpty());

        System.out.println("+=====================");
        int lastIndex = list1.size() - 1;
        System.out.println(list1.get(lastIndex));
        System.out.println(list1.get(list1.size() - 1));// to get last index
        System.out.println("+=====================");

        int n1 = list1.get(lastIndex);
        System.out.println(n1);
        System.out.println("+=====================");

        list1.set(3, 400);
        System.out.println(list1);

        Integer[] arr2 = {100, 200, 300, 400, 500, 600};
        list1.addAll(Arrays.asList(arr2));//for non primitive array
        System.out.println(list1);

        int[] arr3 = {1000, 2000, 3000, 4000};
        for (int each: arr3) list1.add(each);//for primitive array
        System.out.println(list1);

        // to verify if 10000 is contained in arraylist
        System.out.println(list1.contains(10000));
        System.out.println(list1.indexOf(10000) >= 0);

        list1.clear();
        System.out.println(list1.isEmpty());
        list1.addAll(Arrays.asList(-1,-2,-3,-4,-5));
        System.out.println(list1);
        System.out.println(list1.indexOf(5));
        System.out.println(list1.indexOf(3));
        System.out.println(list1.indexOf(2));


        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(-1,-2,-3,-4,-5));
        System.out.println(list2);


        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));//true




        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(-1,-3,-4,-2,-5));

        System.out.println(list2.equals(list3));//false because it checks index by index to two array

        Collections.sort(list2);//[-1,-2,-3,-4,-5]
        Collections.sort(list3);//[-1,-2,-3,-4,-5]

        System.out.println(list2.equals(list3));





    }
}

package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

// containsAll
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        // verify if 10 is contained in the list
        boolean r1 = list.contains(10);

        // verify if 10, 30, 50 & 60 all are contained in the lost
        boolean r2 = list.contains(10) && list.contains(30) && list.contains(50) && list.contains(60);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2); // false

        // verify if 10, 30, 50 & 60 all are contained in the lost
        boolean r3 =    list.containsAll(   Arrays.asList( 10, 30, 50, 60 )   );
        System.out.println(r3);

        ArrayList<String> group1 =  new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Svetlana");
        group1.add("Ahmed");
        group1.add("Ercan");

        // Ahmed, Ercan, Biden

        boolean r5 =  group1.containsAll(  Arrays.asList("Ahmed", "Ercan", "Biden")  );

        System.out.println("r5 = " + r5);

        // Mohammed, Ahmed, Svetlana
        boolean r6 = group1.containsAll(  Arrays.asList( "Mohammad", "Ahmed", "Svetlana")  );
        System.out.println("r6 = " + r6);

        System.out.println("======================================================");
        // addAll()

        ArrayList<Character> chars = new ArrayList<>();  //A, Z, C, B, H, I, K
        chars.addAll(  Arrays.asList('A', 'Z', 'C', 'B', 'H', 'I', 'K')  );

        System.out.println(chars);

        String[] names = {"Mustafa", "Numan", "Abdullah","Inna", "Emre", "Sinan","Ramiz","Olesea","Irina"};

        ArrayList<String> students = new ArrayList<>( Arrays.asList(names) );

        // students.addAll( Arrays.asList(names)  );

        System.out.println(students);




    }
}

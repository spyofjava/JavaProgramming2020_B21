package day30_ReturnMethods;

import library.*;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String str = "Level";

        String reversedName = StringUtility.reverse(str);
        System.out.println( str.equalsIgnoreCase(reversedName)  );


        String str2 = "aaabbbbbccccccdddddeeeeee";

        String result2 = StringUtility.removeDuplicates(str2);
        System.out.println(result2);

        String str3 = "aabcccdeee";

        String result3 = StringUtility.unique(str3);
        System.out.println(result3);

        System.out.println("==========================================");

        int[] array = {1, 0, -2, 30, 40, 500, -20, -50};


        int[] descending = ArraysUtility.sort(array);

        System.out.println(Arrays.toString(descending)  );
        System.out.println( ArraysUtility.printArray(descending)  );

        System.out.println("======================\n\n");

        int a = deneme.max(array);
        System.out.println(a);

        int b= deneme.min(array);
        System.out.println(b);


        int f=deneme.Faktorial();
        System.out.println(f);


        int d=deneme.total(3,67);
        System.out.println(d);

        double av=deneme.average();
        System.out.println(av);

        String t=deneme.reverse("how are you");
        System.out.println(t);

        int [] arr={1,2,3,4,5};
        int[] v=deneme.decending(arr);
        System.out.println(Arrays.toString(v));


    }
}

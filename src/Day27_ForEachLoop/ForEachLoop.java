package Day27_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {


        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("================");

        for (String each : names) {
            System.out.println(each);
        }
        System.out.println("================");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int countEven = 0;
        int countOdds = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdds++;
            }
        }
        System.out.println("even: " + countEven);
        System.out.println("odd : " + countOdds);


        System.out.println("====================");

        int[] scores = {45, 65, 87, 12, 60, 90};

        int max = scores[0];
        int min = scores[0];
        for (int each : scores) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("max: " + max);
        System.out.println("Min: " + min);


    }
}

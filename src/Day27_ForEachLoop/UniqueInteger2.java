package Day27_ForEachLoop;

public class UniqueInteger2 {
    public static void main(String[] args) {

        int[] arr={1,1,2,3,3,4,1};
        for (int each2:arr) {//how many time 1 ocuured in the array
            int frequency = 0;// is the frequency of each2
            for (int each : arr) {
                if (each == each2) {
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(each2+" ");
            }
        }


    }
}

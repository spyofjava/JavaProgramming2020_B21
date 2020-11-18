package DailyExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }




        if(size==1){
            System.out.println(Arrays.toString(nums));
        }else {
            int[] nums2 = new int[nums.length];
            for (int i = 0, j = 1; i < nums.length - 1; j++, i++) {
                nums2[i] = nums[j];
                if (j == nums2.length - 1) {
                    nums2[j] = nums[0];
                }
            }
            System.out.println(Arrays.toString(nums2));

        }



    }
}

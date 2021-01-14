package DailyExercise;

public class Empty {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                        System.out.print("*");
                        if (i == 0 && j == 3) {
                            System.out.print("*       *");
                            for (int k = 0; k < 4; k++) {
                                System.out.print("*");
                            }
                        } else if (i == 1 && j == 3) {
                            System.out.print(" *     * ");
                            for (int k = 0; k < 4; k++) {
                                System.out.print("*");
                            }
                        } else if (i == 2 && j == 3) {
                            System.out.print("  *   *  ");
                            for (int k = 0; k < 4; k++) {
                                System.out.print("*");
                            }
                        } else if (i == 3 && j == 3) {
                            System.out.print("    *    ");
                            for (int k = 0; k < 4; k++) {
                                System.out.print("*");
                            }
                        }else if (i>3 && j==3){
                                System.out.print("         ****");

                        }
Thread.sleep(200);

                    }
                    System.out.println();
                }


    }

}

/*

/*
         *   *   *
      *            *
    *                *
   *                  *
  *                    *
   *                   *
    *                 *
      *             *
         *   *   *

 */



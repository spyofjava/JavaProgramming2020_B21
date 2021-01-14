package DailyExercise;

public class Empty2 {

    public static void main(String[] args) throws InterruptedException {

        location(10);



    }

    public static void location(int a) throws InterruptedException {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 22; j++) {
                      if (i == 0 && j >= 7  && j <= 15){
                    System.out.print("*");
                }else if (i == 1 && j >= 4  && j <= 17){
                    System.out.print("*");
                }else if (i == 2 && j >= 2  && j <= 19){
                    System.out.print("*");
                }else if (i == 3 && j >= 1  && j <= 20){
                    System.out.print("*");
                }else if (i == 4 && j >= 0  ){
                    System.out.print("*");
                }else if (i == 5 && j >= 1  && j <= 20){
                    System.out.print("*");
                }else if (i == 6 && j >= 2  && j <= 19){
                    System.out.print("*");
                }else if (i == 7 && j >= 4  && j <= 17){
                    System.out.print("*");
                }else if (i == 8 && j >= 7  && j <= 15){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }


    }


}

/*

       *   *   *
    *            *
  *                *
 *                  *
*                    *
 *                  *
  *                *
    *            *
      *   *   *
 */



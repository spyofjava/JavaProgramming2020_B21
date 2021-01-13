package DailyExercise;

public class Empty {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i <10 ; i++) {
            for (int j = -80; j <= i ; j++) {
                if (i!=j*j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }








        /*
        for (int x = 0; x < 6; x++) {

            for (int y = 0; y < 20; y++) {

                if (y==(x-2)*(x-2)-4){
                    System.out.println("*");
                    break;
                }
                Thread.sleep(100);
            }
        }


         */

    }

}

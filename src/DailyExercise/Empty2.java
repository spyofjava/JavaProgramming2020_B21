package DailyExercise;

public class Empty2 {

    public static void main(String[] args) throws InterruptedException {

        for (int x = 0; x <10 ; x++) {
            //location(x,(x-2)*(x-2)-4);
            location(x,x);
        }


    }

    public static void location(int a,int b) throws InterruptedException {

        for (int y = 0; y < 100; y++) {
            for (int x = 0; x <= a; x++) {
                if (x == b && y==a) {
                    System.out.print("."+"("+x+","+y+")");
                    break;
                } else {
                    System.out.print(" ");

                }

               // Thread.sleep(10);
            }

            System.out.println();
        }
    }


}



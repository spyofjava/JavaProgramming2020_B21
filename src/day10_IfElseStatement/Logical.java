package day10_IfElseStatement;

public class Logical {
    public static void main(String[] args) {



        boolean r2="Muhtar"=="Good Guy"||"Muhtar"=="Bad Guy";
                    //false             ||  true
                    // false
        System.out.println("r2: "+r2);


        boolean r3='a'!='A'||'B'=='B';
                // true   || true
                //true
        System.out.println("r3: "+r3);

        boolean r4= 200>100||200<300;
                  // true  ||  true
                 // true
        System.out.println("r4: "+r4);

        boolean r5=true&&false;
                //true ||    false
                //false
        System.out.println("r5: "+r5);

    }
}

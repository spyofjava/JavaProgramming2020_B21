package day18_StringContinue;

public class String_Practice {
    public static void main(String[] args) {


        String s1="Cat";// in poll
        String s2="Cat";// in pool
        System.out.println(s1==s2);//true

        String s3=new String("Cat");

        System.out.println(s1==s3);//false

        System.out.println(s2==s3);//false


        String s4=new String("Cat");
        System.out.println(s4==s3);//false

        //.equals()
        System.out.println( s1.equals(s3) ); // true
        System.out.println( s2.equals(s3) ); // true
        System.out.println( s3.equals(s4) ); // true

        String s5=new String("Cat");
        System.out.println(s3.equals(s4));//true method is case sensitive
        System.out.println(s4.equals(s5));//true is not case sensitive
        System.out.println("===============================================");

        //.toUpperCase
                String str="cybertek";

                str.toUpperCase();//"CYBERTEK"
        System.out.println(str);

                str.toUpperCase();
        System.out.println(str);
        System.out.println("===============================================");

        String name="CybertekSchool";

        int n1=name.length();//14
                                //last index:13
        System.out.println(n1);

        String name2="Muhtar";
        //            012345

        int n2=name2.length();//6
                            //last index :5

        int lastIndex=name2.length()-1;
        System.out.println(n2);
        System.out.println(lastIndex);

        System.out.println("===============================================");
        String a = "Java Programming Language";

        char firstChar = a.charAt(0);
        char lastChar = a.charAt( a.length()-1 );
        //       last index num of a

        System.out.println("First character: "+firstChar);
        System.out.println("Last character: "+lastChar);

        System.out.println("======================================");

        String b = "Today is Monday, and it's fun";
        System.out.println(b);
        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt( b.length()-2);

        System.out.println("secondChar = " + secondChar);
        System.out.println("secondLastChar = " + secondLastChar);

        System.out.println("======================================");








    }
}

package DailyExercise.Inheritance.Family;

public class FamilyObject {


    public static void main(String[] args) {

        Ibrahim ibrahim = new Ibrahim("Software Developer", 'M', 37, 12345600, true);
        Sabiha sabiha=new Sabiha("Housewife", 'F', 33, 1234560001, false);
        MuhammetTaha muhammetTaha=new MuhammetTaha("Student", 'M', 9, 132456002, true);
        SareMeliha sareMeliha=new SareMeliha("Baby", 'F', 2, 123456003,false);
        System.out.println("ibrahim.age = " + ibrahim.age);
        System.out.println("sabiha.age = " + sabiha.age);
        System.out.println("ibrahim.student() = " + ibrahim.student());
        System.out.println(ibrahim);
        System.out.println(sabiha);
        System.out.println(sareMeliha);
        System.out.println(muhammetTaha);


    }
}

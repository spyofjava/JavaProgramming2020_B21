package day43_Inheritance.calisma.calisma2;

public class hayvan2 {
    public  String name;
    String eat;


    public hayvan2(String name, String eat) {
        this.name = name;
        this.eat = eat;
    }


    @Override
    public String toString() {
        return "hayvan2{" +
                "name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }


}

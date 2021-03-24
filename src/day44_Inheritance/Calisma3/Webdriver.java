package day44_Inheritance.Calisma3;

public class Webdriver {

    public String name , version;


    public Webdriver(String name, String version) {
        this.name = name;
        this.version = version;
    }


    @Override
    public String toString() {
        return "Webdriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

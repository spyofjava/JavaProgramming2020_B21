package day44_Inheritance.WebDriverTask;

public class WebDriver {
    public String  name,version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;

    }

    public void get(String URL){
        System.out.println("Oppening the default driver");
    }

    public  void close(){
        System.out.println("Closing the Remote driver");
    }


    public void maximize(){
        System.out.println("Maximizing the Remote driver");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
/*
create a class called RemoveWebDriver
            name, version
            add a constructor to set the instances
            get(URL), maximize(),close()

 */
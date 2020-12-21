package day44_Inheritance.WebDriverTask;

public class CybertekDriver  extends WebDriver{

    public CybertekDriver() {
        super("Cybertek Browser","V85.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Oppening "+URL+" from Cybertek driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Cybertek driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Cybertek driver");
    }


}

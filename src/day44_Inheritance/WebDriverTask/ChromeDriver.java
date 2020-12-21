package day44_Inheritance.WebDriverTask;
                                //super class construtor
public class ChromeDriver extends WebDriver {

    public ChromeDriver() {
        super("Chrome Browser","V84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Oppening the chrome driver");;
    }

    @Override
    public void close() {
        System.out.println("Closing  chrome driver");
    }

    @Override
    public void maximize() {
       super.maximize();
        // System.out.println("Maximizing  chrome driver");
    }
}

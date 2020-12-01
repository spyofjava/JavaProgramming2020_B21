package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmup {
    public static void main(String[] args) {
        String[] countryName={"Andorra","United Arab Emirates","Afghanistan","Turkey","United States","Antigua and Barbuda","Albania","Colombia","Venezuella","Panama","United Kingdom","Mexico"};

        ArrayList<String> countries=new ArrayList<>(Arrays.asList(countryName));
        System.out.println(countries);

        countries.removeIf(p-> p.length()>=10);
        System.out.println(countries);

        System.out.println("=============================");







    }
}

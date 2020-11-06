package Day27_ForEachLoop;

public class ReverseString {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for (String eachNames:names) {
            String reversedName = "";
            for (int i = eachNames.length() - 1; i >= 0; i--) {
                reversedName += eachNames.charAt(i);
            }
            System.out.println(reversedName);
        }



    }
}

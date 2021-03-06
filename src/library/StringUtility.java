package library;

public class StringUtility {

    public static int frequency(String str, char ch){
        int count = 0;

        for(char each  : str.toCharArray() ){    //each: [a, a, a, b, c]
            if(each == ch){
                count++;
            }
        }
        return count;
    }


    public static String unique(String str){
        String unique = ""; // "eg"
        for(int i=0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each character of the string
            int count = frequency(str,  each);  // finding teh frequency of every single char from str

            if( count == 1){
                unique += each;
            }
        }
        return unique;
    }


    public static String reverse(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }


    public static String removeDuplicates(String str){
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        return result;
    }


    public static int frequencyOfWord(String sentence,String word){
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();

        int frequency=0;

        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            frequency++;
        }
        return frequency;
    }

    public  void deleteDigits(String e) {

        int i = 0;
        String result="";
        while (i < e.length()) {
            if (!Character.isDigit(e.charAt(i))) {
                result+=""+e.charAt(i);
            }
            i++;
        }
        System.out.println(result);

    }


}

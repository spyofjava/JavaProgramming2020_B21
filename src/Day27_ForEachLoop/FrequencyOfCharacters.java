package Day27_ForEachLoop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String[] str={"a","b","c","a","b","b"};

        int count=0;
        for (String each:str){
            count=0;
            for (int i=0;i<str.length;i++){
                if (str[i]==each) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println(each);
            }
        }


    }
}

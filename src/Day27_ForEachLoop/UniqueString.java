package Day27_ForEachLoop;

public class UniqueString {
    public static void main(String[] args) {

        String[] str={"C#","C#","Java","Python","Python","C++"};

        for (int i=0;i< str.length;i++){
            int count=0;
            for (int j=0;j< str.length;j++){

                if (str[i].equals(str[j])){
                    count++;
                }
            }
            if (count==1){
                System.out.print(str[i]+" ");
            }

        }




    }
}

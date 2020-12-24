package day41_Encapsulation;
///////////////////////////////////////  ----  3  ----  /////////////////////////
public class Credentials_3 {

    private String userName = "cybertek";
    private double passWord = 1234;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPassWord() {
        return passWord;
    }

    public void setPassWord(double passWord) {
        this.passWord = passWord;
    }

//    public String getUserName() {
//        return userName;
//    }

//    public double getPassWord() {
//        return passWord;
//    }

//    public void setUserName(String userName) {
//        /*
//        if(userName.length() < 8){
//            return;
//        }
//                we can also do security check in setter of Encapsulation
//         */
//        this.userName = userName;
//    }

//    public void setPassWord(double passWord){
//        this.passWord = passWord;
//    }


}

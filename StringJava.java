import java.util.*;
//Get string input from user
class StringJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            str2 =str.charAt(i)+str2 ;
        }
        System.out.println(str2);
    }
}
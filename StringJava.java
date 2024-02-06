import java.util.*;
//Reverse the string 
class StringJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "Rushikesh Tekale";
        //It will give the range of string from 2 to 8 insted of 2 to 9
        System.out.println(str.substring(2, 9));
    }
}
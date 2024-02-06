import java.util.*;
//Reverse the string 
class StringJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = "Rushikesh Tekale";
        String str2 = "Tekale";
        
        //str1 is the string in which you want to search for str2.
        //str2 is the substring that you want to find within str1.
        //It will compre str2 in str1 and return the first index of the str2
        System.out.println(str1.indexOf(str2));
    }
}
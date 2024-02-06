import java.util.*;
//Reverse the string 
class StringJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = "Rushikesh Tekale";
        String str2 = "Tekale";
        
        //If str1 is lexicographically greater than str2, it returns a positive integer.
        //If str1 is lexicographically less than str2, it returns a negative integer.
        //If str1 and str2 are equal lexicographically, it returns 0.
        System.out.println(str1.compareTo(str2));
    }
}
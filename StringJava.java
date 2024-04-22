import java.util.*;
//Contat two string without any space
class StringJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strign: ");
        String str = sc.nextLine();
        String str2="";
        for(int i=str.length()-1; i>=0; i--){
                str2 = str2+str.charAt(i);
        }   
        System.out.println("Reversed String is: " + str2);
    }
}
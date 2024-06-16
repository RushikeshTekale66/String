/**
 * StringJava
 */
public class StringJava {

    // remove the white spaces from string
    public static void main(String [] args){
        String str = "a b c d f  A  B  C  D  F";
        
        // remove the white space form string
        String newString = str.replaceAll("\\s", "");
        System.out.println("New String : " + newString);

        String str2 = "        a      b     ";
        System.out.println("Original String : " + str2);
        // Trim method remove the white spaces from both the end of the string
        System.out.println("Trim String : " + str2.trim());
    }
}
/**
 * StringJava
 */
public class StringJava {

    // remove the special characters form the string
    public static void main(String [] args){
        String str = "sifn<>!@$@dfinf@#$@#kdfnQAAd#$#$23131313131";
        // Replace the character other than [^a-zA-Z0-9]
        String newSTring = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(newSTring);
    }
}
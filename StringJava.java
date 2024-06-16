import java.util.*;

/**
 * StringJava
 */
public class StringJava {

    // remove duplicate character from string
    public static void main(String [] args){
        String str = "AABBCCDDaabbccdd";

        // Approach 1 using String builder
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println("Using String builder : " + sb1);

        // Approach 2 using indexOf() method
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i+1);
            if(index==-1){
                sb2.append(ch);
            }
        }
        System.out.println("Using IndexOf() method : "+sb2);

        // Approach 3 converting string string in charArray
        StringBuilder sb3 = new StringBuilder();
        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            boolean repited = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    repited = true;
                    break;
                }
            }
            if(!repited){
                sb3.append(arr[i]);
            }
        }
        System.out.println("Using toCharArray() : "+ sb3);

        // Approach 4 using set interface
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        for(Character c : set){
            sb4.append(c);
        }
        System.out.println("Using set interface : "+ sb4);

    }
}
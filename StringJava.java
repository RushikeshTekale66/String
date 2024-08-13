public class StringJava
{
	public static void main(String[] args) {
	    String s1 = "Rushikesh";
	    String s2 = "Tekale";
	    
// 		length of the String
		System.out.println("Length of the String is " + s1.length());
		
		//Characte at that index
		System.out.println("Charactet at index 1 is " + s1.charAt(1));
		
		//Convert to uppercase
		System.out.println("Upper case : " + s1.toUpperCase());
		
		//Convert to lowercase
		System.out.println("Lower case : " + s1.toLowerCase());
		
		//Add to Strings 
		System.out.println("Concatinated String 1 : " + (s1.concat(s2)));
		
		//Specific String in current String
		System.out.println("rush is prent in string : " + s1.contains("ushi"));
		System.out.println("rush is prent in string1 : " + s1.contains("Rushi"));
		
		//Check All string present in current string
		System.out.println("Rushikesh is present in String : " + s1.contentEquals("Rushikesh"));
		System.out.println("Rushikesh is present in String1 : " + s1.contentEquals("Rush"));
		
		//Check the String starts with
		System.out.println("String starts with 'R' : "+ s1.startsWith("R"));
		System.out.println("String starts with 'T' : "+ s1.startsWith("T"));
		
		//Check the String ends with 
		System.out.println("String ends with 'h' : " + s1.endsWith("h"));
		System.out.println("String ends with1 'R'  : " + s1.endsWith("R"));
		
		//HashCode of String
		System.out.println("HashCode of String : " + s1.hashCode());
		System.out.println("HashCode of String : " + s2.hashCode());
		
		//Check the index of Character
		System.out.println("Index of 'r' : " + s1.indexOf('R'));
		System.out.println("Index of 'r' 1 : " + s1.indexOf('r'));
		
		//Check String is empty or contains some Character
		System.out.println("String is Empty " + s1.isEmpty());
		
		//Check the last index of Character or String in String
		System.out.println("Last index is : " + s1.lastIndexOf("h"));
		
		//Replace th character in String
		System.out.println("Replaced String " + s1.replace('R', 'r'));
		System.out.println("Replaced String 2 : " + s1.replace("rushi", "Rushi"));
		
		//Replace first occurance
		String rs = "Rushikesh Rushikesh Rushikesh";
		System.out.println("Replace first occurance " + rs.replaceFirst("Rushikesh", "rushi"));
		
		//Replace all occurance
 		String rsa = "Rushikesh Rushikesh Rushikesh";
 		System.out.println("Replace All occurance " + rsa.replaceAll("Rushikesh", "rushi"));
		
		//Splites the String
		String [] splitedS = s1.split("h");
		System.out.println("Splited String is " + splitedS[0]);
		
		
		//Convert the string in to array
		char [] toChar = s1.toCharArray();
		System.out.println("Char Arrays : " + toChar[0]);
		
		//Println the specified part in the string
		System.out.println("Print String from 1-4 : " + s1.substring(1, 4));
		
		//Println the specified part in the String
		System.out.println("SubSequence of String is 1-4 : " + s1.subSequence(1, 4));
		
		//Remove the Starting & Ending white spaces
		String sTrim = "   Rushikesh   ";
		System.out.println("Trimmed String is : " + sTrim.trim());
		
	}
}

import java.util.Scanner;
class StringJava{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check");
		String name = sc.next();
		name = name.toLowerCase();
		int count = 0;

		//Traditional
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
				count++;
			}
		}
		System.out.println("Count of Vovel is " + count);


		//Advance Option		
		String vovel = "aeiou";
		int count2 = 0;
		for(int i=0; i<name.length(); i++){
			for(int j=0; j<vovel.length(); j++){
				if(name.charAt(i)==vovel.charAt(j)){
					count2++;
				}
			}
		}	
		System.out.println("Count of vovel : " + count2);
	}
}
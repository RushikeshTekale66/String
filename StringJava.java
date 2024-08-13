import java.util.Scanner;
class CountEachVovel{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check");
		String name = sc.next();
		name = name.toLowerCase();
	
		String vovel = "aeiou";
		for(int i=0; i<vovel.length(); i++){
			int count2 = 0;
			for(int j=0; j<name.length(); j++){
				if(name.charAt(j)==vovel.charAt(i)){
					count2++;
				}
			}
		System.out.println("Count of vovel " + vovel.charAt(i) + " is " + count2);
		}	
	}
}
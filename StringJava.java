import java.util.Scanner;
class StringJava{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check");
		String name = sc.next();
		System.out.println("Enter the character to check");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i)==ch){
				count++;
			}
		}
		System.out.println("Count of Char is " + count);
	}
}
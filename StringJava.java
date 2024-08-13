import java.util.Scanner;
class StringJava{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check");
		String name = sc.next();
		
		//1 
		for(int i=name.length()-1; i>=0; i--){
			System.out.print(name.charAt(i));
		}
		System.out.println();

		//2
		String name2 = "";
		for(int i=0; i<name.length(); i++){
			name2 = name.charAt(i) + name2;
		}
		System.out.println(name2);
	}
}
import java.util.Scanner;
class StringFava{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check");
		String str = sc.nextLine();

		String ch[] = str.split(" ");
		// it will convert array as ch = {"Rushikesh", "Ramesh", "Tekale"};
		
		for(int i=ch.length - 1; i>=0; i--){
			System.out.print(ch[i] + " ");
		}
	}
}
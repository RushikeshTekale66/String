class StringJava{
	public static void main(String[] args) {
		String str = "adcABC123!@#abcABC!@#$%^&*";
		
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
	}
}
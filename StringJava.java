class StringJava{
	public static void main(String[] args) {
		String str = "adcABC123!@#abcABC!@#$%^&*";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after replacing special character : " + str);
		
	}
}
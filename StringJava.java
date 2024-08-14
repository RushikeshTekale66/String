class RemoveSpecialChar{
	public static void main(String [] args){
		String str = "abcdABCD!@#$1234";
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
	}
}
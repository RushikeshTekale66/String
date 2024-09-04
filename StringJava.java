class StringJava{
	public static void main(String[] args) {
		System.out.println("String literal-------------------------------");
		String s1 = "Rushikesh";
		String s2 = "Rushikesh";

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		System.out.println("String class (new keyword) ------------------");
		String ss1 = new String("Rushikesh");
		String ss2 = new String("Rushikesh");

		System.out.println(ss1 == ss2);
		System.out.println(ss1.equals(ss2));

		System.out.println("String Builder ----------------------------------");
		StringBuilder sb1 = new StringBuilder("Rushikesh");
		StringBuilder sb2 = new StringBuilder("Rushikesh");

		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

		System.out.println("String buffer----------------------------------");
		StringBuffer sbb1 = new StringBuffer("Rushikesh");
		StringBuffer sbb2 = new StringBuffer("Rushikesh");

		System.out.println(sbb1 == sbb2);
		System.out.println(sbb1.equals(sbb2));
		
	}
}
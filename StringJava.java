class StringJava{
	public static void main(String[] args) {
	    //Store in same memory location (String pool)
	    String s1 = "Rushikesh";
	    String s2 = "Rushikesh";
	    
	    System.out.println("String Pool Elements : ");
	    System.out.println(s1.equals(s2));
	    System.out.println(s1==s2);
	    
	    //Store in different memory location (Heap)
	    String s3 = new String("Tekale");
	    String s4 = new String("Tekale");
	    
	    System.out.println("Object in heap memory : ");
	    System.out.println(s3.equals(s4));
	    System.out.println(s3==s4);
	}
}
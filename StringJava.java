class StringJava{
	public static void main(String[] args) {
		String str = "RushikeshTekale";
		str = str.toLowerCase();
		String str2 = "ramesh";
		int index = 8;

		String newStr = "";
		for(int i=0; i<str.length(); i++){
			newStr = newStr + str.charAt(i);
			if(i==index){
				newStr = newStr + str2;
			}
		}	
		System.out.println(newStr);
		
	}
}
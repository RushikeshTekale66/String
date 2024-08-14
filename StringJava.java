class StringJava{
	public static void main(String[] args) {
		String str = "rushikeshtekale";
		
		char [] stra = str.toCharArray();
		
		for(int i=0; i<stra.length; i++){
			for(int j=i+1; j<stra.length; j++){
				if(stra[i]>stra[j]){
					char temp = stra[i];
					stra[i]= stra[j];
					stra[j]= temp;
				}
			}
		}
		
		System.out.println("Sorted String ");
		for(char ch : stra){
			System.out.print(ch);
		}
		
	}
}
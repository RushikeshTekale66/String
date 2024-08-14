class StringJava{
	public static void main(String[] args) {
		String str = "rruusshhiik";
		
		char [] stra = str.toCharArray();
		
		for(int i=0; i<stra.length; i++){
			int count = 0;
			for(int j=i; j<stra.length; j++){
				if(stra[i]==stra[j]){
					count++;
				}
			}
			if(count==1){
				System.out.print(stra[i]);
			}
		}		
	}
}
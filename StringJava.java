class StringJava{
	public static void main(String[] args) {
		String str = "I am java developer i passionate to java development";
		
		//1
		String [] arr = str.split(" ");
		for(int i=0; i<arr.length; i++){
			int count = 0;
		    for(int j=0; j<arr.length; j++){
				if(arr[i].equals(arr[j])){
					count++;
				}
			}
			if(count==1){
			System.out.println(arr[i]);
			}
		}
	}
}
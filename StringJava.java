class RemoveString{
	public static void main(String[] args) {
		String str = "Rushikesh Ramesh Tekale";
		
		//1
		String [] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++){
		    if(!arr[i].equals("Ramesh")){
		    	System.out.print(arr[i] + " ");
		    }
		}

		//2
		System.out.println();
		String [] arr2 = str.split("Ramesh");
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]);
		}
	}
}
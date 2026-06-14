package practice2;

public class MissingNo {

	public static void main(String[] args) {
		int[]arr1 = {2, 3, 7, 8, 11};

		int n = 12;

		boolean[]result = new boolean[n+1];

		for(int num : arr1){
	      result[num] = true;
		}
		for(int i = 1; i<=n; i++){
		  if(!result [i]){
			 
			  System.out.println(i);	  
	
		  }
		 
		 
		   
		}
		



	}

}

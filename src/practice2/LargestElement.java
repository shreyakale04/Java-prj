package practice2;

public class LargestElement {

	public static void main(String[] args) {
	
		int[] arr = {2, 3, 1, 15, 41, 9};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i] > max){
			
				max = arr[i];
			}
			if(arr[i] < min){
				
				min = arr[i];
			}
			
			
		}
		System.out.println("Largest element = " + max);
		System.out.println("Smallest element = " + min);

	}

}

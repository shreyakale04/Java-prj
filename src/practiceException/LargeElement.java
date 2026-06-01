package practiceException;

import java.util.Scanner;

public class LargeElement {
  
	public static int LargeElement(int[]arr)throws EmptyArrayException{
		
		if(arr.length == 0){
			
			throw new EmptyArrayException("Array can not be empty");
		}
		
		int max = arr[0];
	
		for(int i = 0; i< arr.length; i++){
			
			if(arr[i] > max){
				
				max = arr[i];
			}
		
		} 
		return max;		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		
		int no = sc.nextInt();
		int[] arr  = new int[no]; 
		
		System.out.println("Enter Array Elements");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		try{
			
			int max = LargeElement(arr);
			System.out.println("Maximum Element: " + max);
		}
		catch(EmptyArrayException e){
			
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

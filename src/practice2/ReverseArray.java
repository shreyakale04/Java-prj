package practice2;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int[] arr = {2, 3, 1, 15, 41, 9};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

}

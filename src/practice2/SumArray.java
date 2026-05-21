package practice2;

public class SumArray {

	public static void main(String[] args) {
		
		int[] arr = {20, 50, 13, 5, 40, 8};
		
		int sum = 0;
		
		for(int num : arr){
			
			sum+=num;
		}
		System.out.println("Sum of Array Elements = " + sum);
	}

}

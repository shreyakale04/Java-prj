package practice2;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {20, 50, 13, 5, 40, 8};
		
		int largest = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		
		for(int num : arr){
			
			if(num > largest){
				
				secondLarge = largest;
				largest = num;
				
			}
			else if(num > secondLarge && num!=largest){
				
				secondLarge = num;
			}
		}
		System.out.println("Largest Element = " + largest);
		System.out.println("Second Largest Element = " + secondLarge);

	}

}

package practice2;

public class PrimeNo {

	public static void main(String[] args) {
		
		int num = 12;
		
		boolean isPrime = true;
		
		for(int i = 2; i<=num/2; i++){
			
			if(num%i==0){
				
				isPrime = false;
				
				break;
			}
		}
		if(isPrime){
			
			System.out.println("Given no is Prime");
		}
		else{
			System.out.println("Given no is not prime");
		}
	}

}

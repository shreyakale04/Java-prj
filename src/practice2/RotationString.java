package practice2;

public class RotationString {

	public static boolean checkRotation(String str1, String str2){
		
		if(str1.length() != str2.length()){
			
			return false;
		}
		String str3 = str1 + str1;
		
		if(str3.contains(str2)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		
		String str1 = "avajava";  
        String str2 = "javaava"; 
        
        System.out.println("Checking if a string is rotation of another");
        
        if(checkRotation(str1, str2)){
        	System.out.println("Yes " + str2 + " is rotation of " + str1);
        }
        else{
        	System.out.println("No " + str2 + " is not rotation of " + str1);
        }
	}
	
}

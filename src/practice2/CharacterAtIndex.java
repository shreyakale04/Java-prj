package practice2;

import java.util.Scanner;

public class CharacterAtIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "Java";
		
		try{
			
			System.out.println("Enter index of Character");
			int index = sc.nextInt();
			
			int result = str.charAt(index);
		}
		catch(StringIndexOutOfBoundsException e){
			
			System.out.println("Invalid Index");
		}
	}
}

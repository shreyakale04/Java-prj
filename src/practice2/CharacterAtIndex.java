package practice2;

import java.util.Scanner;

public class CharacterAtIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "Java";
		
		System.out.println("Enter index of Character");
		int index = sc.nextInt();
		
		try{
			
			char ch = str.charAt(index);
			System.out.println("Character at index " + index + " is: " + ch);
		}
		catch(StringIndexOutOfBoundsException e){
			
			System.out.println("Invalid Index");
		}
		sc.close();
	}
}

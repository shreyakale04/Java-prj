package practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vowels {

	public static void main(String[] args) {
		
		String str = "Solutions";
		
		str = str.toLowerCase();
		
	Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	
	int countV = 0;
	int countC = 0;
	
	for(char ch : str.toCharArray()){
		
		if(set.contains(ch)){
			countV++;
		}
		else{
			countC++;
		}
	}
	System.out.println("Total Vowels = " + countV);
	System.out.println("Total Consonants = " + countC);
	  
       
        }
	}



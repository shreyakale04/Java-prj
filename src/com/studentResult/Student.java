package com.studentResult;



public class Student extends School{
	
void eligibility(){
		
		if(score >= 90){
			System.out.println(name + " is eligible");
		}
		else{
			System.out.println(name + " is not eligible");
		}
		
	}
	public static void main(String[] args) {
		
		Student st = new Student();
		st.display();
		st.eligibility();
	}


}

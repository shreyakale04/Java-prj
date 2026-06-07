package com.studentResult;

import java.util.Scanner;

public class School {

	String name;
	String sub;
	int score;
	
	
	public void display(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		
		name = sc.nextLine();
		
		System.out.println("Enter Subject Name:");
		
		sub = sc.nextLine();
		
		System.out.println("Enter Score");
		score = sc.nextInt();
		
		sc.close();
	}
}

package edu.ucaldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class GradeBookTest {

	public GradeBookTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    
		GradeBook gradebook = new GradeBook();
		
		System.out.println("Give a course name: ");
		String courseName = sc.nextLine();
		gradebook.displayMessage(courseName);
	}

}

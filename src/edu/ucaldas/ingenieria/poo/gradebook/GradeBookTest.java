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
		GradeBook gradebookProgramacionOO = new GradeBook("Programacion Orientadan a Objetos");
		
		
		System.out.println("Give a course name: ");
		String courseName = sc.nextLine();
		gradebook.setCourseName(courseName);
		System.out.println("nombre del curso desde el Main() :" + gradebook.getCourseName());
		System.out.println("nombre del curso con constructor nombre" + gradebookProgramacionOO.getCourseName());
		gradebook.displayMessage();
	}

}

package edu.ucaldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	//Zona de constructores
	public GradeBook()
	{
		
	}
		/**
	 * @param courseName
	 */
	public GradeBook(String courseName) {
		this.courseName = courseName;
	}

	//Zonas getters y setters
		/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	//Zona de Logica de Negocio
	public void displayMessage() {
		System.out.println("Hello from GradeBook class " + getCourseName());
	}
	
	
	public void determineClassAverage() {
	
	     Scanner sc = new Scanner(System.in);
	    
	     int total = 0, grade, gradeCounter=1, Average;
	  
	     while (gradeCounter <= 5) {
	    	 System.out.println("Please insert grade: ");
	    	 grade = sc.nextInt();
	    	 total = total + grade;
	    	 gradeCounter = gradeCounter + 1;
	     }
	     
	     //Promedio = Sumatorio de muestras/# de muestras
	     Average = total/5;
	     
	     System.out.println("The average of the grades is: " + Average);
	     
	     
	     
	     //	     int i = sc.nextInt();
 
		
	}
	// TODO Auto-generated constructor stub

}

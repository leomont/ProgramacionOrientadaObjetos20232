package edu.ucaldas.ingenieria.poo.gradebook;

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

	public void displayMessage() {
		System.out.println("Hello from GradeBook class " + getCourseName());
	}
	// TODO Auto-generated constructor stub

}

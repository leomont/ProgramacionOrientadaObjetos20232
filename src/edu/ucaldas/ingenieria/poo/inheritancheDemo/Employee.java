package edu.ucaldas.ingenieria.poo.inheritancheDemo;

public class Employee extends Person{
	
	private Double sueldo = 0d;

	/**
	 * @return the sueldo
	 */
	public Double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void trabajar() {
		
	}

	public void cobrar() {
		
	}
}

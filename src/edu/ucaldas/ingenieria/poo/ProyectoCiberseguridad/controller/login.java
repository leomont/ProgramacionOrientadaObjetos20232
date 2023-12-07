package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller;

public class login {
	
	private String cedula;
	private String password;
	

	/**
	 * @param cedula
	 * @param password
	 */
	public login(String cedula, String password) {
		super();
		this.cedula = cedula;
		this.password = password;
	}


	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	public login() {
		// TODO Auto-generated constructor stub
	}

}

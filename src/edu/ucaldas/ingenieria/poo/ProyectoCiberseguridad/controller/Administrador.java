package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller;

public class Administrador extends persona {
	
	private String idAdministrador;

	/**
	 * @return the idAdministrador
	 */
	public String getIdAdministrador() {
		return idAdministrador;
	}

	/**
	 * @param idAdministrador the idAdministrador to set
	 */
	public void setIdAdministrador(String idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String cedula, String nombre, String correoElectronico, String area) {
		super(cedula, nombre, correoElectronico, area);
		// TODO Auto-generated constructor stub
	}

}

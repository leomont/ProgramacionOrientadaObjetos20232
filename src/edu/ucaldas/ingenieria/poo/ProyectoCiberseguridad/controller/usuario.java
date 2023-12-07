package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller;

public class usuario extends persona {
	
	private String idUsuario;


	/**
	 * @return the idUsuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public usuario() {
		// TODO Auto-generated constructor stub
	}

	public usuario(String cedula, String nombre, String correoElectronico, String area) {
		super(cedula, nombre, correoElectronico, area);
		// TODO Auto-generated constructor stub
	}

}

package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller;

public class persona {

	private String cedula;
	private String nombre;
	private String correoElectronico;
	private String area;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	
	public persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cedula
	 * @param nombre
	 * @param correoElectronico
	 * @param area
	 */
	public persona(String cedula, String nombre, String correoElectronico, String area) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.area = area;
	}
	
	

}

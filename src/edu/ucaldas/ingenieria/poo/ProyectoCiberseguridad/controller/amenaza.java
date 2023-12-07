package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller;

public class amenaza {
	
	private String idAmenaza;
	private String nombreAmenaza;
	private String descripcionAmenaza;
	private int numeroAtaques;
	
	

	/**
	 * @param idAmenaza
	 * @param nombreAmenaza
	 * @param descripcionAmenaza
	 * @param numeroAtaques
	 */
	public amenaza(String idAmenaza, String nombreAmenaza, String descripcionAmenaza, int numeroAtaques) {
		super();
		this.idAmenaza = idAmenaza;
		this.nombreAmenaza = nombreAmenaza;
		this.descripcionAmenaza = descripcionAmenaza;
		this.numeroAtaques = numeroAtaques;
	}



	/**
	 * @return the idAmenaza
	 */
	public String getIdAmenaza() {
		return idAmenaza;
	}



	/**
	 * @param idAmenaza the idAmenaza to set
	 */
	public void setIdAmenaza(String idAmenaza) {
		this.idAmenaza = idAmenaza;
	}



	/**
	 * @return the nombreAmenaza
	 */
	public String getNombreAmenaza() {
		return nombreAmenaza;
	}



	/**
	 * @param nombreAmenaza the nombreAmenaza to set
	 */
	public void setNombreAmenaza(String nombreAmenaza) {
		this.nombreAmenaza = nombreAmenaza;
	}



	/**
	 * @return the descripcionAmenaza
	 */
	public String getDescripcionAmenaza() {
		return descripcionAmenaza;
	}



	/**
	 * @param descripcionAmenaza the descripcionAmenaza to set
	 */
	public void setDescripcionAmenaza(String descripcionAmenaza) {
		this.descripcionAmenaza = descripcionAmenaza;
	}



	/**
	 * @return the numeroAtaques
	 */
	public int getNumeroAtaques() {
		return numeroAtaques;
	}



	/**
	 * @param numeroAtaques the numeroAtaques to set
	 */
	public void setNumeroAtaques(int numeroAtaques) {
		this.numeroAtaques = numeroAtaques;
	}



	public amenaza() {
		// TODO Auto-generated constructor stub
	}

}

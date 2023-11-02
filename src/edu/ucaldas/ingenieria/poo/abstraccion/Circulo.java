package edu.ucaldas.ingenieria.poo.abstraccion;

public class Circulo extends Figura{
    private int radio;

    /**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
    	return 3.1416 * ( this.radio * this.radio);
    }

}

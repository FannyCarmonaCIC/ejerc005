package es.cic;

public class Circulo extends Figura {
	
	private int radio;

	
	public Circulo() {
		
	}
	
	public Circulo(int id, int coordX, int coordY, String color, int radio) {

		this.radio = radio;

	}


	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	

}

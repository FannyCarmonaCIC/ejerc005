package es.cic;

public class Circulo extends Figura {
	
	private int radio;

	
	public Circulo() {
		
	}
	
	public Circulo(int id, int coordX, int coordY, String color, int radio) {
		super(id, coordX, coordY, color);
		this.radio = radio;

	}


	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", id=" + id + ", coordX=" + coordX + ", coordY=" + coordY + ", color="
				+ color + "]";
	}
	

}

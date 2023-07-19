package es.cic;

public class Cuadrado extends Figura {

	private int lado;

	public Cuadrado() {

	}

	public Cuadrado(int id, int coordX, int coordY, String color, int lado) {

		this.lado = lado;

	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}

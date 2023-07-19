package es.cic;

public class Figura {

	public int id;
	public int coordX;
	public int coordY;
	public String color;

	public Figura() {

	}

	public Figura(int id, int coordX, int coordY, String color) {
		this.id = id;
		this.coordX = coordX;
		this.coordY = coordY;
		this.color = color;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

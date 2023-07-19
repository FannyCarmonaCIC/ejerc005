package es.cic;

import java.util.ArrayList;

public class Lienzo implements ILienzo {

	private final int altoLienzo = 1000000;
	private final int anchoLienzo = 1000000;
	private ArrayList<Figura> figuras = new ArrayList<>();

	public Lienzo() {

	}

	/**
	 * Dibujar las figuras
	 */
	public void crearCirculo(int id, int coordX, int coordY, String color, int radio) {
		Circulo circulo = new Circulo(id, coordX, coordY, color, radio);

		if (coordX < anchoLienzo && coordY < altoLienzo) {
			figuras.add(circulo);
		} else {
			throw new RuntimeException("La figura debe estar dentro del lienzo");
		}

	}

	public void eliminarCirculo(Circulo circulo) {

		for (int i = 0; i > figuras.size(); i++) {

			if (circulo.getId() == figuras.get(i).getId()) {
				figuras.remove(circulo);
			}
		}

	}

	public void moverCirculo(Circulo circulo, int coordX, int coordY) {

		if (coordX <= anchoLienzo && coordY <= altoLienzo) {

			circulo.setCoordX(coordX);
			circulo.setCoordY(coordY);

		}
		
//	public void transformarCirculo(Circulo circulo) {
//		
//	}

	}

}

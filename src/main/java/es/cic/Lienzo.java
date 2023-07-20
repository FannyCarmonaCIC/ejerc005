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

	public void eliminar(int id) {

		for (int i = 0; i < figuras.size(); i++) {
			Figura figura = figuras.get(i);

			if (id == figura.getId()) {
				figuras.remove(figura);
				return;
			}
		}
		
		throw new RuntimeException("No se puede borrar la figura");
		

	}

	public void moverCirculo(Circulo circulo, int coordX, int coordY) {

		if (coordX <= anchoLienzo && coordY <= altoLienzo) {

			circulo.setCoordX(coordX);
			circulo.setCoordY(coordY);

		}

	}

	public Figura buscar(int id) {
		
		Figura figuraEncontrada = null;

		for (int i = 0; i < figuras.size(); i++) {
			if (id == figuras.get(i).getId()) {
				figuraEncontrada = figuras.get(i);
			}
		}

		return figuraEncontrada;
	}

//	public void transformarCirculo(Circulo circulo) {
//		
//	}

}

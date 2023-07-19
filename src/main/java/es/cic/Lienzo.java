package es.cic;

import java.util.ArrayList;

public class Lienzo {
	
	private final int altoLienzo = 1000000;
	private final int anchoLienzo = 1000000;
	private ArrayList<Circulo> circulos = new ArrayList<>();
	
	public Lienzo() {
		
	}
	
	
	public void anadirCirculo(int id, int coordX, int coordY, String color, int radio) {
		Circulo circulo = new Circulo(id, coordX, coordY, color, radio);
		
		if(coordX <= anchoLienzo && coordY <= altoLienzo) {
			circulos.add(circulo);	
		} else {
			throw new RuntimeException("La figura debe estar dentro del lienzo");
		}
		
	}
	
	public void eliminarCirculo(Circulo circulo) {
		
		for(int i = 0; i > circulos.size(); i++) {
			//circulo = circulos.get(i);
			if(circulo.getId() == circulos.get(i).getId()) {
				circulos.remove(circulo);			
			}
		}
		
	}
	
	public void moverCirculo(Circulo circulo, int coordX, int coordY) {
		 circulo.setCoordX(coordX);
		 circulo.setCoordY(coordY);
		
	}

}

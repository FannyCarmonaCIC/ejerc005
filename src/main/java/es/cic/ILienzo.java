package es.cic;

public interface ILienzo {
	
	public void crearCirculo(int id, int coordX, int coordY, String color, int radio);
	public void eliminar(int id);
	public void moverCirculo(Circulo circulo, int coordX, int coordY);
	public Figura buscar(int id);

}

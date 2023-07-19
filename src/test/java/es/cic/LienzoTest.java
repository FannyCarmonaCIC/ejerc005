package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LienzoTest {
	
	private Lienzo cut;

	@BeforeEach
	void setUp() throws Exception {
		
		cut = new Lienzo();
	}

	@Test
	void testCrearCirculo() {
		
		cut.crearCirculo(23, 300, 300, "rojo", 13);
		Figura circulo = cut.buscar(23);
		
		assertEquals(23, circulo.getId());
		
	}
	
//	@Test
//	void testCrearCirculoSaliendoDelLienzo() {
//		
//		cut.crearCirculo(23, 1000001, 300, "rojo", 13);
//		Figura circulo = cut.buscar(23);
//		
//		assertT;
//		
//	}
	
	
//	@Test
//	void testEliminarFigura() {
//		
//		cut.crearCirculo(30, 300, 300, "rojo", 13);
//		cut.buscar(30);
//		cut.eliminar(30);
//		
//		Figura circulo = cut.buscar(30);
//		
//		assertNull(circulo);
//		
//	}

}

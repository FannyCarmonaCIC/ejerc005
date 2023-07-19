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

}

package pkgmario.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pkgmario.modelo.Kart;

class PruebasKart {


	static String[]  nombres = new String[] {"a", "b", "c", "d", "e", "f", "g", "h" , "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static List<Kart> listaDeKarts = new ArrayList<Kart>();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
		for(int i = 0;
				i < nombres.length;
				i++) {
			listaDeKarts.add(new Kart(nombres[i]));
		}
		
	}

	@Test
	void testSpeed() {
		
		assertTrue(0 < listaDeKarts.get(0).getSpeed());
		assertTrue(18 > listaDeKarts.get(0).getSpeed());
		
	}
	
	@Test
	void testEquals() {
		Kart prueba1 = new Kart("AAA");
		Kart prueba2 = new Kart("AAA");
		assertTrue(listaDeKarts.get(0).equals(listaDeKarts.get(0)));
		assertFalse(listaDeKarts.get(0).equals(listaDeKarts.get(1)));
		assertFalse(prueba1.equals(prueba2));
	}

}

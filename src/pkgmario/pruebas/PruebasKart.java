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
		assertTrue(0 < listaDeKarts.get(1).getSpeed());
		assertTrue(18 > listaDeKarts.get(1).getSpeed());
		assertTrue(0 < listaDeKarts.get(2).getSpeed());
		assertTrue(18 > listaDeKarts.get(2).getSpeed());
		assertTrue(0 < listaDeKarts.get(3).getSpeed());
		assertTrue(18 > listaDeKarts.get(3).getSpeed());
		assertTrue(0 < listaDeKarts.get(4).getSpeed());
		assertTrue(18 > listaDeKarts.get(4).getSpeed());
		assertTrue(0 < listaDeKarts.get(5).getSpeed());
		assertTrue(18 > listaDeKarts.get(5).getSpeed());
		assertTrue(0 < listaDeKarts.get(6).getSpeed());
		assertTrue(18 > listaDeKarts.get(6).getSpeed());
		assertTrue(0 < listaDeKarts.get(7).getSpeed());
		assertTrue(18 > listaDeKarts.get(7).getSpeed());
	}

}

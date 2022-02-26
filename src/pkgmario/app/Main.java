package pkgmario.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pkgmario.modelo.Kart;
import pkgmario.modelo.Race;

public class Main {
	
	
	public static void main(String[] Args) {
		

		 String[]  nombres = new String[] {"a", "b", "c", "d", "e", "f", "g", "h" , "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		 List<Kart> listaDeKarts = new ArrayList<Kart>();
		
		
		 for(int i = 0;
					i < nombres.length;
					i++) {
				listaDeKarts.add(new Kart(nombres[i]));
			}
		
		 for(Kart unKart: listaDeKarts) {
			 System.out.println(unKart.toString());
		 }
		 
		
		
		
	}
	
}

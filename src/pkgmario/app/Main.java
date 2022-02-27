package pkgmario.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pkgmario.modelo.Circuit;
import pkgmario.modelo.Kart;
import pkgmario.modelo.Race;

public class Main {
	
	
	public static void main(String[] Args) {
		
		Race race = new Race("Super cup");
		
		Kart kart1 = new Kart("Mario");
		Kart kart2 = new Kart("Luigi");
		Kart kart3 = new Kart("Bowser");
		race.addKart(kart1);
		race.addKart(kart2);
		race.addKart(kart3);
		
		Circuit circuit = new Circuit("Mina de Wario", 100);
		race.setCircuit(circuit);

		System.out.println("**** Init Super Mario Kart ****");
		
		System.out.println(race.toString());
		
		race.run();
		
		System.out.println("**** Game Over ****");
		
		System.out.println(race.showResult());
	}
	
}

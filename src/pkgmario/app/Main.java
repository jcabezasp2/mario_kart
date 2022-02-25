package pkgmario.app;

import java.util.Random;

import pkgmario.modelo.Race;

public class Main {
	private static Random random;
	private static int MAX_RANDOM = 6;
	
	public static void main(String[] Args) {
		
		Race race = new Race();
		random = new Random(MAX_RANDOM);
		for(int i = 1;
				i <= 25;
				i++) {
			System.out.println(random.nextInt(18));	
		}
		
		
	}
	
}

package pkgmario.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Race {

	private String name;
	private final static int NUM_KARTS = 3;
	private Circuit circuit;
	List<Kart> karts = new ArrayList<Kart>();
	List<Kart> finishedKarts = new ArrayList<Kart>();
	
	public Race(String name) {
		super();
		this.name = name;
		
	}
	
	public void run() {
		
		while(notAllFinished()) {
			
			for(int i = 0;
					i < karts.size();
					i++) {
				moveKart(karts.get(i));
				if(isFinished(karts.get(i)) ) {
					moveToFinished(karts.get(i));
				}
			}				
		}
			
	}
	
	private boolean notAllFinished() {
		
		return !karts.isEmpty();
	}
	
	private void moveKart(Kart kart) {
		int movedPositions = 0;
		movedPositions = kart.move() - circuit.difficulty();
		kart.setPosition(kart.getPosition() + movedPositions);
	}
	
	private boolean isFinished(Kart kart) {
		
		if(kart.getPosition() >= circuit.getDistance()) {
			return true;
		}else{
			return false;
		}
		
	}
	
	private void moveToFinished(Kart kart) {
		//No uso un iterator, porque entiendo que aun en el caso de que dos Karts sean iguales, solo estaria terminando la carrera uno de ellos
		 finishedKarts.add(kart);
		 karts.remove(kart);
		
	}
	
	public String showResult() {
		int contador = 1;
		StringBuilder sb = new StringBuilder();
		
		sb.append("Race: ");
		sb.append(this.getName());
		sb.append("\nCircuit: ");
		sb.append(circuit.toString());
		sb.append("\n");
		
		for(Kart unKart: finishedKarts) {
		sb.append(contador);
		sb.append(".-");
		sb.append(unKart.toString());
		sb.append("\n");
		contador++;
		}
		
		
		return sb.toString();
	}
	
	public void addKart(Kart kart) {
		karts.add(kart);
	}
	
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}
	
	public String toString() {
		int contador = 1;
		StringBuilder sb = new StringBuilder();
		
		sb.append("Race: ");
		sb.append(this.getName());
		sb.append("\nCircuit: ");
		sb.append(circuit.toString());
		sb.append("\n");
		
		for(Kart unKart: karts) {
		sb.append(contador);
		sb.append(".-");
		sb.append(unKart.toString());
		sb.append("\n");
		contador++;
		}
		
		
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

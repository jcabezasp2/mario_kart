package pkgmario.modelo;

import java.util.ArrayList;
import java.util.List;

public class Race {

	private String name;
	private final static int NUM_KARTS = 3;
	private Circuit circuit;
	List<Kart> listaDeKartsParticipantes = new ArrayList<Kart>();
	List<Kart> listadeKartsFinalizados = new ArrayList<Kart>();
	
	public Race(String name) {
		super();
		this.name = name;
		
	}
	
	public void run() {
		
	}
	
	private boolean notAllFinished() {
		return true;
	}
	
	private void moveKart(Kart kart) {
		
	}
	
	private boolean isFinished(Kart kart) {
	return true;
	}
	
	private void moveToFinished(Kart kart) {
		
	}
	
	public String showResult() {
	return null;	
	}
	
	public void addKart(Kart kart) {
		
	}
	
	public void setCircuit(Circuit circuit) {
		
	}
	
	public String toString() {
		return null;
	}
	
	
}

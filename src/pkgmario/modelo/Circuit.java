package pkgmario.modelo;

import java.util.Random;

public class Circuit {

	private String name;
	private int distance;
	
	public Circuit(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}
	
	public int difficulty() {
		Random random = new Random();
		
		return random.nextInt(10);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circuit [name=");
		builder.append(name);
		builder.append(", distance=");
		builder.append(distance);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

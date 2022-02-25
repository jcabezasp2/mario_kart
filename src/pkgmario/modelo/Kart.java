package pkgmario.modelo;

import java.util.Random;

public class Kart {

	private String driver;
	private int speed;
	private int acceleration;
	private int position;
	private Random random;
	private static int MAX_POINTS = 18;
	private static int MAX_RANDOM = 6;
	
	public Kart(String driver) {
		super();
		this.driver = driver;
		init();
	}
	
	private void init() {
		
		this.position = 0;
		this.speed = random.nextInt(MAX_POINTS + 1);
		this.acceleration = MAX_POINTS - this.speed;
	}
	
	public int move() {
		
		return this.speed + this.acceleration + random.nextInt(MAX_RANDOM + 1);	
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kart [driver=");
		builder.append(driver);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", acceleration=");
		builder.append(acceleration);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

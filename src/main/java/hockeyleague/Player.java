package hockeyleague;

public class Player extends Person {

	private final int shirtNumber;
	private final Position position;
	protected Player(String name, String address, int shirtNumber, Position position) {
		super(name, address);
		this.shirtNumber = shirtNumber;
		this.position = position;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public Position getPosition() {
		return position;
	}
}

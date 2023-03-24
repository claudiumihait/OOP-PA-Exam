package hockeyleague;

public class Coach extends Person {
	private AccreditationLevel level;
	private int yearsOfExperience;
	protected Coach(String name, String address, AccreditationLevel level, int yearsOfExperience) {
		super(name, address);
		this.level = level;
		this.yearsOfExperience = yearsOfExperience;
	}

	public AccreditationLevel getLevel() {
		return level;
	}

	public void setLevel(AccreditationLevel level) {
		this.level = level;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
}

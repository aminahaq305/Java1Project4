
public class Pitcher {
	private String name;
	private double average;
	
	public Pitcher(String name, double average) {
		this.name = name;
		this.average = average;
	}
	public boolean Pitch() {
		boolean pitch = false;
		if (Math.random() <= this.average) {
			pitch = true;
		}
		return pitch;
	}
	public String getName() {
		return this.name;
	}
	
	
}

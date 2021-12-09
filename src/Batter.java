
public class Batter {
	private String name;
	private double average;
	
	public Batter(String name, double average) {
		this.name = name;
		this.average = average;
	}
	
	public boolean Hit() {
		boolean hit = false;
		if (Math.random() <= this.average) {
			hit = true;
		}
		return hit;
	}
	public String getName() {
		return this.name;
	}
 }

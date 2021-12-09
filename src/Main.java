
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batter John = new Batter("John Doe", 0.25);
		Pitcher Phil = new Pitcher("Phil Rodrigues", 0.4);
		int balls = 0;
		int strike = 0;
		boolean hit = false;
		
		System.out.println(Phil.getName() + " is pitching to " + John.getName());
		boolean pitch = Phil.Pitch();
		
		while (pitch == false && balls < 4) {
			System.out.println("    " + Phil.getName() + " threw a ball");
			balls = balls + 1;
			System.out.println("    The count is " + balls + " balls and " + strike + " strikes");
			pitch = Phil.Pitch();
		}
		if (pitch == true) {
			hit = John.Hit();
			while (hit == false && strike < 3 && balls < 4) {
				strike = strike + 1;
				System.out.println("    " + John.getName() + " swung and missed");
				System.out.println("    The count is " + balls + " balls and " + strike + " strikes");
				hit = John.Hit();
			}
		}
			if (strike == 3) {
				System.out.println(John.getName() + " struck out.");
			}
			else if (balls == 4) {
				System.out.println(John.getName() + " walked.");
			}
			else if (hit == true) {
				System.out.println(John.getName() + " got a hit!");
			}
			
		
		
		
	}

}

	

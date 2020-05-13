package templateMethodDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Race race = new BicycleRace();
		race.TakeTour();

		race = new CarRace();
		race.TakeTour();
	}
}

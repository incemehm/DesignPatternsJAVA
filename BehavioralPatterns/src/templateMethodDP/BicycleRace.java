package templateMethodDP;

public class BicycleRace extends Race {

	@Override
	protected void TakeBreak() {
		System.out.println("Drivers are taking a break.");
		System.out.println("Drivers are drinking water.");
	}
}

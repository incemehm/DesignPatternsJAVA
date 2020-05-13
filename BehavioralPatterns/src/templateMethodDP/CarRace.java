package templateMethodDP;

public class CarRace extends Race{

	@Override
	protected void TakeBreak()
	{
		System.out.println("Drivers are taking a break.");
		System.out.println("Drivers are changing wheels of cars.");
		System.out.println("Drivers are filling gas to cars.");
	}
}

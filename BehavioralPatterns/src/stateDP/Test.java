package stateDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Weather weather = new Weather();
		weather.WearSomething();

		weather.ChangeWeatherState(new RainyWeather());
		weather.WearSomething();

		weather.ChangeWeatherState(new SnowyWeather());
		weather.WearSomething();
	}
}

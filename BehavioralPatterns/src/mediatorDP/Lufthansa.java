package mediatorDP;

public class Lufthansa extends Airline {
	public Lufthansa(IAirport airport, String flightCode)
	{
		super(airport, flightCode);
		airport.RegisterAirline(this);
	}

	@Override
	public void RequestLanding()
	{
		System.out.println("Lufthansa (" + this.getFlightCode() + ") requests landing permission!");

		airport.ManageLanding(this.getFlightCode());
	}

	@Override
	public void Allow()
	{
		System.out.println("Lufthansa (" + this.getFlightCode() + ") allowed!");
	}

	@Override
	public void Hold()
	{
		System.out.println("Lufthansa (" + this.getFlightCode() + ") on hold!");
	}
}

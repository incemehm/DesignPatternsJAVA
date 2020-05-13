package mediatorDP;

public class Pegasus extends Airline {

	public Pegasus(IAirport airport, String flightCode)
	{
		super(airport, flightCode);
		airport.RegisterAirline(this);
	}

	@Override
	public void RequestLanding()
	{
		System.out.println("Pegasus (" + this.getFlightCode() + ") requests landing permission!");

		airport.ManageLanding(this.getFlightCode());
	}

	@Override
	public void Allow()
	{
		System.out.println("Pegasus (" + this.getFlightCode() + ") allowed!");
	}

	@Override
	public void Hold()
	{
		System.out.println("Pegasus (" + this.getFlightCode() + ") on hold!");
	}
}

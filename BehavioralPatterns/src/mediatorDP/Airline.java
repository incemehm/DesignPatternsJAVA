package mediatorDP;

public abstract class Airline {

    protected IAirport airport;
    private String flightCode;

    public Airline(IAirport airport, String flightCode)
    {
        this.airport = airport;
        this.flightCode = flightCode;
    }

    public abstract void RequestLanding();

    public abstract void Allow();

    public abstract void Hold();

    public String getFlightCode() {
        return flightCode;
    }
}

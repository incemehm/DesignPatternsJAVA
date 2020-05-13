package mediatorDP;

public interface IAirport
{
    void RegisterAirline(Airline airline);
    void ManageLanding(String flightCode);
}
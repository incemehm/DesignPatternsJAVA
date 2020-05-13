package mediatorDP;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Airport implements IAirport {
    private Map<String, Airline> flights;

    public Airport()
    {
        flights = new HashMap<String, Airline>();
    }

    public void RegisterAirline(Airline airline)
    {
        if (!flights.containsValue(airline))
            flights.put(airline.getFlightCode(), airline);
    }

    public void ManageLanding(String flightCode)
    {
        for (String _flightCode : flights.keySet().stream().filter(x -> !x.equals(flightCode)).collect(Collectors.toSet()) )
            flights.get(_flightCode).Hold();

        flights.get(flightCode).Allow();
    }
}

package mediatorDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IAirport airport = new Airport();

		Airline flightLondon = new Lufthansa(airport, "LFT1919");
		Airline flightIstanbul = new Pegasus(airport, "PGS1881");
		Airline flightDubai = new Lufthansa(airport, "LFT1923");

		flightLondon.RequestLanding();
		System.out.println("-----------------------");

		flightIstanbul.RequestLanding();
		System.out.println("-----------------------");

		flightDubai.RequestLanding();
		System.out.println("-----------------------");
	}
}

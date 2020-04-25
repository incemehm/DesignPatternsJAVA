package prototypeDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Dvd dvd = new Dvd("The Hobbit", "There and back again");

		System.out.println(dvd);

        Dvd copyDvd = (Dvd)dvd.Clone();

        System.out.println(copyDvd);
	}
}

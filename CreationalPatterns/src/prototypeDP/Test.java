package prototypeDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Dvd dvd = new Dvd("D���n DVDsi", "Sample string content");

        Dvd copyDvd = (Dvd)dvd.Clone();

        System.out.println(copyDvd);
	}
}

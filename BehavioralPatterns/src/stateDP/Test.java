package stateDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Hava hava = new Hava();
        hava.Giyin();

        hava.DurumDegistir(new YagmurluHava());
        hava.Giyin();

        hava.DurumDegistir(new KarliHava());
        hava.Giyin();
	}

}

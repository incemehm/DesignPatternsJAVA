package strategyDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Yatirim yatirim = new Yatirim(new ATipiFon());
        double tutar = yatirim.GetiriHesapla(100);
        System.out.println("A Tipi Fon getirisi: " + tutar);

        yatirim = new Yatirim(new BTipiFon());
        tutar = yatirim.GetiriHesapla(100);
        System.out.println("B Tipi Fon getirisi: " + tutar);

	}

}

package mediatorDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Kule kule = new Kule();

         HavayoluSirketi[] sirketler = new HavayoluSirketi[2];
         sirketler[0] = new THY(kule);
         sirketler[1] = new Lufthansa(kule);

         sirketler[0].InisIzniVer();
         sirketler[1].InisIzniVer();

	}

}

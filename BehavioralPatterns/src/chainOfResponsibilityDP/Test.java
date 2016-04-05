package chainOfResponsibilityDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Makina makina = new Makina();
         Islem islem = new SuAlmaIslemi().SonrakiIslem(new YikamaIslemi().SonrakiIslem(new DurulamaIslemi()));

         islem.Basla(makina);

	}

}

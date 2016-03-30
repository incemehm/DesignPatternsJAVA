package builderDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Garson garson = new Garson();

        // Adana Kebap istiyoruz, kurulum nesnesini yarat.
        Usta usta = new AdanaUsta();

        // Y�netici s�n�fa kurulum nesnesini ver. Adana Kebap ustas�n� (kurucusunu) se�tik
        garson.SetUstaAndCreateKebap(usta);
        
        // Kebap yap�ld� ve haz�r
        Kebap kebap = garson.GetKebap();

        System.out.println(kebap);

        // �imdi de Manisa Kebab� istedik.
        usta = new ManisaUsta();

        garson.SetUstaAndCreateKebap(usta);
        kebap = garson.GetKebap();

        System.out.println(kebap);

	}

}

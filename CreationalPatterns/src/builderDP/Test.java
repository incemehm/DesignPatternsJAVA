package builderDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Garson garson = new Garson();

        // Adana Kebap istiyoruz, kurulum nesnesini yarat.
        Usta usta = new AdanaUsta();

        // Yönetici sınıfa kurulum nesnesini ver. Adana Kebap ustasını (kurucusunu) seçtik
        garson.SetUstaAndCreateKebap(usta);
        
        // Kebap yapıldı ve hazır
        Kebap kebap = garson.GetKebap();

        System.out.println(kebap);

        // Şimdi de Manisa Kebabı istedik.
        usta = new ManisaUsta();

        garson.SetUstaAndCreateKebap(usta);
        kebap = garson.GetKebap();

        System.out.println(kebap);

	}

}

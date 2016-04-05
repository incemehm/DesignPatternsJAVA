package chainOfResponsibilityDP;

public class DurulamaIslemi extends Islem {

	@Override
	protected void IsYap(Makina makina) {
		makina.Durum = 3;
		System.out.println("Durulama islemi yapildi... Makina Durumu = " + makina.Durum);
		
	}

}

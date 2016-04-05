package chainOfResponsibilityDP;

public class YikamaIslemi extends Islem {

	@Override
	protected void IsYap(Makina makina) {
		makina.Durum = 2;
		System.out.println("Yikama islemi yapildi... Makina Durumu = " + makina.Durum);
		
	}

}

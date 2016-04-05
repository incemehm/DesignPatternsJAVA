package chainOfResponsibilityDP;

public class SuAlmaIslemi extends Islem {

	@Override
	protected void IsYap(Makina makina) {
		makina.Durum = 1;
		System.out.println("Su alma islemi yapildi... Makina Durumu = " + makina.Durum);
		
	}

}

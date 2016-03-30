package decoratorDP;

public class SosluMakarna extends MakarnaDecorator {

	public SosluMakarna(IMakarna mak) {
		super(mak);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ServisEt() {
		makarna.ServisEt();
		System.out.println("Makarna Servis ediliyor ve üzerine sos ekleniyor...");

	}

}

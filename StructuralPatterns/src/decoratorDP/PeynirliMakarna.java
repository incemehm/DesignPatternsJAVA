package decoratorDP;

public class PeynirliMakarna extends MakarnaDecorator {

	public PeynirliMakarna(IMakarna mak) {
		super(mak);
	}

	@Override
	public void ServisEt() 
	{
		makarna.ServisEt();
		System.out.println("Makarna Servis ediliyor ve üzerine kýzarmýþ peynir ekleniyor...");
	}

}

package mediatorDP;

public class THY extends HavayoluSirketi {

	public THY(Kule kule) {
		super(kule);
		kule.THYLisansVer(this);
	}

	@Override
	public void InisIzniVer() {
		kule.THYInisIzniVer();
		System.out.println("THY iniþ izni verildi.");

	}

	@Override
	public void Beklet() {
		System.out.println("THY bekletiliyor.");

	}

}

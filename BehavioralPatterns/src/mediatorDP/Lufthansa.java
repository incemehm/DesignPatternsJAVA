package mediatorDP;

public class Lufthansa extends HavayoluSirketi {

	public Lufthansa(Kule kule) {
		 super(kule);
		 kule.LufthansaLisansVer(this);
	}

	@Override
	public void InisIzniVer() 
	{
		 kule.LufthansaInisIzniVer();
		 System.out.println("Lufthansa ini� izni verildi.");
	}

	@Override
	public void Beklet() 
	{
		System.out.println("Lufthansa bekletiliyor.");
	}

}

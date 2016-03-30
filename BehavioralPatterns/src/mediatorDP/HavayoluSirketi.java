package mediatorDP;

public abstract class HavayoluSirketi {
	protected Kule  kule;

    public HavayoluSirketi(Kule kule)
    {
        this.kule = kule;
    }

     public abstract void InisIzniVer();

     public abstract void Beklet();

}

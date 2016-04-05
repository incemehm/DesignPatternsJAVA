package strategyDP;

public class Yatirim {
	private IFon  birim;

    public Yatirim(IFon birim)
    {
        this.birim = birim;
    }

    public double GetiriHesapla(double tutar)
    {
       return birim.Hesapla(tutar);
    }
}

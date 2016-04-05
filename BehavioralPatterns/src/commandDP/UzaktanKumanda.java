package commandDP;

public class UzaktanKumanda {
	private IKomut ileriKomutu;
    private IKomut geriKomutu;

    public UzaktanKumanda(IKomut ileriKomutu, IKomut geriKomutu)
    {
        this.ileriKomutu = ileriKomutu;
        this.geriKomutu = geriKomutu;
    }

    public void IleriGit(int birim)
    {
        ileriKomutu.HareketEt(birim);
    }

    public void GeriGit(int birim)
    {
        geriKomutu.HareketEt(birim);
    }
}

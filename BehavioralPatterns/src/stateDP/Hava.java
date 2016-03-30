package stateDP;

public class Hava 
{
	private IHavaDurumu havaDurumu;

    public Hava()
    {
        havaDurumu = new GunesliHava();
    }

    public void Giyin()
    {
        havaDurumu.Giyin();
    }

    public void DurumDegistir(IHavaDurumu havaDurumu)
    {
        this.havaDurumu = havaDurumu;
    }
}

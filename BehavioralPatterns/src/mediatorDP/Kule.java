package mediatorDP;

public class Kule {
	private THY thy;
    private Lufthansa lufthansa;
    
    public void THYLisansVer(THY thy)
    {
        this.thy = thy;
    }

    public void LufthansaLisansVer(Lufthansa lufthansa)
    {
        this.lufthansa = lufthansa;
    }

    public void THYInisIzniVer()
    {
        lufthansa.Beklet();
    }

    public void LufthansaInisIzniVer()
    {
        thy.Beklet();
    }
}

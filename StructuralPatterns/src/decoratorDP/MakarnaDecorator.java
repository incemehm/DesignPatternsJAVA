package decoratorDP;

public abstract class MakarnaDecorator implements IMakarna {

	protected IMakarna makarna;
	
	public MakarnaDecorator(IMakarna mak)
    {
        this.makarna = mak;
    }
	
	public abstract void ServisEt();
}

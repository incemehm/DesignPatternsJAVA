package strategyDP;

public class ATipiFon implements IFon {

	@Override
	public double Hesapla(double tutar) 
	{
		return tutar * 1.45;
	}

}

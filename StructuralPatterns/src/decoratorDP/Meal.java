package decoratorDP;

public class Meal implements IMeal {

	public Meal() { }

	@Override
	public void Serve()
	{
		System.out.println("Meal is being served...");
	}
}

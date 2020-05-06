package decoratorDP;

public class SaucyMeal extends MealDecorator {

	public SaucyMeal(IMeal meal) {
		super(meal);
	}

	@Override
	public void Serve()
	{
		System.out.println("Saucy meal is being served...");

		super.Serve();
	}
}

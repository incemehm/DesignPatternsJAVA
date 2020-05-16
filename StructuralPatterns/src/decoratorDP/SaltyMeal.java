package decoratorDP;

public class SaltyMeal extends MealDecorator {

	public SaltyMeal(IMeal meal) {
		super(meal);
	}

	@Override
	public void Serve()
	{
		System.out.println("Salty meal is being served...");

		meal.Serve();
	}
}

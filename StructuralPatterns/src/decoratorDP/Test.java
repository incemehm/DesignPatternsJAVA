package decoratorDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
        IMeal meal = new Meal();
        meal.Serve();

        meal = new SaucyMeal(new Meal());
        meal.Serve();

        meal = new SaltyMeal(new Meal());
        meal.Serve();

        meal = new SaltyMeal(new SaucyMeal(new Meal()));
        meal.Serve();
	}

}

package decoratorDP;

public abstract class MealDecorator implements IMeal {

    protected IMeal meal;

    public MealDecorator(IMeal meal)
    {
        this.meal = meal;
    }

    public void Serve()
    {
        meal.Serve();
    }
}

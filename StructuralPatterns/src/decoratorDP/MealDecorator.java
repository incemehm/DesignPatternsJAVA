package decoratorDP;

public abstract class MealDecorator implements IMeal {

    protected IMeal meal;

    public MealDecorator(IMeal meal)
    {
        this.meal = meal;
    }

    public abstract void Serve();
}

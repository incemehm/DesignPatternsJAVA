package builderDP;

public abstract class Usta {
	protected Kebap kebap;

    public void CreateKebap()
    {
        kebap = new Kebap();
    }

    public Kebap GetKebap()
    {
        return kebap;
    }

    public abstract void SetKebapProperties();
}

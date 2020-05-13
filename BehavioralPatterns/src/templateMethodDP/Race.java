package templateMethodDP;

public abstract class Race
{
    public void TakeTour()
    {
        Start();

        KeepDrive();

        TakeBreak();

        KeepDrive();

        Finish();
    }

    public void Start()
    {
        System.out.println("Race starts");
    }

    public void KeepDrive()
    {
        System.out.println("Race's going on");
    }

    protected abstract void TakeBreak();

    public void Finish()
    {
        System.out.println("Race finishes");
    }
}
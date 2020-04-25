package singletonDP;

public class VodafoneLazy
{
    private static VodafoneLazy _line;
    private final String _name = "VODAFONE";
    private final int _number = 542;

    private VodafoneLazy()
    {
        System.out.println("Vodafone lazy private constructor...");
    }

    public static VodafoneLazy GetInstance()
    {
        if (_line == null)
        {
            synchronized (VodafoneLazy.class)
            {
                if(_line == null)
                {
                    _line  = new VodafoneLazy();
                }

            }
        }
        return _line;
    }
    public String GetName()
    {
        return _name;
    }
    public int GetNumber()
    {
        return _number;
    }
}
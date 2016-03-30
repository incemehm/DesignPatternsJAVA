package abstractFactoryDP;

public class FairPriceHardwareFactory implements IHardwareFactory {
	public IProcessor ProcessorModel()
    {
        return new AMDProcessor();
    }

    public IRam RAMModel()
    {
        return new KingstonRam();
    }

    public IHdd HDDModel()
    {
        return new SamsungHDD();
    }
}

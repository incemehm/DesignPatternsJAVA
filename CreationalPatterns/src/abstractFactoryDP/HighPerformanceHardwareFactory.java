package abstractFactoryDP;

public class HighPerformanceHardwareFactory implements IHardwareFactory {
	public IProcessor ProcessorModel()
    {
        return new IntelProcessor();
    }

    public IRam RAMModel()
    {
        return new IbmRam();
    }

    public IHdd HDDModel()
    {
        return new ToshibaHDD();
    }
}

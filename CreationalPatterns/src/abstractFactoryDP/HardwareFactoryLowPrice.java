package abstractFactoryDP;

public class HardwareFactoryLowPrice implements IHardwareFactory {

    public IProcessor ProcessorModel()
    {
        return new ProcessorAMD();
    }

    public IRAM RAMModel()
    {
        return new RAMKingston();
    }
}

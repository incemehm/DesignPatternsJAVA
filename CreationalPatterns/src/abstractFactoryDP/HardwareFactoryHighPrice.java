package abstractFactoryDP;

public class HardwareFactoryHighPrice implements IHardwareFactory {

    public IProcessor ProcessorModel()
    {
        return new ProcessorIntel();
    }

    public IRAM RAMModel()
    {
        return new RAMIBM();
    }
}

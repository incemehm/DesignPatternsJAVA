package abstractFactoryDP;

public interface IHardwareFactory {
	IProcessor ProcessorModel();
    IRAM RAMModel();
}

package abstractFactoryDP;

public interface IHardwareFactory {
	IProcessor ProcessorModel();
    IRam RAMModel();
    IHdd HDDModel();
}

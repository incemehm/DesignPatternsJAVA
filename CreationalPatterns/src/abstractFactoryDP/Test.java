package abstractFactoryDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        IHardwareFactory hardwareFactory = null;

        hardwareFactory = new HardwareFactoryHighPrice();

        IProcessor processor = hardwareFactory.ProcessorModel();
        IRAM ram = hardwareFactory.RAMModel();

        processor.IntegrateProcessor();
        ram.IntegrateRAM();

        System.out.println("-----------------------");

        hardwareFactory = new HardwareFactoryLowPrice();

        processor = hardwareFactory.ProcessorModel();
        ram = hardwareFactory.RAMModel();

        processor.IntegrateProcessor();
        ram.IntegrateRAM();
	}

}

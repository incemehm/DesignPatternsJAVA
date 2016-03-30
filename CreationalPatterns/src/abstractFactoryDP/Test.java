package abstractFactoryDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IHardwareFactory hardwareFactory = null;

        hardwareFactory = new HighPerformanceHardwareFactory();

        IProcessor processor = hardwareFactory.ProcessorModel();
        IRam ram = hardwareFactory.RAMModel();
        IHdd hdd = hardwareFactory.HDDModel();

        processor.IntegrateProcessor();
        ram.IntegrateRAM();
        hdd.IntegrateHDD();

        System.out.println("-----------------------");

        hardwareFactory = new FairPriceHardwareFactory();

        processor = hardwareFactory.ProcessorModel();
        ram = hardwareFactory.RAMModel();
        hdd = hardwareFactory.HDDModel();

        processor.IntegrateProcessor();
        ram.IntegrateRAM();
        hdd.IntegrateHDD();

	}

}

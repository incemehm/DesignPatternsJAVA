package mementoDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WindowsStatus status = new WindowsStatus(true, "White");
        ComputerMemory memory = new ComputerMemory();
        memory.WindowsState = status.Save();
        System.out.println(status.theme);

        status.isActive = false;
        status.theme = "Black";
        System.out.println(status.theme);

        status.Restore(memory.WindowsState);
        System.out.println(status.theme);
	}

}

package commandDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = new Robot();

		ICommand forwardCommand = new ForwardCommand(robot);
		ICommand backCommand = new BackCommand(robot);
		ICommand rightCommand = new RightCommand(robot);
		ICommand leftCommand = new LeftCommand(robot);

		RemoteControl remoteControl = new RemoteControl();

		System.out.println("Robot coordinates: X => " + robot.PositionX + ", Y => " + robot.PositionY);

		remoteControl.AddCommand(forwardCommand);
		remoteControl.AddCommand(rightCommand);
		remoteControl.AddCommand(forwardCommand);
		remoteControl.AddCommand(rightCommand);
		remoteControl.AddCommand(backCommand);
		remoteControl.AddCommand(leftCommand);
		remoteControl.AddCommand(forwardCommand);

		remoteControl.ExecuteCommands();

		System.out.println("Robot coordinates: X => " + robot.PositionX + ", Y => " + robot.PositionY);


	}

}

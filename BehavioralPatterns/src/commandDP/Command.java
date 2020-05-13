package commandDP;

class ForwardCommand implements ICommand {

	private Robot robot;

	public ForwardCommand(Robot robot)
	{
		this.robot = robot;
	}
     
	@Override
	public void Move(int unit) {
		robot.PositionX += unit;
		System.out.println("Robot has moved forward " + unit + " unit");
	}
}

class BackCommand implements ICommand {

	private Robot robot;

	public BackCommand(Robot robot)
	{
		this.robot = robot;
	}

	@Override
	public void Move(int unit) {
		robot.PositionX -= unit;
		System.out.println("Robot has moved back " + unit + " unit");
	}
}

class RightCommand implements ICommand {

	private Robot robot;

	public RightCommand(Robot robot)
	{
		this.robot = robot;
	}

	@Override
	public void Move(int unit) {
		robot.PositionY += unit;
		System.out.println("Robot has moved right " + unit + " unit");
	}
}

class LeftCommand implements ICommand {

	private Robot robot;

	public LeftCommand(Robot robot)
	{
		this.robot = robot;
	}

	@Override
	public void Move(int unit) {
		robot.PositionY -= unit;
		System.out.println("Robot has moved left " + unit + " unit");
	}
}
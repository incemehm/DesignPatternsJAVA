package commandDP;

class ForwardCommand implements ICommand {

	private Robot robot;

	public ForwardCommand(Robot robot)
	{
		this.robot = robot;
	}
     
	@Override
	public void Move() {
		robot.PositionX += 1;
		System.out.println("Robot has moved forward");
	}
}

class BackCommand implements ICommand {

	private Robot robot;

	public BackCommand(Robot robot)
	{
		this.robot = robot;
	}

	@Override
	public void Move() {
		robot.PositionX -= 1;
		System.out.println("Robot has moved back");
	}
}

class RightCommand implements ICommand {

	private Robot robot;

	public RightCommand(Robot robot)
	{
		this.robot = robot;
	}

	@Override
	public void Move() {
		robot.PositionY += 1;
		System.out.println("Robot has moved right");
	}
}

class LeftCommand implements ICommand {

	private Robot robot;

	public LeftCommand(Robot robot)
	{
		this.robot = robot;
	}

	@Override
	public void Move() {
		robot.PositionY -= 1;
		System.out.println("Robot has moved left");
	}
}
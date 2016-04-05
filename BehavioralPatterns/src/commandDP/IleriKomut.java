package commandDP;

public class IleriKomut implements IKomut {

	private Robot  robot;

    public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public IleriKomut(Robot robot_)
    {
        setRobot(robot_);
    }
    
	@Override
	public void HareketEt(int birim) {
		robot.Position += birim; 
       System.out.println(birim +" birim ileri hareket etti");

	}

}

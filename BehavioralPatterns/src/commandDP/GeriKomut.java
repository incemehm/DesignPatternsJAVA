package commandDP;

public class GeriKomut implements IKomut {

	 private Robot  robot;

     public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public GeriKomut(Robot robot_)
     {
         this.setRobot(robot_);
     }
     
	@Override
	public void HareketEt(int birim) {
		robot.Position -= birim; 
       System.out.println(birim +" birim geri hareket etti");

	}

}

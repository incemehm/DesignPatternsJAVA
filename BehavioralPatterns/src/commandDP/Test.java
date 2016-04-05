package commandDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = new Robot();
        UzaktanKumanda kumanda = new UzaktanKumanda(new IleriKomut(robot), new GeriKomut(robot));
        kumanda.IleriGit(5);
        kumanda.GeriGit(3);
        kumanda.IleriGit(8);

	}

}

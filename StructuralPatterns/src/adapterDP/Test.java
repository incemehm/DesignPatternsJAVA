package adapterDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Priz priz = new Priz();
        priz.Connect();

        priz = new PrizAdapter();
        priz.Connect();

	}

}

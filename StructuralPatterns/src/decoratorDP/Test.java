package decoratorDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 IMakarna makarna = new SadeMakarna();
         makarna.ServisEt();

         makarna = new SosluMakarna(new SadeMakarna());
         makarna.ServisEt();

         makarna = new PeynirliMakarna(new SadeMakarna());
         makarna.ServisEt();

         makarna = new PeynirliMakarna(new SosluMakarna(new SadeMakarna()));
         makarna.ServisEt();

	}

}

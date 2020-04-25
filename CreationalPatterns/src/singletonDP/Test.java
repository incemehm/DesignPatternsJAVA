package singletonDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Vodafone line = Vodafone.GetInstance();
         String name = line.GetName();
         int number = line.GetNumber();

         System.out.println("Name: " + name + ", number: " + number);

         VodafoneLazy lineLazy = VodafoneLazy.GetInstance();
         String name2 = lineLazy.GetName();
         int number2 = lineLazy.GetNumber();

         System.out.println("Name: " + name2 + ", number: " + number2);

	}

}

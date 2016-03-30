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

	}

}

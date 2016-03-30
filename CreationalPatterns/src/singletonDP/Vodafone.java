package singletonDP;

public class Vodafone {
	 private static Vodafone _line = new Vodafone();
	 private final String _name = "VODAFONE";
     private final int _number = 542;
     
     private Vodafone()
     {
         System.out.println("Vodafone private constructor...");
     }

     public static Vodafone GetInstance()
     {
         return _line;
     }
     public String GetName()
     {
         return _name;
     }
     public int GetNumber()
     {
         return _number;
     }
}

package flyweightDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] harfler =  { "AA", "BA", "BB", "AA", "CC", "FF", "FF", "BB", "CC" };
        NotHavuzu havuz = new NotHavuzu();
        
        for ( final String harf : harfler ) 
		 {
        	Not not = havuz.GetNot(harf);
            not.PrintNot();
		 }

	}

}

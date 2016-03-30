package flyweightDP;

public class Not {
	private String harf;

    public Not(String harf)
    {
        this.harf = harf;
    }
    
    public void PrintNot()
    {
        switch (harf)
        { 
            case "AA":
                System.out.println("HARF NOTU:" + harf + " RAKAM: 4.00");
                break;
            case "BA":
            	System.out.println("HARF NOTU:" + harf + " RAKAM: 3.50");
                break;
            case "BB":
            	System.out.println("HARF NOTU:" + harf + " RAKAM: 3.00");
                break;
            case "CB":
            	System.out.println("HARF NOTU:" + harf + " RAKAM: 2.50");
                break;
            case "CC":
            	System.out.println("HARF NOTU:" + harf + " RAKAM: 2.00");
                break;
            case "FF":
            	System.out.println("HARF NOTU:" + harf + " RAKAM: 0.00");
                break;
            default:
                break;


        }
    }
}

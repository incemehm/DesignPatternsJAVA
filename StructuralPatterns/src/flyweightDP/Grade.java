package flyweightDP;

public class Grade {
	private String letter;

    public Grade(String letter)
    {
        this.letter = letter;
    }

    public void Print()
    {
        switch (letter)
        {
            case "AA":
                System.out.println("LETTER GRADE:" + letter + ", in NUMBER: 4.00");
                break;
            case "BA":
                System.out.println("LETTER GRADE:" + letter + ", in NUMBER: 3.50");
                break;
            case "BB":
                System.out.println("LETTER GRADE:" + letter + ", in NUMBER: 3.00");
                break;
            case "CB":
                System.out.println("LETTER GRADE:" + letter + ", in NUMBER: 2.50");
                break;
            case "CC":
                System.out.println("LETTER GRADE:" + letter + ", in NUMBER: 2.00");
                break;
            case "FF":
                System.out.println("LETTER GRADE:" + letter + ", in NUMBER: 0.00");
                break;
            default:
                break;
        }
    }
}

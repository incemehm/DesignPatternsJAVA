package builderDP;

public class House {
	public String ConstructionMasterName;
    public String Color;
    public int Area;
    public int NumberOfRooms;

    public House()
    {
		ConstructionMasterName = "";
		Color = "";
		Area = 0;
		NumberOfRooms = 0;
    }

    @Override
    public String toString()
    {
        return "House [ConstructionMasterName=" + ConstructionMasterName + ", Color=" + Color + ", Area=" + Area + ", NumberOfRooms=" + NumberOfRooms + "]";
    }
}

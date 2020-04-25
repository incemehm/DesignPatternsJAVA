package builderDP;

public abstract class ConstructionMaster {
    protected House house;

    public House GetHouse()
    {
        return house;
    }

    public abstract void setColor();

    public abstract void setArea();

    public abstract void setNumberOfRooms();
}

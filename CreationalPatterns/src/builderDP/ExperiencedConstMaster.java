package builderDP;

public class ExperiencedConstMaster extends ConstructionMaster {

    public ExperiencedConstMaster()
    {
        house = new House();
        house.ConstructionMasterName = "ExperiencedConstMaster";
    }

    @Override
    public void setColor() {
        house.Color = "White";
    }

    @Override
    public void setArea() {
        house.Area = 120;
    }

    @Override
    public void setNumberOfRooms() {
        house.NumberOfRooms = 5;
    }
}

package builderDP;

public class MidLevelConstMaster extends ConstructionMaster {

    public MidLevelConstMaster()
    {
        house = new House();
        house.ConstructionMasterName = "MidLevelConstMaster";
    }

    @Override
    public void setColor() {
        house.Color = "Gray";
    }

    @Override
    public void setArea() {
        house.Area = 80;
    }

    @Override
    public void setNumberOfRooms() {
        house.NumberOfRooms = 3;
    }
}

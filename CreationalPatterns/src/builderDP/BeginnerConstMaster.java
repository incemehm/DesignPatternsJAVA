package builderDP;

public class BeginnerConstMaster extends ConstructionMaster {

    public BeginnerConstMaster()
    {
        house = new House();
        house.ConstructionMasterName = "BeginnerConstMaster";
    }

    @Override
    public void setColor() {
        house.Color = "Smoke";
    }

    @Override
    public void setArea() {
        house.Area = 50;
    }

    @Override
    public void setNumberOfRooms() {
        house.NumberOfRooms = 1;
    }
}

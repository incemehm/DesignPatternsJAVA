package visitorDP;

public class StandartVisitor implements IVisitor {

	@Override
	public void Visit(Place place)
	{
		if (place instanceof Museum)
			System.out.println("Standart Visitor visited Museum and paid 15 euros");
		else if (place instanceof Gallery)
			System.out.println("Standart Visitor visited Gallery and paid 25 euros");
	}
}

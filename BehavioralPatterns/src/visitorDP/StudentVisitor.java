package visitorDP;

public class StudentVisitor implements IVisitor {

	@Override
	public void Visit(Place place)
	{
		if (place instanceof Museum)
			System.out.println("Student Visitor visited Museum and paid 3 euros");
		else if (place instanceof Gallery)
			System.out.println("Student Visitor visited Gallery and paid 5 euros");
	}
}

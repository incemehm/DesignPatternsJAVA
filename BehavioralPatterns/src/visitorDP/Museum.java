package visitorDP;

public class Museum extends Place {

	@Override
	public void Accept(IVisitor visitor)
	{
		visitor.Visit(this);
	}
}

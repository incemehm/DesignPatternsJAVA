package visitorDP;

public class Gallery extends Place {

	@Override
	public void Accept(IVisitor visitor)
	{
		visitor.Visit(this);
	}
}

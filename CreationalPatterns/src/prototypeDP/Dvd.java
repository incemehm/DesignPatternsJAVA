package prototypeDP;

public class Dvd extends Disc implements Cloneable{
	
	public String Name;
    public Object Content;
    
    public Dvd(String name, Object content)
    {
        Name = name;
        Content = content;
    }

	@Override
	public Disc Clone()
	{	
		try 
		{
		return (Disc) super.clone();
		} 
		catch (final CloneNotSupportedException e ) 
		{
		      return null;
		}
	}
	
	@Override
	public String toString()
    {
        return "DVD [Name=" + Name + ", Content=" + Content + "]";
    }

}

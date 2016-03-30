package prototypeDP;

public class Dvd implements Cloneable, IDisc {
	
	public String Name;
    public Object Content;
    
    public Dvd(String name, Object content)
    {
        Name = name;
        Content = content;
    }

	@Override
	public IDisc Clone() 
	{	
		try 
		{
		return ( IDisc ) super.clone();
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

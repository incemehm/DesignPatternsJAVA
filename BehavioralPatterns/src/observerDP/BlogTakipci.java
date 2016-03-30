package observerDP;

public class BlogTakipci implements ITakipci {

	@Override
	public void Bildir(String tweet) 
	{
		System.out.println("Blog takipçisine tweet iletildi.");
	}

}

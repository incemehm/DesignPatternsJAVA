package proxyDP;

public class RealImage implements IImage {

	@Override
	public void LoadImage() 
	{
		System.out.println("Image is being loaded from disc...");
	}
}

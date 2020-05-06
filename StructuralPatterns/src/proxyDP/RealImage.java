package proxyDP;

public class RealImage implements IImage {

	public RealImage()
	{
		// Load Image From Disc.
		System.out.println("Image is being loaded from disc...");
	}

	@Override
	public void Display()
	{
		System.out.println("Loaded image is being displayed...");
	}
}

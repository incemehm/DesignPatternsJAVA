package proxyDP;

public class VirtualImage implements IImage {

	private IImage image;
	
	@Override
	public void Display()
	{
		if (image == null)
		{
			image = new RealImage();
		}

		image.Display();
	}
}

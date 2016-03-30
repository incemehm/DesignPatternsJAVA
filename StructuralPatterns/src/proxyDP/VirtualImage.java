package proxyDP;

public class VirtualImage implements IImage {

	 private IImage image;
	
	@Override
	public void LoadImage() 
	{
		if (image == null)
        {
            image = new RealImage();
            image.LoadImage();
        }

		System.out.println("Loaded image is being displayed...");
	}

}

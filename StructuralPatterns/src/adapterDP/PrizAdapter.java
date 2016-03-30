package adapterDP;

public class PrizAdapter extends Priz
{
	private IngilizPriz adapted = new IngilizPriz();

	@Override
    public void Connect()
    {
        adapted.Connect3Pin();
    } 
}

package adapterDP;

public class SocketAdapter extends Socket
{
    private EnglishSocket adapted;

    public SocketAdapter(EnglishSocket socket)
    {
        this.adapted = socket;
    }

	@Override
    public void Connect()
    {
        adapted.Connect3Pin();
    } 
}

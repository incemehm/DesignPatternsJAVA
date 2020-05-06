package bridgeDP;

public class LocalDataEngine extends DataEngine {
	
	public LocalDataEngine(IDBConnection dbConn)
	{
		super(dbConn);
	}
	
	@Override
	public void Execute(String query)
    {
		System.out.println("---- Local Data Engine ----");
        super.Execute(query);
    }
	
	@Override
    public void Open(String connStr)
    {
		System.out.println("---- Local Data Engine ----");
		super.Open(connStr);
    }
}

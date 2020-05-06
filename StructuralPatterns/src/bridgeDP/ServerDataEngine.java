package bridgeDP;

public class ServerDataEngine extends DataEngine {

	public ServerDataEngine(IDBConnection dbConn) {
		super(dbConn);
	}

	@Override
	public void Execute(String query)
	{
		System.out.println("---- Server Data Engine ----");
		super.Execute(query);
	}

	@Override
	public void Open(String connStr)
	{
		System.out.println("---- Server Data Engine ----");
		super.Open(connStr);
	}

}

package bridgeDP;

public class Toad extends DBClient {

	public Toad(IDBConnection dbConn) {
		super(dbConn);
	}

	@Override
	public void Execute(String query)
	{
		System.out.println("---- Using Toad by Quest ----");
		dbConnection.ExecuteQuery(query);
	}

	@Override
	public void Open(String connStr)
	{
		System.out.println("---- Using Toad by Quest ----");
		dbConnection.OpenConnection(connStr);
	}

}

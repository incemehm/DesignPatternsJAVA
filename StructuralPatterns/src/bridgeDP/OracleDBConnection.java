package bridgeDP;

public class OracleDBConnection implements IDBConnection {

	@Override
	public void ExecuteQuery(String query)
	{
		System.out.println(query + ", command executed in Oracle DB...");
	}

	@Override
	public void OpenConnection(String connStr)
	{
		System.out.println(connStr + ", connected to Oracle DB...");
	}
}

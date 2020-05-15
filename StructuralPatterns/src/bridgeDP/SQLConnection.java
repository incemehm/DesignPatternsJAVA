package bridgeDP;

public class SQLConnection implements IDBConnection {

	@Override
	public void ExecuteQuery(String query)
	{
		System.out.println(query + ", command executed in MS-SQL DB...");
	}

	@Override
	public void OpenConnection(String connStr)
	{
		System.out.println(connStr + ", connected to MS-SQL DB...");
	}
}

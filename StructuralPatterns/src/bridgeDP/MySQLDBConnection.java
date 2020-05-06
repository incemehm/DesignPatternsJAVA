package bridgeDP;

public class MySQLDBConnection implements IDBConnection {

	@Override
	public void ExecuteQuery(String query)
	{
		System.out.println(query + ", command executed in MySQL DB...");
	}

	@Override
	public void OpenConnection(String connStr)
	{
		System.out.println(connStr + ", connected to MySQL DB...");
	}
}

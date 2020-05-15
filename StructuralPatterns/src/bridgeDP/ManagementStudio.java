package bridgeDP;

public class ManagementStudio extends DBClient {
	
	public ManagementStudio(IDBConnection dbConn)
	{
		super(dbConn);
	}
	
	@Override
	public void Execute(String query)
    {
		System.out.println("---- Using Microsoft SQL Management Studio ----");
		dbConnection.ExecuteQuery(query);
    }
	
	@Override
    public void Open(String connStr)
    {
		System.out.println("---- Using Microsoft SQL Management Studio ----");
		dbConnection.OpenConnection(connStr);
    }
}

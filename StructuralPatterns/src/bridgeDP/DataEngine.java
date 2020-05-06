package bridgeDP;

public abstract class DataEngine {

    protected IDBConnection dbConnection;

    public DataEngine(IDBConnection dbConn)
     {
         dbConnection = dbConn;
     }
    
    public void Execute(String query)
    {
        dbConnection.ExecuteQuery(query);
    }
    public void Open(String connStr)
    {
        dbConnection.OpenConnection(connStr);
    }
}

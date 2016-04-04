package bridgeDP;

public abstract class DataEngine {
	protected IDBConnection dbConnection;
    public DataEngine(IDBConnection dbConn)
    {
        dbConnection = dbConn;
    }
    
    public abstract void Execute(String sql);
    public abstract void Open(String connStr);
}

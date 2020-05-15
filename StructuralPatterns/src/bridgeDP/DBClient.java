package bridgeDP;

public abstract class DBClient {

    protected IDBConnection dbConnection;

    public DBClient(IDBConnection dbConn) {
        dbConnection = dbConn;
    }

    public abstract void Execute(String query);

    public abstract void Open(String connStr);
}

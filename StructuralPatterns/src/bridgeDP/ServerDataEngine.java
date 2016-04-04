package bridgeDP;

public class ServerDataEngine extends DataEngine {

	public ServerDataEngine(IDBConnection dbConn) {
		super(dbConn);
	}

	@Override
	public void Execute(String sql) {
		System.out.println("Serverda komut �al��t�r�l�yor...");
		dbConnection.ExecuteSQL(sql);
	}

	@Override
	public void Open(String connStr) {
		System.out.println("Servera ba�lan�l�yor...");
		dbConnection.OpenConnection(connStr);
		
	}

}

package bridgeDP;

public class ServerDataEngine extends DataEngine {

	public ServerDataEngine(IDBConnection dbConn) {
		super(dbConn);
	}

	@Override
	public void Execute(String sql) {
		System.out.println("Serverda komut çalýþtýrýlýyor...");
		dbConnection.ExecuteSQL(sql);
	}

	@Override
	public void Open(String connStr) {
		System.out.println("Servera baðlanýlýyor...");
		dbConnection.OpenConnection(connStr);
		
	}

}

package bridgeDP;

public class LocalDataEngine extends DataEngine {
	
	public LocalDataEngine(IDBConnection dbConn)
{
		super(dbConn);
}

	@Override
	public void Execute(String sql) {
		System.out.println("Localhostta komut çalýþtýrýlýyor...");
		dbConnection.ExecuteSQL(sql);
		
	}

	@Override
	public void Open(String connStr) {
		System.out.println("Localhosta baðlanýlýyor...");
		dbConnection.OpenConnection(connStr);
	}

}

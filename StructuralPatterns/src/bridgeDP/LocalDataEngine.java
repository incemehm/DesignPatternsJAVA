package bridgeDP;

public class LocalDataEngine extends DataEngine {
	
	public LocalDataEngine(IDBConnection dbConn)
{
		super(dbConn);
}

	@Override
	public void Execute(String sql) {
		System.out.println("Localhostta komut �al��t�r�l�yor...");
		dbConnection.ExecuteSQL(sql);
		
	}

	@Override
	public void Open(String connStr) {
		System.out.println("Localhosta ba�lan�l�yor...");
		dbConnection.OpenConnection(connStr);
	}

}

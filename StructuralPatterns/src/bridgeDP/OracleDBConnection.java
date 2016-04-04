package bridgeDP;

public class OracleDBConnection implements IDBConnection {

	@Override
	public void ExecuteSQL(String sql) {
		System.out.println(sql + " komutu Oracle-Sqlde çalýþtýrýldý...");

	}

	@Override
	public void OpenConnection(String connStr) {
		System.out.println(connStr + " ile Oracle-Sqle baðlandý...");

	}

}

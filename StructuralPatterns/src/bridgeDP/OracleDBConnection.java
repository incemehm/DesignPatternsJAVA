package bridgeDP;

public class OracleDBConnection implements IDBConnection {

	@Override
	public void ExecuteSQL(String sql) {
		System.out.println(sql + " komutu Oracle-Sqlde �al��t�r�ld�...");

	}

	@Override
	public void OpenConnection(String connStr) {
		System.out.println(connStr + " ile Oracle-Sqle ba�land�...");

	}

}

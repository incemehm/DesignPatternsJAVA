package bridgeDP;

public class MsSqlDBConnection implements IDBConnection {

	@Override
	public void ExecuteSQL(String sql) {
		System.out.println(sql + " komutu MsSqlde �al��t�r�ld�...");

	}

	@Override
	public void OpenConnection(String connStr) {
		System.out.println(connStr + " ile MsSqle ba�land�...");

	}

}

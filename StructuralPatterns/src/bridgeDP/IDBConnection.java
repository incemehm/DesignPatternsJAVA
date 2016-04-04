package bridgeDP;

public interface IDBConnection 
{
	 void ExecuteSQL(String sql);
     void OpenConnection(String connStr);
}

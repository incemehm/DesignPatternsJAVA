package bridgeDP;

public interface IDBConnection 
{
	void ExecuteQuery(String query);

    void OpenConnection(String connStr);
}

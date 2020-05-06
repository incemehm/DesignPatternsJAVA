package bridgeDP;

public class Test {

	public static void main(String[] args) {
		DataEngine engine = new LocalDataEngine(new MySQLDBConnection());
        engine.Open("connStr");
        engine.Execute("select * from records");

        engine = new LocalDataEngine(new OracleDBConnection());
        engine.Open("connStr");
        engine.Execute("select * from records");

        engine = new ServerDataEngine(new MySQLDBConnection());
        engine.Open("connStr");
        engine.Execute("select * from records");

        engine = new ServerDataEngine(new OracleDBConnection());
        engine.Open("connStr");
        engine.Execute("select * from records");

	}
}

package bridgeDP;

public class Test {

	public static void main(String[] args) {
        DBClient client = new ManagementStudio(new SQLConnection());
        client.Open("connStr");
        client.Execute("select * from records");


        client = new ManagementStudio(new OracleConnection());
        client.Open("connStr");
        client.Execute("select * from records");

        client = new Toad(new SQLConnection());
        client.Open("connStr");
        client.Execute("select * from records");

        client = new Toad(new OracleConnection());
        client.Open("connStr");
        client.Execute("select * from records");
	}
}

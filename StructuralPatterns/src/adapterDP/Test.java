package adapterDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Socket socket = new Socket();
        socket.Connect();

		EnglishSocket englishSocket = new EnglishSocket();

		socket = new SocketAdapter(englishSocket);
        socket.Connect();
	}
}

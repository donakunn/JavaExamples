import java.io.*;
import java.net.*;

public class Client {

	private static final int PORT=8080;

	public static void main(String [] Args) throws IOException {
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(addr,PORT);
		PrintWriter out;
		BufferedReader in;

		int i = 10;
		int j = 15;

		try {
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);

			in = new BufferedReader(new InputStreamReader((socket.getInputStream())));

			out.println(i);
			out.println(j);
			int k = Integer.valueOf(in.readLine());

			System.out.println("I valori di cui fare la somma sono: " + i + " " + j + " la somma è: " + k);
		} finally {
			socket.close();

		}
	}

}

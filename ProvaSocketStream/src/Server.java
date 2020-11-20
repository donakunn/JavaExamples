import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static final int PORT = 8080;


	public static void main(String [] Args) throws IOException {
		ServerSocket s = new ServerSocket(PORT);
		Socket socket = s.accept();

		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);

			BufferedReader in = new BufferedReader(new InputStreamReader((socket.getInputStream())));
			String st =in.readLine();
			int i = Integer.valueOf(st);
			int j = Integer.valueOf(in.readLine());
			out.println(i +j);
			socket.close();
		}
		finally {
			s.close();
		}
	}
}

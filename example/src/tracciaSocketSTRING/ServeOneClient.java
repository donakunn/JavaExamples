package tracciaSocketSTRING;

import java.net.*;
import java.io.*;

class ServeOneClient extends Thread{

	private Socket socket;
	private PrintWriter out;

	public ServeOneClient(Socket s) throws IOException {
		socket = s;
		out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter((s.getOutputStream()))),true);
		start();
	}

	public void run() {

		try {

			for (int i = 0; i < 10; i++) {
				out.println("test");
			}
		}


		finally {
			try {
				socket.close();
			} catch (IOException e) {
				System.err.println("Unable to close socket");
			}
		}

	}

}

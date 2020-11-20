package tracciaAprileSOCKprimitivi;

import java.net.*;
import java.io.*;

class ServeOneClient extends Thread{
	
	private Socket socket;
	private DataOutputStream out;
	
	public ServeOneClient(Socket s) throws IOException {
		socket = s;
		out = new DataOutputStream(socket.getOutputStream());
		start();
	}
	
	public void run() {
		System.out.println("Dentro");
		
		try {
			
			for (int i = 0; i < 10; i++) {
				out.writeDouble(Math.random());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				System.err.println("Unable to close socket");
			}
		}
		
	}
	
}

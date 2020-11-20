package tracciaAprileSOCKprimitivi;

import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String[] args) throws IOException {
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(addr,8080);
		try {
			DataInputStream  in = new DataInputStream(
					socket.getInputStream());
			for (int i = 0; i < 10; i ++) {
				System.out.println("Valore ricevuto dal server: "+  in.readDouble());
			}
			
		} finally {
			socket.close();
		}
		
	}
	
}
 
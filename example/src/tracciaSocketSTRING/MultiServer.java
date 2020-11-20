package tracciaSocketSTRING;

import java.io.IOException;
import java.net.*;

public class MultiServer {
	static final int PORT = 8080;
	
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(PORT);
		try {
			while (true) {
				Socket socket= s.accept();
				
					try {
						new ServeOneClient(socket);
					} catch (IOException e) {
						socket.close();
					}
				
			}
			
		} finally {
			s.close();
		}
		
	}
}

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements SommaConc {

	protected Server() throws RemoteException {
		super();
	}

	public int Somma(int x, int y) throws RemoteException {
	
		return x+y;
	}

	
	public String Concatena(String s, String t) throws RemoteException {
		
		return s+t;
	}
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		Server serv = new Server();
		Naming.bind("//localhost:8080/Server", serv);
	}

}

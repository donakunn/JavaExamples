import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SommaConc extends Remote{
	int Somma(int x, int y) throws RemoteException;
	String Concatena(String s, String t)  throws RemoteException;

}

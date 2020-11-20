import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.*;

public class Client {
	private void inizializza() throws IOException, NotBoundException {
		JFrame frame = new JFrame("Traccia190717");
		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Operando 1"));
		JTextField op1 = (new JTextField());
		op1.setPreferredSize(new Dimension(50,20));
		c.add(op1);
		c.add(new JLabel("Operando2"));
		JTextField op2 = new JTextField();
		op2.setPreferredSize(new Dimension(50,20));
		c.add(op2);
		c.add(new JLabel("=Risultato"));
		JTextField ris = new JTextField();
		ris.setPreferredSize(new Dimension(50,20));
		c.add(ris);
		JButton somma= new JButton("Somma");
		c.add(somma);
		JButton concatena= new JButton("Concatena");
		c.add(concatena);
		frame.setVisible(true);
		frame.setSize(400,200);

		Server s = (Server)Naming.lookup("//localhost:8080/Server");
		
		somma.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ris.setText(String.valueOf((
							s.Somma(Integer.valueOf(op1.getText()), Integer.valueOf(op2.getText())))));
				} catch (NumberFormatException | RemoteException e1) {
					e1.printStackTrace();
				}

			}

		});
		concatena.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ris.setText(s.Concatena(op1.getText(),op2.getText()));
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
				
			}

		});		


	}
	public static void main(String [] args) {
		Client newCli = new Client();
		try {
			newCli.inizializza();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}



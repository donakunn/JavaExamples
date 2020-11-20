package esempi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A Swing-based dialog class.
 */

public class Dialog1 extends JDialog {
	BorderLayout borderLayout1 = new BorderLayout();
	JPanel jPanel1 = new JPanel();
	JButton jButton1 = new JButton();

	/**
	 * Costruisce una nuova istanza.
	 * @param parent
	 * @param title
	 * @param modal
	 */

	public Dialog1(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		try  {
			jbInit();
			pack();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Costruisce una nuova istanza non-modale e senza genitori e con un titolo in bianco.
	 */
	public Dialog1() {
		this(null, "", false);
	}

	/**
	 * Inizializza lo stato di questa istanza .
	 */

	private void jbInit() throws Exception {
		jPanel1.setLayout(borderLayout1);
		// creo un oggetto istanza di una sottoclasse // di MouseAdapter in cui ridefinisco il  
		// metodo mouseClicked()
		//esempio di classe anonima che è sottoclasse //di java.awt.event.MouseAdapter e per questa //ridefinisce il metodo mouseClicked. //Contestulamente si crea una instanza della //classe anonima

		jPanel1.addMouseListener(new 
				java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jPanel1_mouseClicked(e);
			}
		});
		jButton1.setText("jButton1");
		getContentPane().add(jPanel1);
		jPanel1.add(jButton1, BorderLayout.WEST);
	}

	void jPanel1_mouseClicked(MouseEvent e) {
		// codice per l'evento catturato
	}
	
	public static void main(String[] args) {
		Dialog1 newFin = new Dialog1();
	}
}

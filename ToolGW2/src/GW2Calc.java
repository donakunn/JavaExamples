import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class GW2Calc {
	private JFrame frame;

	private JTextField op1 = new JTextField();


	private JTextField Result = new JTextField();

	private JButton sum = new JButton("Prezzo minimo di vendita");

	public GW2Calc() {
		inizializza();
	}

	private void inizializza() {

		frame = new JFrame("GW2TPCalc");
		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Prezzo"));
		op1.setPreferredSize(new Dimension(50,20));
		Result.setPreferredSize(new Dimension(50,20));
		c.add(op1);
		c.add(new JLabel("= Risultato"));
		c.add(Result);
		c.add(sum);
		sum.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				double op= Float.parseFloat(op1.getText());
				op = (op*250) + (op* 250 * 0.15);
				Result.setText(new DecimalFormat("##.####").format(op));
				
			}

		});

		frame.setSize(300,200);
		frame.setVisible(true);

	}


	public static void main(String[] args) {
		GW2Calc window = new GW2Calc();
		window.frame.setVisible(true);

	}

}
package lab.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class CalcGUI extends JFrame {
	private static final int LARGHEZZA = 400;
	private static final int ALTEZZA= 300;
	
	private JButton[] number;
	private JButton[] special;
	private JLabel output;
	private JButton uguale;
	private JButton mr, mc, mplus, ce;

	public CalcGUI() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(LARGHEZZA, ALTEZZA);
		setTitle("Calcolatrice");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setIconImage(kit.getImage("icon/calcIcon.png"));
		JPanel screen = new JPanel();
		screen.setLayout(new BorderLayout());
		
		output = new JLabel("HELLO!");
		output.setBackground(Color.BLACK);
		output.setFont(new java.awt.Font("Synchro LET",3,36));
		output.setForeground(Color.green);
		output.setHorizontalAlignment(JTextField.RIGHT);
		output.setPreferredSize(new Dimension(70,70));
		output.setOpaque(true);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,5,10,10));
		screen.add(output);
		add(screen, BorderLayout.NORTH);

		number = new JButton[11];
		special = new JButton[4];
		number[7] = new JButton("7");
		buttonPanel.add(number[7]);
		number[8] = new JButton("8");
		buttonPanel.add(number[8]);
		number[9] = new JButton("9");
		buttonPanel.add(number[9]);
		special[0] = new JButton("+");
		buttonPanel.add(special[0]);
		ce = new JButton("CE");
		buttonPanel.add(ce);
		
		number[4] = new JButton("4");
		buttonPanel.add(number[4]);
		number[5] = new JButton("5");
		buttonPanel.add(number[5]);
		number[6] = new JButton("6");
		buttonPanel.add(number[6]);
		special[1] = new JButton("-");
		buttonPanel.add(special[1]);
		mplus = new JButton("M+");
		buttonPanel.add(mplus);
		
		number[1] = new JButton("1");
		buttonPanel.add(number[1]);
		number[2] = new JButton("2");
		buttonPanel.add(number[2]);
		number[3] = new JButton("3");
		buttonPanel.add(number[3]);
		special[2] = new JButton("x");
		buttonPanel.add(special[2]);
		mr = new JButton("MR");
		buttonPanel.add(mr);

		number[0] = new JButton("0");
		buttonPanel.add(number[0]);
		number[10] = new JButton(".");
		buttonPanel.add(number[10]);
		uguale = new JButton("=");
		buttonPanel.add(uguale);
		special[3] = new JButton("/");
		buttonPanel.add(special[3]);
		mc = new JButton("MC");
		buttonPanel.add(mc);

		add(buttonPanel, BorderLayout.CENTER);
	}

	public JButton[] getNumber() {
		return number;
	}

	public JButton[] getSpecial() {
		return special;
	}

	public JLabel getOutput() {
		return output;
	}

	public JButton getUguale() {
		return uguale;
	}

	public JButton getMr() {
		return mr;
	}

	public JButton getMc() {
		return mc;
	}

	public JButton getMplus() {
		return mplus;
	}

	public JButton getCe() {
		return ce;
	}
}

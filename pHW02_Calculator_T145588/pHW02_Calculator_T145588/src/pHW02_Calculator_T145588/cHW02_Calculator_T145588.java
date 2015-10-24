package pHW02_Calculator_T145588;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D.Double;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * Thanh Huynh (T145588)
 *
 */
public class cHW02_Calculator_T145588 extends JFrame {
	// Khai bao texfield, button
	JTextField txt = new JTextField();
	JButton bnto1 = new JButton("1");
	JButton bnto2 = new JButton("2");
	JButton bnto3 = new JButton("3");
	JButton bnto4 = new JButton("4");
	JButton bnto5 = new JButton("5");
	JButton bnto6 = new JButton("6");
	JButton bnto7 = new JButton("7");
	JButton bnto8 = new JButton("8");
	JButton bnto9 = new JButton("9");
	JButton bnto0 = new JButton("0");
	JButton bntp = new JButton(".");
	JButton bntadd = new JButton("+");
	JButton bntsub = new JButton("-");
	JButton bntmulti = new JButton("*");
	JButton bntdiv = new JButton("/");
	JButton bntce = new JButton("CE");
	JButton bnty = new JButton("+/-");
	JButton bntmr = new JButton("MR"), bntmc = new JButton("MC"),
			bntmcong = new JButton("M+"), bntmtru = new JButton("M-"),
			bntac = new JButton("AC");
	JButton bntequa = new JButton("=");
	double num2 = 0, num1 = 0;
	int add = 0, sub = 0, multi = 0, div = 0;
	double c = 0;
	double mC = 0, mT = 0, m = 0;
	int i = 0;

	// add cac button, texfield vao panel
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao frame
		cHW02_Calculator_T145588 wMain = new cHW02_Calculator_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW02_Calculator_T145588() {
		setTitle("Calculator - T145588");// title
		setSize(310, 360);// size
		setLayout(null);// null layout

		// add
		add(txt);
		add(bnto1);
		add(bnto2);
		add(bnto3);
		add(bnto4);
		add(bnto5);
		add(bnto6);
		add(bnto7);
		add(bnto8);
		add(bnto0);
		add(bnto9);
		add(bntp);
		add(bntadd);
		add(bntsub);
		add(bntmulti);
		add(bntdiv);
		add(bnty);
		add(bntmcong);
		add(bntmtru);
		add(bntmc);
		add(bntmr);
		add(bntac);
		add(bntequa);
		add(bntce);

		// set location
		Insets insButton = new Insets(1, 1, 1, 1);
		bntsub.setMargin(insButton);
		bntmulti.setMargin(insButton);
		bntdiv.setMargin(insButton);
		bnty.setMargin(insButton);
		bntadd.setMargin(insButton);
		bntadd.setBounds(90, 245, 55, 32);
		txt.setBounds(30, 40, 235, 30);
		bntsub.setBounds(150, 245, 55, 32);
		bntmulti.setBounds(210, 205, 55, 32);
		bntdiv.setBounds(210, 245, 55, 32);
		bnty.setBounds(90, 285, 55, 32);
		bnto1.setBounds(30, 125, 55, 32);
		bnto2.setBounds(90, 125, 55, 32);
		bnto3.setBounds(150, 125, 55, 32);
		bnto4.setBounds(30, 165, 55, 32);
		bnto5.setBounds(90, 165, 55, 32);
		bnto6.setBounds(150, 165, 55, 32);
		bnto7.setBounds(30, 205, 55, 32);
		bnto8.setBounds(90, 205, 55, 32);
		bnto9.setBounds(150, 205, 55, 32);
		bnto0.setBounds(30, 245, 55, 32);
		bntp.setBounds(30, 285, 55, 32);
		bntmcong.setBounds(90, 85, 55, 32);
		bntmc.setBounds(30, 85, 55, 32);
		bntmtru.setBounds(150, 85, 55, 32);
		bntmr.setBounds(210, 85, 55, 32);
		bntac.setBounds(210, 165, 55, 32);
		bntequa.setBounds(150, 285, 115, 32);
		bntce.setBounds(210, 125, 55, 32);

		// can le phai
		txt.setHorizontalAlignment(JTextField.RIGHT);

		// Create listener
		ActionListener bntall = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// bat su kien cho nut +/-
				if (e.getSource() == bnty) {
					String sTmp = txt.getText();
					try {
						double dTmp = java.lang.Double.parseDouble(sTmp);
						if (dTmp != 0) {
							dTmp = -dTmp;
							txt.setText("" + dTmp);
						}
					} catch (NumberFormatException e1) {
						txt.setText("0");
					}
				}

				// cho phep cong
				if (e.getSource() == bntadd) {
					num1 = java.lang.Double.parseDouble(txt.getText());
					add = 1;
					sub = 0;
					div = 0;
					multi = 0;
					i = 2;

				}

				// cho phep tru
				if (e.getSource() == bntsub) {
					num1 = java.lang.Double.parseDouble(txt.getText());
					add = 0;
					sub = 1;
					multi = 0;
					div = 0;
					i = 2;
				}

				// cho phep nhan
				if (e.getSource() == bntmulti) {
					num1 = java.lang.Double.parseDouble(txt.getText());
					add = 0;
					sub = 0;
					multi = 1;
					div = 0;
					i = 2;

				}

				// cho phep chia
				if (e.getSource() == bntdiv) {
					num1 = java.lang.Double.parseDouble(txt.getText());
					add = 0;
					sub = 0;
					multi = 0;
					div = 1;
					i = 2;

				}

				// bat su kien cho cac nut so
				String val = txt.getText();
				if (e.getSource() == bnto1) {
					if (i == 2) {
						val = "";
						txt.setText(val + "1");
						i = 0;
					} else {
						txt.setText(val + "1");
					}
				}
				if (e.getSource() == bnto2) {

					if (i == 2) {
						val = "";
						txt.setText(val + "2");
						i = 0;
					} else {
						txt.setText(val + "2");
					}
				}
				if (e.getSource() == bnto3) {

					if (i == 2) {
						val = "";
						txt.setText(val + "3");
						i = 0;
					} else {
						txt.setText(val + "3");
					}
				}
				if (e.getSource() == bnto4) {

					if (i == 2) {
						val = "";
						txt.setText(val + "4");
						i = 0;
					} else {
						txt.setText(val + "4");
					}
				}
				if (e.getSource() == bnto5) {
					if (i == 2) {
						val = "";
						txt.setText(val + "5");
						i = 0;
					} else {
						txt.setText(val + "5");
					}
				}
				if (e.getSource() == bnto6) {
					if (i == 2) {
						val = "";
						txt.setText(val + "6");
						i = 0;
					} else {
						txt.setText(val + "6");
					}
				}
				if (e.getSource() == bnto7) {
					if (i == 2) {
						val = "";
						txt.setText(val + "7");
						i = 0;
					} else {
						txt.setText(val + "7");
					}
				}
				if (e.getSource() == bnto8) {
					if (i == 2) {
						val = "";
						txt.setText(val + "8");
						i = 0;
					} else {
						txt.setText(val + "8");
					}
				}
				if (e.getSource() == bnto9) {
					if (i == 2) {
						val = "";
						txt.setText(val + "9");
						i = 0;
					} else {
						txt.setText(val + "9");
					}
				}
				if (e.getSource() == bnto0) {
					if (i == 2) {
						val = "";
						txt.setText(val + "0");
						i = 0;
					} else {
						txt.setText(val + "0");
					}
				}
				// dau cham so thap phan
				if (e.getSource() == bntp) {
					if (i == 2) {

					} else {
						txt.setText(val + ".");
					}
				}

				// xu ly ket qua
				if (e.getSource() == bntequa) {
					num2 = java.lang.Double.parseDouble(txt.getText());
					if (add > 0) {
						c = num1 + num2;
						txt.setText("" + c);

					}
					if (sub > 0) {
						c = num1 - num2;
						txt.setText("" + c);
					}
					if (multi > 0) {
						c = num1 * num2;
						txt.setText("" + c);
					}
					if (div > 0) {
						c = num1 / num2;
						txt.setText("" + c);
					}
				}

				if (e.getSource() == bntmcong) {
					mC = java.lang.Double.parseDouble(txt.getText());

					String x = txt.getText();

					m = m + mC;
					txt.setText("" + m);

				}
			}
		};

		// Nut AC
		bntac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText("");
				num1 = 0;
				num2 = 0;
			}
		});

		// Nut CE
		bntce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText("");
			}
		});

		// add button to listener.
		bnto1.addActionListener(bntall);
		bnto2.addActionListener(bntall);
		bnto3.addActionListener(bntall);
		bnto4.addActionListener(bntall);
		bnto5.addActionListener(bntall);
		bnto6.addActionListener(bntall);
		bnto7.addActionListener(bntall);
		bnto8.addActionListener(bntall);
		bnto9.addActionListener(bntall);
		bntsub.addActionListener(bntall);
		bntmulti.addActionListener(bntall);
		bntdiv.addActionListener(bntall);
		bnty.addActionListener(bntall);
		bntmc.addActionListener(bntall);
		bnto0.addActionListener(bntall);
		bntequa.addActionListener(bntall);
		bntac.addActionListener(bntall);
		bntadd.addActionListener(bntall);
		bntce.addActionListener(bntall);
		bntmcong.addActionListener(bntall);
		bntp.addActionListener(bntall);
	}
}
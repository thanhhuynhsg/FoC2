/**
 * 
 */
package pWE07_Control_T145588;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cPro01_Calculator_T145588 extends JFrame {
	int x1, y1, x2, y2, x3, y3, x4, y4;
	int w1, h1, w2, h2;
	int P, S;
	JTextField txt1 = new JTextField(), txt2 = new JTextField(),
			txt3 = new JTextField(), txt4 = new JTextField(),
			txt5 = new JTextField(), txt6 = new JTextField(),
			txt7 = new JTextField(), txt8 = new JTextField();
	JLabel lbl1 = new JLabel("x1 , y1 :"), lbl2 = new JLabel("x2 , y2 :"),
			lbl3 = new JLabel("x3 , y3 :"), lbl4 = new JLabel("x4 , y4 :");
	JButton btn1 = new JButton("Tính");
	JButton btn2 = new JButton("Clear");
	JTextArea a = new JTextArea();
	JScrollPane b = new JScrollPane(a);

	public static void main(String[] args) {
		cPro01_Calculator_T145588 wMain = new cPro01_Calculator_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cPro01_Calculator_T145588() {
		setTitle("Calculator");
		setSize(300, 300);
		setLayout(null);
		add(btn1);
		add(btn2);
		btn1.setBounds(10, 130, 100, 25);
		btn2.setBounds(120, 130, 100, 25);
		add(b);
		b.setBounds(10, 160, 200, 100);
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(txt6);
		add(txt7);
		add(txt8);
		lbl1.setBounds(10, 10, 50, 25);
		lbl2.setBounds(10, 40, 50, 25);
		lbl3.setBounds(10, 70, 50, 25);
		lbl4.setBounds(10, 100, 50, 25);
		txt1.setBounds(55, 10, 50, 25);
		txt2.setBounds(105, 10, 50, 25);
		txt3.setBounds(55, 40, 50, 25);
		txt4.setBounds(105, 40, 50, 25);
		txt5.setBounds(55, 70, 50, 25);
		txt6.setBounds(105, 70, 50, 25);
		txt7.setBounds(55, 100, 50, 25);
		txt8.setBounds(105, 100, 50, 25);
		ActionListener all = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					x1 = Integer.parseInt(txt1.getText());
					y1 = Integer.parseInt(txt2.getText());
					x2 = Integer.parseInt(txt3.getText());
					y2 = Integer.parseInt(txt4.getText());
					x3 = Integer.parseInt(txt5.getText());
					y3 = Integer.parseInt(txt6.getText());
					x4 = Integer.parseInt(txt7.getText());
					y4 = Integer.parseInt(txt8.getText());
					w1 = x2 - x1;
					w2 = x4 - x3;
					h1 = y3 - y1;
					h2 = y4 - y2;
					if (h1 != h2 || w1 != w2) {
						a.append("Loi" + "\n");
					} else {
						P = (w1 + h1) * 2;
						S = w1 * h1;
						a.append("P = :" + P + "\n");
						a.append("S = :" + S + "\n");

					}

				} catch (NumberFormatException exception) {
					a.append("Loi" + "\n");
				}

			
			if (e.getSource() == btn2){
				a.setText("");
				}
			}
		};
		btn1.addActionListener(all);
		btn2.addActionListener(all);

	}
}

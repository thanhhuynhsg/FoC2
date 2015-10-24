/**
 * 
 */
package pWE05_Control_T145588;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cPro01_Control_T145588 extends JFrame {

	JButton bnt1 = new JButton("Left"), bnt2 = new JButton("Right"),
			bnt3 = new JButton("Up"), bnt4 = new JButton("Down"),
			bnt5 = new JButton();
	int x1 = 150, y1 = 150;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro01_Control_T145588 wMain = new cPro01_Control_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cPro01_Control_T145588() {
		setTitle("Control - T145588");
		setSize(250, 250);
		setLayout(null);
		Insets insButton = new Insets(1, 1, 1, 1);
		add(bnt1);
		add(bnt2);
		add(bnt3);
		add(bnt4);
		add(bnt5);
		bnt1.setMargin(insButton);
		bnt2.setMargin(insButton);
		bnt3.setMargin(insButton);
		bnt4.setMargin(insButton);
		bnt1.setBounds(10, 10, 45, 30);
		bnt2.setBounds(60, 10, 45, 30);
		bnt3.setBounds(110, 10, 45, 30);
		bnt4.setBounds(160, 10, 45, 30);
		bnt5.setBounds(150, 150, 30, 30);
		bnt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changebnt5();
			}

			private void changebnt5() {
				bnt5.setBounds(x1, y1, 30, 30);
				x1 = x1 - 10;
			}
		});
		bnt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changebnt4();
			}

			private void changebnt4() {
				bnt5.setBounds(x1, y1, 30, 30);
				x1 = x1 + 10;
			}
		});
		bnt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changebnt3();
			}

			private void changebnt3() {
				bnt5.setBounds(x1, y1, 30, 30);
				y1 = y1 - 10;
			}
		});
		bnt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changebnt4();
			}

			private void changebnt4() {
				bnt5.setBounds(x1, y1, 30, 30);
				y1 = y1 + 10;
			}
		});

	}
}
package pWE06_Control_T145588;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * Thanh Huynh (T145588)
 *
 */
public class cPro01_Control_T145588 extends JFrame {
	JButton bnt1 = new JButton("Up"), bnt2 = new JButton("Left"),
			bnt3 = new JButton("Right"), bnt4 = new JButton("Down");

	int x = 140, y = 70;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro01_Control_T145588 wMain = new cPro01_Control_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cPro01_Control_T145588() {
		setTitle("Control - T145588");
		setSize(500, 500);
		setLayout(null);
		add(bnt1);
		add(bnt2);
		add(bnt3);
		add(bnt4);

		bnt1.setBounds(230, 200, 50, 100);
		bnt2.setBounds(130, 300, 100, 30);
		bnt3.setBounds(280, 300, 100, 30);
		Insets abc = new Insets(1, 1, 1, 1);
		bnt4.setMargin(abc);
		bnt4.setBounds(230, 330, 50, 100);

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == bnt3) {
					x = x + 10;
				}
				if (e.getSource() == bnt2) {
					x = x - 10;
				}
				if (e.getSource() == bnt4) {
					y = y + 10;
				}
				if (e.getSource() == bnt1) {
					y = y - 10;
				}
				repaint();
			}
		};
		bnt1.addActionListener(action);
		bnt2.addActionListener(action);
		bnt3.addActionListener(action);
		bnt4.addActionListener(action);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(x, y, 200, 40);
	}

}

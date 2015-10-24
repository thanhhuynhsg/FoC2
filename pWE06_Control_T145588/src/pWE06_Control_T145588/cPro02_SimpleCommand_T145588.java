/**
 * 
 */
package pWE06_Control_T145588;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cPro02_SimpleCommand_T145588 extends JFrame {
	JButton btn1 = new JButton(), btn2 = new JButton("GO");
	JTextField txt1 = new JTextField();

	public cPro02_SimpleCommand_T145588() {
		setSize(300, 300);
		setTitle("Simple Command Line - T145588");
		setLayout(null);
		add(btn1);
		add(btn2);
		add(txt1);

		btn1.setBounds(130, 100, 25, 25);
		txt1.setBounds(10, 230, 200, 25);
		btn2.setBounds(220, 230, 60, 25);

		ActionListener GO = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == btn2) {
					chucnang(txt1.getText(), btn1);
				}
			}
		};
		btn2.addActionListener(GO);
	}

	public void chucnang(String s, JButton btn) {
		Rectangle Rect = btn.getBounds();
		try {
			String[] A = s.split(" +");
			int x = Integer.parseInt(A[1]);
			if (A[0].equals("moveLeft")) {
				Rect.x -= x;
			} else if (A[0].equals("moveRight")) {
				Rect.x += x;
			} else if (A[0].equals("moveUp")) {
				Rect.y -= x;
			} else if (A[0].equals("moveDown")) {
				Rect.y += x;
			} else {
				System.out.println("Error");
			}
			btn.setBounds(Rect);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cPro02_SimpleCommand_T145588 wMain = new cPro02_SimpleCommand_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

}

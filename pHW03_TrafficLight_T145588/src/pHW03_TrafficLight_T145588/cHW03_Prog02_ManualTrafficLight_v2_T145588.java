/**
 * 
 */
package pHW03_TrafficLight_T145588;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog02_ManualTrafficLight_v2_T145588 extends JFrame {

	cHW03_Prog02_ManualTrafficLight_v2_T145588_Panel a = new cHW03_Prog02_ManualTrafficLight_v2_T145588_Panel();

	JButton btn1 = new JButton("RED"), btn2 = new JButton("YELLOW"),
			btn3 = new JButton("GREEN");// JButton

	int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW03_Prog02_ManualTrafficLight_v2_T145588 wMain = new cHW03_Prog02_ManualTrafficLight_v2_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW03_Prog02_ManualTrafficLight_v2_T145588() {
		// set
		setTitle("Traffic Light - T145588");
		setSize(300, 400);
		setLayout(null);
		// add
		add(btn1);
		add(btn2);
		add(btn3);
		add(a);
		// set location
		btn1.setMargin(new Insets(1, 1, 1, 1));
		btn2.setMargin(new Insets(1, 1, 1, 1));
		btn3.setMargin(new Insets(1, 1, 1, 1));
		btn1.setBounds(10, 10, 60, 30);
		btn2.setBounds(75, 10, 60, 30);
		btn3.setBounds(140, 10, 60, 30);
		a.setBounds(50, 10, 100, 350);

		// Action Listener
		ActionListener all = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) {
					a.red();
					repaint();
				}
				if (e.getSource() == btn2) {
					a.Green();
					x = 3;
					repaint();
				}
				if (e.getSource() == btn3) {
					a.yellow();
					x = 2;
					repaint();
				}
			}
		};
		btn1.addActionListener(all);
		btn2.addActionListener(all);
		btn3.addActionListener(all);
	}
}

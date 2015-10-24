/**
 * 
 */
package pHW03_TrafficLight_T145588;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog02_ManualTrafficControl_v2_T145588 extends JFrame {

	cHW03_Prog02_ManualTrafficControl_v2_T145588_Panel a = new cHW03_Prog02_ManualTrafficControl_v2_T145588_Panel();

	JLabel Gt = new JLabel("Red Time"), Rt = new JLabel("Green Time"),
			Yt = new JLabel("Yellow Time"); // JLabel
	JTextField sG = new JTextField(), sR = new JTextField(),
			sY = new JTextField(); // JTextField

	ImageIcon icon1 = new ImageIcon("IMG/Untitled.png"), icon2 = new ImageIcon(
			"IMG/Untitled1.png"), icon3 = new ImageIcon("IMG/Untitled2.png"); // Image

	JLabel lbl1 = new JLabel(icon1);
	JLabel lbl2 = new JLabel(icon2);
	JLabel lbl3 = new JLabel(icon3);

	JButton apply = new JButton("Apply");// JButton

	int gt, rt, yt, c = 0, x = 0, g = 1000;

	public static void main(String[] args) {
		cHW03_Prog02_ManualTrafficControl_v2_T145588 wMain = new cHW03_Prog02_ManualTrafficControl_v2_T145588();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW03_Prog02_ManualTrafficControl_v2_T145588() {
		// set
		setTitle("Manual Traffic Control - T145588 ");
		setSize(250, 400);
		setLayout(null);

		// add
		add(sR);
		add(sG);
		add(sY);
		add(Gt);
		add(Rt);
		add(Yt);
		add(apply);
		add(a);
		add(lbl1);
		add(lbl2);
		add(lbl3);

		// set location
		Gt.setBounds(10, 10, 80, 20);
		sG.setBounds(100, 10, 50, 20);
		Rt.setBounds(10, 35, 80, 20);
		sR.setBounds(100, 35, 50, 20);
		Yt.setBounds(10, 60, 80, 20);
		sY.setBounds(100, 60, 50, 20);
		apply.setBounds(50, 100, 80, 25);
		a.setBounds(10, 150, 300, 300);

		// add Action Listener
		apply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					gt = Integer.parseInt(sG.getText());
					rt = Integer.parseInt(sR.getText());
					yt = Integer.parseInt(sY.getText());
				} catch (NumberFormatException e2) {
					System.out.print("Loi");
				}
				Timer s = new Timer(g, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						x = x + g;
						if (c == 0) {
							if (x <= gt * 1000) {
								a.redT();
							} else {
								c = 1;
								x = 0;
							}
						}
						if (c == 1) {
							if (x <= rt * 1000) {
								a.greenT();
							} else {
								c = 2;
								x = 0;
							}
						}
						if (c == 2) {
							if (x <= yt * 1000) {
								a.yellowT();
							} else {
								c = 0;
								x = 0;
							}
						}
					}
				});
				s.start();
			}
		});
	}
}

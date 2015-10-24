/**
 * 
 */
package pHW03_TrafficLight_T145588;

import javax.swing.JFrame;

/**
 * @author Thanh Huynh (T145588)
 *
 */
public class cHW03_Prog02_CarAnimation_v2_T145588 extends JFrame {
	cHW03_Prog02_CarAnimation_v2_T145588_Panel light = new cHW03_Prog02_CarAnimation_v2_T145588_Panel();

	public cHW03_Prog02_CarAnimation_v2_T145588() {
		// dat title size layout
		setTitle("Car Animation - T145588");
		setSize(600, 600);
		setLayout(null);
		add(light);
		// them vi tri va chay void cPaint voi 3s delay
		light.setBounds(10, 10, 550, 550);
	}

	public static void main(String[] args) {
		cHW03_Prog02_CarAnimation_v2_T145588 main = new cHW03_Prog02_CarAnimation_v2_T145588();
		main.setDefaultCloseOperation(EXIT_ON_CLOSE);
		main.setVisible(true);
	}

}